package com.hnist.graduation.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.OpenreportExample;
import com.hnist.graduation.entity.Student;
import com.hnist.graduation.entity.StudentExample;
import com.hnist.graduation.entity.Studentinfo;
import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.TaskExample;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.ThesisInfo;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.ThesisapplyExample;
import com.hnist.graduation.entity.ThesisapplyKey;
import com.hnist.graduation.entity.Thesischeck;
import com.hnist.graduation.entity.ThesischeckExample;
import com.hnist.graduation.mapped.OpenreportMapper;
import com.hnist.graduation.mapped.RelationMapper;
import com.hnist.graduation.mapped.StudentMapper;
import com.hnist.graduation.mapped.StudentinfoMapper;
import com.hnist.graduation.mapped.TaskMapper;
import com.hnist.graduation.mapped.TeacherinfoMapper;
import com.hnist.graduation.mapped.ThesisapplyMapper;
import com.hnist.graduation.mapped.ThesischeckMapper;
import com.hnist.graduation.service.StudentService;

/**
 * @author Administrator
 *
 */
@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private StudentinfoMapper studentinfoMapper;
	@Autowired
	private ThesischeckMapper thesischeckMapper;
	@Autowired
	private ThesisapplyMapper thesisapplyMapper;
	@Autowired
	private RelationMapper relationMapper;
	@Autowired
	private TeacherinfoMapper teacherinfoMapper;
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private OpenreportMapper openreportMapper;
	/**
	 *   登录
	 */
	@Transactional 
	public Boolean StudentLogin(Student record) {
		// TODO Auto-generated method stub
		//定义临时变量־
		Boolean flag=false;

//		测试类
//		studentMapper.insert(record);
		//设定临时变量
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidEqualTo(record.getUid());
		criteria.andPasswordEqualTo(record.getPassword());
		//使用学生类完成mapped
		List<Student> studentlist=studentMapper.selectByExample(studentExample);
		//判定是否存在用户
		if(!studentlist.isEmpty())
		{
			flag=true;
		}
		return flag;
	}


	public Studentinfo GetStudentinfo(String uid) {

		//使用学生类完成mapped
		
		Studentinfo studentinfo=studentinfoMapper.selectByPrimaryKey(uid);
		
		return studentinfo ;
	}

	public boolean writeStudentPassword(Student student) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//设定临时变量
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andUidEqualTo(student.getUid());
		if(studentMapper.updateByExampleSelective(student, studentExample)==1)
		{
			flag= true;
		}
		return flag;
	}

	public List<Thesischeck> GetThsisListLib() {
		// TODO Auto-generated method stub
		return thesischeckMapper.selectByExample(null);
	}

	public Teacherinfo GetTeacherinfo(String tid) {
		// TODO Auto-generated method stub
		Teacherinfo teacherinfo=new Teacherinfo();
		teacherinfo=teacherinfoMapper.selectByPrimaryKey(tid);
		return teacherinfo;
		
	}

	public List<Thesisapply> StudentChooseThsis(String thid,String tid,String uid) {
		// TODO Auto-generated method stub
		Thesisapply record=new Thesisapply();
		record.setThid(thid);
		record.setTid(tid);
		record.setUid(uid);
		record.setApply(1);
		thesisapplyMapper.insert(record);
		
		//设定临时变量
		ThesisapplyExample thesisapplyExample=new ThesisapplyExample();
		ThesisapplyExample.Criteria criteria=thesisapplyExample.createCriteria();
	    criteria.andThidEqualTo(thid);
	    criteria.andUidEqualTo(uid);
		return thesisapplyMapper.selectByExample(thesisapplyExample);
		
	}

	public boolean StudentdenyThsis(String uid) {
		// TODO Auto-generated method stub
		return false;
	}

	//获取成功的信息
	public ThesisInfo GetSuccessThsisListLib(String uid) {
		// TODO Auto-generated method stub
		//设置临时变量
		ThesisInfo thesisInfo=new ThesisInfo();
		
		//寻找申请表
		//设置临时变量
		ThesisapplyExample thesisapplyExample=new ThesisapplyExample();
		ThesisapplyExample.Criteria criteria_apply=thesisapplyExample.createCriteria();
		criteria_apply.andUidEqualTo(uid);//选定学号
		criteria_apply.andApplyEqualTo(2);//选定同意
		List<Thesisapply> thesisapplylist=thesisapplyMapper.selectByExample(thesisapplyExample);
		if(thesisapplylist.isEmpty())
		{
			return null;
		}
		else
		{
			//获取申请
			//设置临时变量
			Thesisapply thesisapply= thesisapplylist.get(0);
			thesisInfo.setThesisapply(thesisapply);
			//获取课题检查表
			//设置临时变量
			ThesischeckExample thesischeckExample=new ThesischeckExample();
			ThesischeckExample.Criteria criteria_check=thesischeckExample.createCriteria();
			criteria_check.andThidEqualTo(thesisapply.getThid());
			List<Thesischeck> thesischecklist=thesischeckMapper.selectByExample(thesischeckExample);
			if(thesischecklist.isEmpty())
			{
				return null;
			}
			else
			{
				thesisInfo.setThesischeck(thesischecklist.get(0));
				return thesisInfo;
			}
		}
	}
	
	
	//获取任务书
	public Task Gettask(String uid) {
		// TODO Auto-generated method stub
		
		//搜索全部任务书
		TaskExample taskExample=new TaskExample();
		TaskExample.Criteria criteria=taskExample.createCriteria();
		criteria.andUidEqualTo(uid);
		criteria.andStatusEqualTo(2);
		taskExample.setOrderByClause("ID desc");
		List<Task> tasklist=taskMapper.selectByExample(taskExample);
		if(tasklist==null||tasklist.size()==0)
		{
			return null;
		}
		else
		{
			return tasklist.get(0);
		}
		
	}

	public boolean writeOPenreport(Openreport openreport) {
		// TODO Auto-generated method stub
		if(openreportMapper.insertSelective(openreport)==1)
		{
			return true;
		}
		return false;
	}

	public List<Openreport> GetOpenreport(String uid) {
		// TODO Auto-generated method stub
		OpenreportExample exampleOpenreport=new OpenreportExample();
		OpenreportExample.Criteria criteriaOpenreport=exampleOpenreport.createCriteria();
		criteriaOpenreport.andUidEqualTo(uid);
		return openreportMapper.selectByExample(exampleOpenreport);
	}


	public boolean StudentThsisapply(String uid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//设定临时变量
		ThesisapplyExample thesisapplyExample=new ThesisapplyExample();
		ThesisapplyExample.Criteria criteria=thesisapplyExample.createCriteria();
		criteria.andUidEqualTo(uid);
		criteria.andApplyGreaterThanOrEqualTo(1);
		List<Thesisapply> thesisapplylist=thesisapplyMapper.selectByExample(thesisapplyExample);
		if(thesisapplylist.isEmpty())
		{
			flag=true;
		}
		return flag; 
	}


	public List<ThesisInfo> AllStudentThsisapply(String uid) {
		// TODO Auto-generated method stub
		return relationMapper.selectThesisInfo(uid);
	}


	public boolean DelThesisApply(String thid, String uid) {
		// TODO Auto-generated method stub
		System.out.println("thid:"+thid);
		System.out.println("uid:"+uid);
		boolean flag=false;
		ThesisapplyKey thesisapplyKey=new  ThesisapplyKey();
		thesisapplyKey.setThid(thid);
		thesisapplyKey.setUid(uid);
		if(thesisapplyMapper.deleteByPrimaryKey(thesisapplyKey)==1)
		{
			flag=true;
		}
		
		return flag;
	}

	//获取单个开题报告
	public Openreport GetOneOpenreport(Integer id) {
		// TODO Auto-generated method stub
		return openreportMapper.selectByPrimaryKey(id);
	}
	//开题报告修改
	public int updateOpenreport(Openreport openreport)
	{
		 return openreportMapper.updateByPrimaryKeySelective(openreport);
	}

}
