package com.hnist.graduation.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.ThesisInfo;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.Thesischeck;
import com.hnist.graduation.serviceimpl.StudentServiceimpl;

@Controller
@SessionAttributes({"UID","TID"})
/*@RequestMapping("/login")*/
public class StudentController {

	@Autowired
	private StudentServiceimpl studentServiceimpl;
	//
	//登录流程	
	@RequestMapping(value="/login")
	public String studentLoginController(Model model,Student student)
	{

		//执行服务
		Boolean flag=studentServiceimpl.StudentLogin(student);
		
		//判断跳转方向
		if(flag==true)
		{
			//添加用户名和id
			Studentinfo userinfo=new Studentinfo();			
			userinfo=studentServiceimpl.GetStudentinfo(student.getUid());
			//添加到视图
			model.addAttribute("UID", student.getUid());
			model.addAttribute("StudentE",student);
			model.addAttribute("StudentinfoE", userinfo);
			return "/student/studentIndex";
		}
		else
			return "redirect:index.jsp";
	}
	//用户管理
	//个人信息
	@RequestMapping("/personInfo")
	public String PersonInfoController(@ModelAttribute("UID") String uid,Model model)
	{
		Studentinfo studentinfo=studentServiceimpl.GetStudentinfo(uid);
		model.addAttribute("Studentinfo",studentinfo);
		return "/student/personInfo";
	}
	//修改密码页面
	@RequestMapping("/updatePass")
	public String PersonPasswordController()
	{
		return "/student/pass";
	}
	//修改密码实现
	@RequestMapping("/passAction")
	public String setPersonPassController(@ModelAttribute("UID") String uid,@RequestParam("mpass") String mpss,@RequestParam("newpass") String newpass)
	{
		//验证密码正确性
		Boolean flag=false;
		Student student=new Student();
		student.setUid(uid);
		student.setPassword(mpss);
		flag=studentServiceimpl.StudentLogin(student);
		if(flag)
		{
			student.setPassword(newpass);
			flag=studentServiceimpl.writeStudentPassword(student);
		}
		//
		if(flag)
		return "success";
		else
		return  "failure"; 
	}
	//选题管理
	//题库
	@RequestMapping("/Bank")
	public String BankController(@ModelAttribute("UID") String uid,Model model)
	{
		List<Thesischeck> thesischecklist=studentServiceimpl.GetThsisListLib();
		model.addAttribute("Thesischecklist", thesischecklist);
		return "/student/Bank";
	}
	//题库操作:选题
	@RequestMapping("/add")
	public String ChoiceThesisController(@ModelAttribute("UID") String uid,@RequestParam("thid") String thid,@RequestParam("tid")String tid,Model model)
	{		//查询是否存在已经选题
		boolean flag =studentServiceimpl.StudentThsisapply(uid);
		
		if(flag==false)
		{
			model.addAttribute("msg","申请论文尚未答复无法选择课题！！！");
			return "forward:failure.jsp";
		}
		List<Thesisapply> Thesisapplylist=studentServiceimpl.StudentChooseThsis(thid,tid,uid);
		if(!Thesisapplylist.isEmpty())
		{
			model.addAttribute("msg","申请论文申请成功，请耐心等待！！！");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","申请论文申请失败，请联系管理员！！！");
			return "forward:failure.jsp";
		}
	}
	
	//选题报表
	@RequestMapping("/operation")
	public String ChoiceThesisOperationController(@ModelAttribute("UID") String uid,Model model)
	{		
		model.addAttribute("ThesisInfo", studentServiceimpl.AllStudentThsisapply(uid));
		return "/student/Operation";
	}
	
	//删除选课
	@RequestMapping("/delthesisapply")
	public String DelThesisApplyController(@ModelAttribute("UID") String uid,@RequestParam("thid") String thid,Model model)
	{
		boolean flag=studentServiceimpl.DelThesisApply(thid, uid);
		if(flag==false)
		{
			model.addAttribute("msg","删除失败！！！");
			return "forward:failure.jsp";
		}
		else
		{
			model.addAttribute("msg","删除成功！！！");
			return "forward:success.jsp";
		}
	}
	//查看成功选课结果
	@RequestMapping("/thesisInfo")
	public String GetSuccessThesisController(@ModelAttribute("UID") String uid,Model model)
	{
		//返回课程信息
		ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
		//查看是否有成功的选课
		if(thesisInfo==null)
		{
			model.addAttribute("msg","申请论文尚未答复无法打开！！！");
			return "forward:failure.jsp";
		}
		model.addAttribute("ThesisInfo", thesisInfo);
		//返回教师信息
		Teacherinfo teacherinfo=studentServiceimpl.GetTeacherinfo(thesisInfo.getThesisapply().getTid());
		model.addAttribute("Teacherinfo", teacherinfo);
		return "/student/ThesisInfo";
	}
	
	
	//开题管理
	//接受任务
	@RequestMapping("receiveTask")
	public String ReceiveTaskContrller(@ModelAttribute("UID") String uid,Model model)
	{
		//预处理--将教师编号固化到Session上
		String tid=stealTid(uid);
		if(tid==null)
		{
			model.addAttribute("msg","请先选课题");
			return "forward:failure.jsp";
		}
		model.addAttribute("TID",tid );
		//处理
		
		Task task=studentServiceimpl.Gettask(uid);
		if(task==null)
		{
			model.addAttribute("msg","无任务");
			return "forward:failure.jsp";
		}
		else
		{
			model.addAttribute("task",task);
			return "/student/receiveTask";
		}
	}
	
	//撰写报告
	//跳转
	@RequestMapping("writeOpen")
	public String writeOpenController(@ModelAttribute("UID") String uid,Model model)
	{
		//预处理
		String tid=stealTid(uid);
		if(tid==null)
		{
			model.addAttribute("msg","请先选课题");
			return "forward:failure.jsp";
		}
		else
		{
			model.addAttribute("TID",tid );
			ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
			model.addAttribute("Thtitle",thesisInfo.getThesischeck().getThtitle());
			return "/student/writeOpen";
		}
	}
	//处理
	@RequestMapping("writeOpendo")
	public String writeOpenDoController(@ModelAttribute("UID") String uid,Model model,
			                            @ModelAttribute("TID") String tid,
										@RequestParam("contenta") String contenta,
										@RequestParam("contentb") String contentb,
										@RequestParam("contentc") String contentc,
										@RequestParam("contentd") String contentd,
										@RequestParam("contente") String contente,
										@RequestParam("contentf") String contentf,
										@RequestParam("remark") String remark,
										@RequestParam("status") Integer status)
	{
//		System.out.println(status);
		//暂存、保存
		//获取论文值
		ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
		//自动生成
		Date date=new Date();
		long date_time=date.getTime();
		String orid=Long.toString(date_time);
		SimpleDateFormat dateformat=new SimpleDateFormat("yy/MM/dd");
		
		//设置临时变量 并进行数据充填
		Openreport openreport=new Openreport();
		openreport.setOrid(orid);
		openreport.setThid(thesisInfo.getThesisapply().getThid());
		openreport.setTid(tid);
		openreport.setUid(uid);
		openreport.setContenta(contenta);
		openreport.setContentb(contentb);
		openreport.setContentc(contentc);
		openreport.setContentd(contentd);
		openreport.setContente(contente);
		openreport.setContentf(contentf);
		openreport.setLasttime(dateformat.format(date));
		openreport.setRemark(remark);
		openreport.setStatus(status);
		
		//处理
		if(studentServiceimpl.writeOPenreport(openreport))
		{
			if(status==1)
			{
				model.addAttribute("msg","暂存成功");
				return "forward:success.jsp";
			}
			else
			{
				model.addAttribute("msg","发送成功");
				return "forward:success.jsp";
			}
		}
		else
		{
			model.addAttribute("msg","操作失败");
			return "forward:failure.jsp";
		}
	}
	
	//报告管理
	//跳转
	@RequestMapping("/reportManage")
	public String reportManageController(@ModelAttribute("UID") String uid,Model model)
	{
		//预处理
		String tid=stealTid(uid);
		if(tid==null)
		{
			model.addAttribute("msg","请先选课题");
			return "forward:failure.jsp";
		}
		else
		{
			model.addAttribute("TID",tid );
			ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
			model.addAttribute("Thtitle",thesisInfo.getThesischeck().getThtitle());
			//获取以往数据
			List<Openreport> openreportlist= studentServiceimpl.GetOpenreport(uid);
			if(openreportlist==null)
			{
				model.addAttribute("msg","获取以往开题报告失败！！！");
				return "forward:failure.jsp";
			}
			else
			{
				model.addAttribute("Openreportlist",openreportlist);
				return "/student/reportManage";
			}
		}		
	}
	//修改
	@RequestMapping("/updatereport")
	public String preupdatereportController(@ModelAttribute("UID") String uid,@RequestParam("id") Integer id,Model model)
	{	
		String tid=stealTid(uid);
		model.addAttribute("TID",tid );
		ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
		model.addAttribute("Thtitle",thesisInfo.getThesischeck().getThtitle());
		//获取数据
		Openreport open=studentServiceimpl.GetOneOpenreport(id);
		model.addAttribute("id", id);
		model.addAttribute("Openreport",open);
		return "/student/updateOpen";
	}
	//修改后
	@RequestMapping("/backupdatereport")
	public String backeupdatereportController(@ModelAttribute("UID") String uid,Model model,
            								  @ModelAttribute("TID") String tid,
            								  @RequestParam("id")Integer id,
            								  @RequestParam("contenta") String contenta,
            								  @RequestParam("contentb") String contentb,
            								  @RequestParam("contentc") String contentc,
            								  @RequestParam("contentd") String contentd,
            								  @RequestParam("contente") String contente,
            								  @RequestParam("contentf") String contentf,
            								  @RequestParam("remark") String remark,
            								  @RequestParam("status") Integer status)
	{
		Date date=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("yy/MM/dd");
		Openreport openreport=new Openreport();
		openreport.setId(id);
		openreport.setContenta(contenta);
		openreport.setContentb(contentb);
		openreport.setContentc(contentc);
		openreport.setContentd(contentd);
		openreport.setContente(contente);
		openreport.setContentf(contentf);
		openreport.setLasttime(dateformat.format(date));
		openreport.setRemark(remark);
		openreport.setStatus(status);
		
		if(studentServiceimpl.updateOpenreport(openreport)==1)
		{
			model.addAttribute("msg","修改成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","修改失败");
			return "forward:failure.jsp"; 
		}
	}
	//发送
	@RequestMapping("/sendreport")
	public String sendreportController(Model model,@RequestParam("id")Integer id)
	{
		Date date=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("yy/MM/dd");
		Openreport openreport=new Openreport();
		openreport.setId(id);
		openreport.setLasttime(dateformat.format(date));
		openreport.setStatus(2);
		if(studentServiceimpl.updateOpenreport(openreport)==1)
		{
			model.addAttribute("msg","修改成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","修改失败");
			return "forward:failure.jsp"; 
		}
	}
	//预览
	@RequestMapping("/browsereport")
	public String browseOridController(Model model,@RequestParam("id")Integer id)
	{
		System.out.println(id);
		model.addAttribute("id", id);
		Openreport openreport=studentServiceimpl.GetOneOpenreport(id);
		model.addAttribute("Openreport", openreport);	
		return "/student/readOpen";
	}
	//ajax 申请
	@RequestMapping("/json")
	@ResponseBody
	public Map<String,Object> AjaxTeacherController(@RequestBody String tid)
	{
		tid=(tid.split("="))[1];
		Map<String,Object> result=new HashMap<String,Object>();
		Teacherinfo teacherinfo=studentServiceimpl.GetTeacherinfo(tid);
		result.put("tid", (teacherinfo.getTid()));
		result.put("name",(teacherinfo.getName()));
		result.put("deparment", (teacherinfo.getDepartment()));
		result.put("email", (teacherinfo.getEmail()));
		return result;
	}
	
	
	//内部预处理函数 --固化 TID
	private String stealTid(String uid)
	{
		ThesisInfo thesisInfo=studentServiceimpl.GetSuccessThsisListLib(uid);
		if(thesisInfo==null)
		{
			return null;
		}
		else
		{
			return thesisInfo.getThesisapply().getTid();
		}
		
	}
	
	

}
