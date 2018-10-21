package com.hnist.graduation.service;

import java.util.List;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.Thesis;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.Thesischeck;

public interface TeacherService {
	
	//1.登录验证
	public Teacher TeacherLogin(Teacher teacher);
	
	//2.获取个人信息
	public Teacherinfo GetTeacherinfo(Teacherinfo teacherinfo);
	
	//3.修改密码
	public boolean UpdateTeacherPassword(Teacher teacher);
	
	//4.题目管理
	//4.1添加题目
	public boolean AddThesisCheck(Thesischeck thesischeck);	
	//4.2更新题目(1题目审核状态 2 题目信息)
	public boolean UpdateThesisCheck(Thesischeck thesischeck);
	//4.3删除题目
	public boolean DeleteThesisCheck(Thesischeck thesischeck);
	//4.4获取题目(根据thesischeck判断)
	public List<Thesischeck> GetThesisCheck(Thesischeck thesischeck);
	
	//5.申请管理
	//5.1更新申请状态
	public boolean UpdateThesisApply(Thesisapply thesisapply);
	//5.2获取学生列表(需要连表) 2种查询
	public List<Thesisapply> GetThesisApply(Thesisapply thesisapply);
	
	//6.生成论文存档
	public boolean AddThesis(Thesis thesis);
	//1获取全部
	public List<Thesis> GetThesis(Thesis thesis);
	
	//7.任务书管理
	//7.1添加任务书
	public boolean AddTask(Task task);
	//7.2修改任务书
	public boolean UpdateTask(Task task);
	//7.3删除任务书
	public boolean DeleteTask(Task task);
	//7.4获取任务书
	public List<Task> GetTask(Task task);
	
	//8开题报告管理
	//8.1获取开题报告
	public List<Openreport> GetOpenreport(Openreport openreport);
	//8.2修改开题报告
	public boolean UpdateOpenreport(Openreport openreport); 
}
