package com.hnist.graduation.service;

import java.util.List;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.Thesis;
import com.hnist.graduation.entity.ThesisInfo;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.Thesischeck;

public interface StudentService {

	//1.登录验证
	public Boolean StudentLogin(Student student);
	//2.获取个人信息
	public Studentinfo GetStudentinfo(String uid);
	//3.修改密码
	public boolean writeStudentPassword(Student student);
	//4.获取论文题库
	public List<Thesischeck> GetThsisListLib();
	//5.获取论文教师信息
	public Teacherinfo GetTeacherinfo(String tid);
	//6.论文申请
	public boolean  StudentThsisapply(String uid);
	public List<Thesisapply> StudentChooseThsis(String thid,String tid,String uid);
	//7.查看论文申请
	public List<ThesisInfo> AllStudentThsisapply(String uid);
	public boolean StudentdenyThsis(String uid);
	//8.获取成功申请的论文
	public ThesisInfo GetSuccessThsisListLib(String uid);
	//9.获取任务书
	public Task Gettask(String uid);
	//10.撰写开题报告
	public boolean writeOPenreport(Openreport openreport);
	//11.开题报告管理
	public List<Openreport> GetOpenreport(String uid);
	public Openreport GetOneOpenreport(Integer id);
	public int updateOpenreport(Openreport openreport);
	//12.删除论文申请
	public boolean DelThesisApply(String thid,String uid);
}
