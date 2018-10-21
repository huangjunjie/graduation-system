package com.hnist.graduation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hnist.graduation.entity.Administrator;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.serviceimpl.AdminServiceimpl;

@Controller
public class AdminController {
	
	@Autowired
	private AdminServiceimpl adminServiceimpl;
	
	@RequestMapping("aLoginCheck")
	public String Alogincheck(Administrator administrator,Model model)
	{
		if(adminServiceimpl.AdminLogin(administrator))
		{
			model.addAttribute("adminid", administrator.getAdminid());
			return "/admin/adminIndex";
		}
		else
		{
			model.addAttribute("msg", "用户名、密码错误!!");
			return "redirect:failure.jsp";
		}
	}
	
	//教师账户
	@RequestMapping("aGetAllTAccount")
	public String Agetalltaccount(Model model)
	{
		model.addAttribute("TeacherList", adminServiceimpl.GetTeacherAccount());
		return "/admin/taccount";
	}
	
	@RequestMapping("aGetDerpTAccount")
	public String Agetderptaccount(String tid,Model model)
	{
		model.addAttribute("StudentList",adminServiceimpl.GetDTeacherAccount(tid));
		model.addAttribute("old",tid);
		return "/admin/taccount";
	}
	
	@RequestMapping("aJumpAddTAccount")
	public String Ajumpaddtaccount()
	{
		return "/admin/addtaccount";
	}
	
	@RequestMapping("aAddTAccount")
	public String Ainserttaccount(Teacherinfo teacherinfo,@RequestParam("password") String password,Model model)
	{
		boolean flag=true;
		Teacher teacher=new Teacher();
		teacher.setTid(teacherinfo.getTid());
		teacher.setPassword(password);
		if(!adminServiceimpl.AddTeacherAccount(teacher))
		{
			flag=false;
		}
		if(!adminServiceimpl.AddTeacherInfo(teacherinfo))
		{
			flag=false;
		}
		if(flag==true)
		{
			model.addAttribute("msg", "添加成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "添加错误");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aJumpUpdateTAccount")
	public String Ajumpupdatetaccount(String tid,Model model)
	{
		model.addAttribute("tid", tid);
		return "/admin/updatetaccount";
	}
	
	@RequestMapping("aUpdateTAccount")
	public String Aupdatetaccount(@RequestParam("tid") String tid,@RequestParam("mpass") String mpss,@RequestParam("newpass") String newpass,Model model)
	{
		Teacher teacher=new Teacher();
		teacher.setTid(tid);
		teacher.setPassword(mpss);
		if(adminServiceimpl.GetOTeacherAccount(teacher))
		{
			teacher.setPassword(newpass);
			if(adminServiceimpl.UpdateTeacherAcccount(teacher))
			{
				model.addAttribute("msg", "设置成功");
				return "forward:success.jsp";
			}
			else
			{
				model.addAttribute("msg", "数据库错误");
				return "forward:failure.jsp";
			}
		}
		else
		{
			model.addAttribute("msg", "原密码错误！！！");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aDeleteTAccount")
	public String Adeletetaccount(@RequestParam("tid") String tid,Model model)
	{
		Teacher teacher=new Teacher();
		teacher.setTid(tid);
		if(adminServiceimpl.DeleteTeacherAcccount(teacher))
		{
			model.addAttribute("msg", "删除成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "删除错误");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aDeleteMTAccount")
	public String Adeletemtaccount(String[] tid,Model model)
	{
		//设置临时变量
		Teacher teacher=new Teacher();
		
		for(int i=0;i<tid.length;i++)
		{
			teacher.setTid(tid[i]);
			if(adminServiceimpl.DeleteTeacherAcccount(teacher)==false)
			{
				model.addAttribute("msg", "删除错误");
				return "forward:failure.jsp";
			}
		}
		model.addAttribute("msg", "删除成功");
		return "forward:success.jsp";
	}
	
	//操作教师信息
	@RequestMapping("aGetAllTInfo")
	public String Agetalltinfo(Model model)
	{
		model.addAttribute("TeacherinfoList", adminServiceimpl.GetTeacherInfo());
		return "/admin/tinfo";
	}
	
	@RequestMapping("aGetDerpTInfo")
	public String Agetderptinfo(String tid,Model model)
	{
		model.addAttribute("TeacherinfoList",adminServiceimpl.GetDTeacherInfo(tid));
		model.addAttribute("old",tid);
		return "/admin/tinfo";
	}
	
	@RequestMapping("aJumpAddTInfo")
	public String Ajumpaddtinfo()
	{
		return "";
	}
	
	@RequestMapping("aAddTInfo")
	public String Ainserttinfo()
	{
		return "";
	}
	
	@RequestMapping("aJumpUpdateTInfo")
	public String Ajumpupdatetinfo(String tid,Model model)
	{
		return "";
	}
	
	@RequestMapping("aUpdateTInfo")
	public String Aupdatetinfo()
	{
		return "";
	}
	
	@RequestMapping("aDeleteTInfo")
	public String Adeletetinfo(@RequestParam("tid") String tid,Model model)
	{
		Teacherinfo teacherinfo=new Teacherinfo();
		teacherinfo.setTid(tid);
		if(adminServiceimpl.DeleteTeacherInfo(teacherinfo))
		{
			model.addAttribute("msg", "删除成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "删除错误");
			return "forward:failure.jsp";
		}
	}
	
	
	//学生账户
	@RequestMapping("aGetAllSAccount")
	public String Agetallsaccount(Model model)
	{
		model.addAttribute("StudentList", adminServiceimpl.GetStudentAccount());
		return "/admin/saccount";
	}
	
	@RequestMapping("aGetDerpSAccount")
	public String Agetderpsaccount(String uid,Model model)
	{
		model.addAttribute("StudentList",adminServiceimpl.GetDStudentAccount(uid));
		model.addAttribute("old",uid);
		return "/admin/saccount";
	}
	
	@RequestMapping("aJumpAddSAccount")
	public String Ajumpaddsaccount()
	{
		return "/admin/addsaccount";
	}
	
	@RequestMapping("aAddSAccount")
	public String Ainsertsaccount(Studentinfo studentinfo,@RequestParam("password") String password,Model model)
	{
		boolean flag=true;
		Student student=new Student();
		student.setUid(studentinfo.getUid());
		student.setPassword(password);
		if(!adminServiceimpl.AddStudentAccount(student))
		{
			flag=false;
		}
		if(!adminServiceimpl.AddStudentInfo(studentinfo))
		{
			flag=false;
		}
		if(flag==true)
		{
			model.addAttribute("msg", "添加成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "添加错误");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aJumpUpdateSAccount")
	public String Ajumpupdatesaccount(String uid,Model model)
	{
		model.addAttribute("uid", uid);
		return "/admin/updatesaccount";
	}
	
	@RequestMapping("aUpdateSAccount")
	public String Aupdatesaccount(@RequestParam("uid") String uid,@RequestParam("mpass") String mpss,@RequestParam("newpass") String newpass,Model model)
	{
		//构建结构体
		Student student = new Student();
		student.setUid(uid);
		student.setPassword(mpss);
		if(adminServiceimpl.GetOStudentAccount(student))
		{
			student.setPassword(newpass);
			if(adminServiceimpl.UpdateStudentAcccount(student))
			{
				model.addAttribute("msg", "设置成功");
				return "forward:success.jsp";
			}
			else
			{
				model.addAttribute("msg", "数据库错误");
				return "forward:failure.jsp";
			}
		}
		else
		{
			model.addAttribute("msg", "原密码错误！！！");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aDeleteSAccount")
	public String Adeletesaccount(@RequestParam("uid") String uid,Model model)
	{
		//新建学生用户
		Student student=new Student();
		student.setUid(uid);
		if(adminServiceimpl.DeleteStudentAcccount(student))
		{
			model.addAttribute("msg", "删除成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "删除错误");
			return "forward:failure.jsp";
		}
	}
	
	@RequestMapping("aDeleteMSAccount")
	public String Adeletemsaccount(String[] uid,Model model)
	{
		//设置临时变量
		Student student=new Student();
		
		for(int i=0;i<uid.length;i++)
		{
			student.setUid(uid[i]);
			if(adminServiceimpl.DeleteStudentAcccount(student)==false)
			{
				model.addAttribute("msg", "删除错误");
				return "forward:failure.jsp";
			}
		}
		model.addAttribute("msg", "删除成功");
		return "forward:success.jsp";
	}
	//操作学生信息
	@RequestMapping("aGetAllSInfo")
	public String Agetallsinfo(Model model)
	{
		model.addAttribute("StudentinfoList", adminServiceimpl.GetStudentInfo());
		return "/admin/sinfo";
	}
	
	@RequestMapping("aGetDerpSInfo")
	public String Agetderpsinfo()
	{
		return "";
	}
	
	@RequestMapping("aJumpAddSInfo")
	public String Ajumpaddsinfot()
	{
		return "";
	}
	
	@RequestMapping("aAddSInfo")
	public String Ainsertsinfo()
	{
		return "";
	}
	
	@RequestMapping("aJumpUpdateSInfo")
	public String Ajumpupdatesinfo()
	{
		return "";
	}
	
	@RequestMapping("aUpdateSInfo")
	public String Aupdatesinfo()
	{
		return "";
	}
	
	@RequestMapping("aDeleteSInfo")
	public String Adeletesinfo(@RequestParam("uid") String uid,Model model)
	{
		Studentinfo studentinfo=new Studentinfo();
		studentinfo.setUid(uid);
		if(adminServiceimpl.DeleteStudentInfo(studentinfo))
		{
			model.addAttribute("msg", "删除成功");
			return "forward:success.jsp";
		}
		else
		{
			model.addAttribute("msg", "删除错误");
			return "forward:failure.jsp";
		}
	}
}
