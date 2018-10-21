package com.hnist.graduation.service;

import java.util.List;

import com.hnist.graduation.entity.Administrator;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.Teacherinfo;

public interface AdminService {

	//1.  登入验证
	public Boolean AdminLogin(Administrator admin);
	
	//2.  学生账号
	//2.1  获取全部目录
	public List<Student> GetStudentAccount();
	
	//2.2  获取局部目录
	public List<Student> GetDStudentAccount(String uid);
	
	//2.3  账号添加
	public Boolean AddStudentAccount(Student student);
	
	//2.4  账号修改
	public Boolean UpdateStudentAcccount(Student student);
	
	//2.5 账号消除
	public Boolean DeleteStudentAcccount(Student student);
	
	//2.6 账号存在
	public Boolean GetOStudentAccount(Student student);
	
	//3.  学生信息
	//3.1  获取全部目录
	public List<Studentinfo> GetStudentInfo();
		
	//3.2  获取局部目录
	public List<Studentinfo> GetDStudentInfo(String uid);
		
	//3.3  账号添加
	public Boolean AddStudentInfo(Studentinfo studentinfo);
		
	//3.4  账号修改
	public Boolean UpdateStudentInfo(Studentinfo studentinfo);
		
	//3.5 账号消除
	public Boolean DeleteStudentInfo(Studentinfo studentinfo);
	
	//4.  教师账号
	//4.1  获取全部目录
	public List<Teacher> GetTeacherAccount();
		
	//4.2  获取局部目录
	public List<Teacher> GetDTeacherAccount(String tid);
		
	//4.3  账号添加
	public Boolean AddTeacherAccount(Teacher teacher);
		
	//4.4  账号修改
	public Boolean UpdateTeacherAcccount(Teacher teacher);
		
	//4.5 账号消除
	public Boolean DeleteTeacherAcccount(Teacher teacher);
	
	//4.6 账号存在
	public Boolean GetOTeacherAccount(Teacher teacher);
	
	//5  教师信息
	//5.1  获取全部目录
	public List<Teacherinfo> GetTeacherInfo();
			
	//5.2  获取局部目录
	public List<Teacherinfo> GetDTeacherInfo(String tid);
			
	//5.3  账号添加
	public Boolean AddTeacherInfo(Teacherinfo teacherinfo);
			
	//5.4  账号修改
	public Boolean UpdateTeacherInfo(Teacherinfo teacherinfo);
			
	//5.5 账号消除
	public Boolean DeleteTeacherInfo(Teacherinfo teacherinfo);
}
