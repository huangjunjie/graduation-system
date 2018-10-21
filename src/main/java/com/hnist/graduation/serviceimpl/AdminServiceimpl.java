package com.hnist.graduation.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnist.graduation.entity.Administrator;
import com.hnist.graduation.entity.AdministratorExample;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.StudentExample;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.StudentinfoExample;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.TeacherExample;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.TeacherinfoExample;
import com.hnist.graduation.mapped.AdministratorMapper;
import com.hnist.graduation.mapped.StudentMapper;
import com.hnist.graduation.mapped.StudentinfoMapper;
import com.hnist.graduation.mapped.TeacherMapper;
import com.hnist.graduation.mapped.TeacherinfoMapper;
import com.hnist.graduation.service.AdminService;

@Service
public class AdminServiceimpl implements AdminService{

	@Autowired
	private AdministratorMapper administratorMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private StudentinfoMapper studentinfoMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Autowired
	private TeacherinfoMapper teacherinfoMapper;
	//教务老师登录
    //admin中 Adminid Adminpassword有值
	public Boolean AdminLogin(Administrator admin) {
		// TODO Auto-generated method stub
		//获取example
		AdministratorExample administratorExample=new AdministratorExample();
		AdministratorExample.Criteria criteria=administratorExample.createCriteria();
		//设置变量
		criteria.andAdminidEqualTo(admin.getAdminid());
		criteria.andAdminpasswordEqualTo(admin.getAdminpassword());
		//数据库
		List<Administrator> AdministratorList=administratorMapper.selectByExample(administratorExample);
		if(AdministratorList.isEmpty()||AdministratorList.size()==0)
		{
			return false;
		}
		return true;
	}

	//获取全部学生账号信息
	public List<Student> GetStudentAccount() {
		// TODO Auto-generated method stub	
		return studentMapper.selectByExample(null);
	}

	public List<Student> GetDStudentAccount(String uid) {
		// TODO Auto-generated method stub
		//设置变量
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidLike(uid);
		//执行
		return studentMapper.selectByExample(studentExample);
	}

	public Boolean AddStudentAccount(Student student) {
		// TODO Auto-generated method stub
		int num=studentMapper.insertSelective(student);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean UpdateStudentAcccount(Student student) {
		// TODO Auto-generated method stub
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidEqualTo(student.getUid());
		int num=studentMapper.updateByExampleSelective(student, studentExample);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean DeleteStudentAcccount(Student student) {
		// TODO Auto-generated method stub
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidEqualTo(student.getUid());
		int num=studentMapper.deleteByExample(studentExample);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Studentinfo> GetStudentInfo() {
		// TODO Auto-generated method stub
		return studentinfoMapper.selectByExample(null);	
	}

	public List<Studentinfo> GetDStudentInfo(String uid) {
		// TODO Auto-generated method stub
		StudentinfoExample studentinfoExample=new StudentinfoExample();
		StudentinfoExample.Criteria criteria=studentinfoExample.createCriteria();
		criteria.andUidLike(uid);	
		return studentinfoMapper.selectByExample(studentinfoExample);
	}

	public Boolean AddStudentInfo(Studentinfo studentinfo) {
		// TODO Auto-generated method stub
		int num=studentinfoMapper.insertSelective(studentinfo);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean UpdateStudentInfo(Studentinfo studentinfo) {
		// TODO Auto-generated method stub
		int num=studentinfoMapper.updateByPrimaryKeySelective(studentinfo);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean DeleteStudentInfo(Studentinfo studentinfo) {
		// TODO Auto-generated method stub
		int num=studentinfoMapper.deleteByPrimaryKey(studentinfo.getUid());
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Teacher> GetTeacherAccount() {
		// TODO Auto-generated method stub
		return teacherMapper.selectByExample(null);
	}

	public List<Teacher> GetDTeacherAccount(String tid) {
		// TODO Auto-generated method stub
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTidLike(tid);
		return teacherMapper.selectByExample(teacherExample); 
	}

	public Boolean AddTeacherAccount(Teacher teacher) {
		// TODO Auto-generated method stub
		int num=teacherMapper.insertSelective(teacher);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean UpdateTeacherAcccount(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTidEqualTo(teacher.getTid());
		int num=teacherMapper.updateByExampleSelective(teacher, teacherExample);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean DeleteTeacherAcccount(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTidEqualTo(teacher.getTid());
		int num=teacherMapper.deleteByExample(teacherExample);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Teacherinfo> GetTeacherInfo() {
		// TODO Auto-generated method stub
		return teacherinfoMapper.selectByExample(null);
	}

	public List<Teacherinfo> GetDTeacherInfo(String tid) {
		// TODO Auto-generated method stub
		TeacherinfoExample teacherinfoExample=new TeacherinfoExample();
		TeacherinfoExample.Criteria criteria=teacherinfoExample.createCriteria();
		criteria.andTidLike(tid);
		return teacherinfoMapper.selectByExample(teacherinfoExample);
	}

	public Boolean AddTeacherInfo(Teacherinfo teacherinfo) {
		// TODO Auto-generated method stub
		int num=teacherinfoMapper.insert(teacherinfo);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean UpdateTeacherInfo(Teacherinfo teacherinfo) {
		// TODO Auto-generated method stub
		int num= teacherinfoMapper.updateByPrimaryKeySelective(teacherinfo);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean DeleteTeacherInfo(Teacherinfo teacherinfo) {
		// TODO Auto-generated method stub
		int num=teacherinfoMapper.deleteByPrimaryKey(teacherinfo.getTid());
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean GetOStudentAccount(Student student) {
		// TODO Auto-generated method stub
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidEqualTo(student.getUid());
		criteria.andPasswordEqualTo(student.getPassword());
		List<Student> studentlist=studentMapper.selectByExample(studentExample);
		if(studentlist.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public Boolean GetOTeacherAccount(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTidEqualTo(teacher.getTid());
		criteria.andPasswordEqualTo(teacher.getPassword());
		List<Teacher> teacherList=teacherMapper.selectByExample(teacherExample);
		if(teacherList.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
