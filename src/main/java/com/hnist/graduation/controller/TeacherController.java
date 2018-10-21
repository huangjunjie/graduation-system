package com.hnist.graduation.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.ThesisapplyVo;
import com.hnist.graduation.entity.Thesischeck;
import com.hnist.graduation.serviceimpl.TeacherServiceimpl;

@Controller
@SessionAttributes("TID")
public class TeacherController {

	@Autowired
	private TeacherServiceimpl teacherServiceimpl;
	//流程：登录
	@RequestMapping("tLoginCheck")
	public String Tlogincheck(Teacher teacher,Model model)
	{
		teacher= teacherServiceimpl.TeacherLogin(teacher);
		if(teacher==null)
		{
			model.addAttribute("msg", "用户名、密码错误!!");
			return "redirect:failure.jsp";
		}
		else
		{
			//获取用户名
			//设置临时变量
			Teacherinfo teacherinfo=new Teacherinfo();
			teacherinfo.setTid(teacher.getTid());
			teacherinfo=teacherServiceimpl.GetTeacherinfo(teacherinfo);
			
			//获取选课学生
			//设置临时变量
			Thesisapply thesisapply=new Thesisapply();
			thesisapply.setTid(teacher.getTid());
			thesisapply.setApply(2);
			List<Thesisapply> thesisapplylist=teacherServiceimpl.GetThesisApply(thesisapply);
			List<String> UidList=new  ArrayList<String>();
			for(int i=0;i<thesisapplylist.size();i++)
			{
				UidList.add(thesisapplylist.get(i).getUid());
			}
			
			//一般用户登入
			model.addAttribute("TID",teacher.getTid());
			model.addAttribute("TNAME", teacherinfo.getName());
			model.addAttribute("UIDLIST",UidList);
			//特殊用户登入
			model.addAttribute("CHECKMAN", teacher.getCheckman());
			
			return "/teacher/teacherIndex";
		}
	}
	//流程：个人信息
	@RequestMapping("/tGetTeacherInfo")
	public String PersonInfoController(@ModelAttribute("TID") String tid,Model model)
	{
		//设置临时变量
		Teacherinfo teacherinfo=new Teacherinfo();
		teacherinfo.setTid(tid);
		teacherinfo=teacherServiceimpl.GetTeacherinfo(teacherinfo);
		model.addAttribute("Teacherinfo",teacherinfo);
		return "/teacher/personInfo";
	}
	
	//流程：修改密码
	@RequestMapping("/tJumpUpdatePass")
	public String Tjumpupdatepass()
	{
		return "/teacher/pass";
	}
	//修改密码实现
	@RequestMapping("/tUpdatePass")
	public String setPersonPassController(@ModelAttribute("TID") String tid,@RequestParam("mpass") String mpss,@RequestParam("newpass") String newpass,Model model)
	{
		//验证密码正确性
		Boolean flag=false;
		Teacher teacher=new Teacher();
		teacher.setTid(tid);
		teacher.setPassword(mpss);	
		teacher=teacherServiceimpl.TeacherLogin(teacher);
		
		if(teacher!=null)
		{
			teacher.setPassword(newpass);
			flag=teacherServiceimpl.UpdateTeacherPassword(teacher);
			model.addAttribute("msg", "修改成功！！");
			return "redirect:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "用户名、密码错误!!");
			return "redirect:failure.jsp";
		}
	}
	
	//流程：添加题目
	//跳转
	@RequestMapping("/tJumpAddThesisapply")
	public String Tjumpaddthesisapply()
	{
		return "/teacher/addThesis";
	}
	//添加题目
	@RequestMapping("/tAddThesisapply")
	public String Taddthesisapply(@ModelAttribute("TID")String tid,Thesischeck thesischeck,Model model)
	{
		thesischeck.setTid(tid);
		if(teacherServiceimpl.AddThesisCheck(thesischeck))
		{
			model.addAttribute("msg","添加课题成功！！！");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","添加课题失败！！！");
			return "forward:failure.jsp";
		}
	}
	
	//流程：题目管理
	@RequestMapping("tJumpGetThesisCheck")
	public String Tjumpgetthesischeck(@ModelAttribute("TID")String tid,Model model)
	{
		Thesischeck thesischeck=new Thesischeck();
		thesischeck.setTid(tid);
		List<Thesischeck> thesischeckList=teacherServiceimpl.GetThesisCheck(thesischeck);
		model.addAttribute("ThesischeckList", thesischeckList);
		return "/teacher/thesisManage";
	}
	//删除题目
	@RequestMapping("tDeleteThesisCheck")
	public String Tdeletethesischeck(@RequestParam("ID")Integer id,Model model)
	{
		Thesischeck thesischeck=new Thesischeck();
		thesischeck.setId(id);
		if(teacherServiceimpl.DeleteThesisCheck(thesischeck))
		{
			model.addAttribute("msg","删除成功！！！");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","删除失败！！！");
			return "forward:failure.jsp";
		}
	}
	
	//流程：甄别选题
	@RequestMapping("tJumpThesisApply")
	public String Tjumpthesisapply(@ModelAttribute("TID")String tid,Model model)
	{
		Thesisapply thesisapply=new Thesisapply();
		thesisapply.setTid(tid);
		List<ThesisapplyVo> ThesisapplyVoList=teacherServiceimpl.GetThesisApplyInfo(thesisapply);
		if(ThesisapplyVoList.isEmpty())
		{
			model.addAttribute("msg","列表为空");
			return "forward:failure.jsp";
		}
		else
		{
			model.addAttribute("ThesisapplyVoList", ThesisapplyVoList);
			return "/teacher/choiceThesis";
		}
	}
	//同意
	@RequestMapping("tagreeThesisApply")
	public String Tagreethesisapply(@RequestParam("thid")String thid,@RequestParam("uid")String uid,Model model)
	{
		Thesisapply thesisapply=new Thesisapply();
		thesisapply.setThid(thid);
		thesisapply.setUid(uid);
		thesisapply.setApply(2);
		if(teacherServiceimpl.UpdateThesisApply(thesisapply))
		{
			model.addAttribute("msg","申请已同意");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","申请同意失败");
			return "forward:failure.jsp";
		}
	}
	//不同意
	@RequestMapping("tdisagreeThesisApply")
	public String Tdisagreethesisapply(@RequestParam("thid")String thid,@RequestParam("uid")String uid,Model model)
	{
		Thesisapply thesisapply=new Thesisapply();
		thesisapply.setThid(thid);
		thesisapply.setUid(uid);
		thesisapply.setApply(0);
		if(teacherServiceimpl.UpdateThesisApply(thesisapply))
		{
			model.addAttribute("msg","申请已打回同意");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","申请不同意失败");
			return "forward:failure.jsp";
		}
	}
	
	//流程：题目审核
	@RequestMapping("tJumpThesisCheck")
	public String Tjumpthesischeck(Model model)
	{
		//显示未处理
		List<Thesischeck> thesischecks=teacherServiceimpl.GetThesisCheck(null);
		model.addAttribute("ThesisCheckList", thesischecks);
		return "/teacher/checkThesis";
	}
	//同意
	@RequestMapping("tAgreeThesisCheck")
	public String Tagreethesischeck(@ModelAttribute("TID")String tid, @RequestParam("id")Integer id,@RequestParam("thtitle")String thtitle,Model model)
	{
		Thesischeck thesischeck=new Thesischeck();
		thesischeck.setId(id);
		thesischeck.setCheckd(1);
		thesischeck.setTid(tid);
		thesischeck.setThtitle(thtitle);
		if(teacherServiceimpl.UpdateThesisCheck(thesischeck))
		{
			model.addAttribute("msg","申请同意成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","申请同意失败");
			return "forward:failure.jsp";
		}
	}
	//不同意
	@RequestMapping("tDisagreeThesisCheck")
	public String Tdisagreethesischeck(@ModelAttribute("TID")String tid, @RequestParam("id")Integer id,@RequestParam("thtitle")String thtitle,Model model)
	{
		
		Thesischeck thesischeck=new Thesischeck();
		thesischeck.setId(id);
		thesischeck.setCheckd(2);
		thesischeck.setTid(tid);
		thesischeck.setThtitle(thtitle);
		if(teacherServiceimpl.UpdateThesisCheck(thesischeck))
		{
			model.addAttribute("msg","申请拒绝成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","申请拒绝失败");
			return "forward:failure.jsp";
		}
	}
	
	//任务书管理功能
	@RequestMapping("tJumpGetTask")
	public String Tjumpgettask(@ModelAttribute("TID")String tid,@RequestParam("uid")String uid,Model model)
	{
		Task task=new Task();
		task.setTid(tid);
		task.setUid(uid);
		model.addAttribute("TaskList", teacherServiceimpl.GetTask(task));
		model.addAttribute("uid", uid);
		return"/teacher/taskManage";
	}
	@RequestMapping("tJumpAddTask")
	public String Tjumpaddtask(@RequestParam("uid")String uid,Model model)
	{
		model.addAttribute("uid", uid);
		return "/teacher/addTask";
	}
	
	@RequestMapping("tAddTask")
	public String Taddtask(@ModelAttribute("TID")String tid,Task task,Model model)
	{
		List<Task> tasklist=teacherServiceimpl.GetTask(null);
		task.setTaskid(Integer.toString(tasklist.get(0).getId()+1+90000));
		task.setTid(tid);
		//设置修改时间
		task.setLasttime(teacherServiceimpl.GetDate());
		//发送
		task.setStatus(2);
		if( teacherServiceimpl.AddTask(task))
		{
			model.addAttribute("msg","添加任务书成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","添加任务书失败");
			return "forward:failure.jsp";
		}
	}
	//删除开题报告
	@RequestMapping("tDeleteTask")
	public String Tdeletetask(@RequestParam("id")Integer id,Model model)
	{
		Task task=new Task();
		task.setId(id);
		if(teacherServiceimpl.DeleteTask(task))
		{
			model.addAttribute("msg","删除任务书成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg","删除任务书失败");
			return "forward:failure.jsp";
		}	
	}
}
