package com.hnist.graduation.serviceimpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnist.graduation.entity.Openreport;
import com.hnist.graduation.entity.Task;
import com.hnist.graduation.entity.TaskExample;
import com.hnist.graduation.entity.Teacher;
import com.hnist.graduation.entity.TeacherExample;
import com.hnist.graduation.entity.Teacherinfo;
import com.hnist.graduation.entity.Thesis;
import com.hnist.graduation.entity.Thesisapply;
import com.hnist.graduation.entity.ThesisapplyExample;
import com.hnist.graduation.entity.ThesisapplyVo;
import com.hnist.graduation.entity.Thesischeck;
import com.hnist.graduation.entity.ThesischeckExample;
import com.hnist.graduation.mapped.OpenreportMapper;
import com.hnist.graduation.mapped.RelationMapper;
import com.hnist.graduation.mapped.TaskMapper;
import com.hnist.graduation.mapped.TeacherMapper;
import com.hnist.graduation.mapped.TeacherinfoMapper;
import com.hnist.graduation.mapped.ThesisMapper;
import com.hnist.graduation.mapped.ThesisapplyMapper;
import com.hnist.graduation.mapped.ThesischeckMapper;
import com.hnist.graduation.service.TeacherService;

@Service
public class TeacherServiceimpl implements TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private TeacherinfoMapper teacherinfoMapper;
	@Autowired
	private ThesischeckMapper thesischeckMapper;
	@Autowired
	private ThesisapplyMapper thesisapplyMapper;
	@Autowired
	private ThesisMapper thesisMapper;
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private OpenreportMapper openreportMapper;
	@Autowired
	private RelationMapper relationMapper;
	
	
	public Teacher TeacherLogin(Teacher teacher) {
		
		// TODO Auto-generated method stub
		//设置临时变量
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		
		//设置值
		criteria.andTidEqualTo(teacher.getTid());
		criteria.andPasswordEqualTo(teacher.getPassword());
		
		//执行数据库
		return teacherMapper.selectByExample(teacherExample).get(0);
	}

	public Teacherinfo GetTeacherinfo(Teacherinfo teacherinfo) {
		// TODO Auto-generated method stub
		//获取
		return teacherinfoMapper.selectByPrimaryKey(teacherinfo.getTid());
	}

	public boolean UpdateTeacherPassword(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTidEqualTo(teacher.getTid());
		int num=teacherMapper.updateByExample(teacher, teacherExample);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean AddThesisCheck(Thesischeck thesischeck) {
		// TODO Auto-generated method stub
		int num=thesischeckMapper.insertSelective(thesischeck);
		if(num!=0)
		{
			return true;	
		}
		else
		{
			return false;	
		}
	}
	//一定要获取id
	public boolean UpdateThesisCheck(Thesischeck thesischeck) {
		// TODO Auto-generated method stub
		//两种变化
		//1.只改变审核状态
		//2.改变信息
		//判断thesischeck中是否有改变
		if(thesischeck.getCheckd()==1)
		{
			//生成论文数据THID
			//获取数据库最高id
			//设置thesis
			Thesis thesis=new Thesis();
			List<Thesis> thesislist=this.GetThesis(null);
			int i=thesislist.get(0).getId()+1+70000;//THID新值
			thesis.setThid(Integer.toString(i));
			thesis.setTid(thesischeck.getTid());
			thesis.setThtitle(thesischeck.getThtitle());
			AddThesis(thesis);
			//修改thesischeck
			thesischeck.setThid(Integer.toString(i));
		}
		int num=thesischeckMapper.updateByPrimaryKeySelective(thesischeck);
		if(num!=0)
		{
			return true;	
		}
		else
		{
			return false;	
		}
	}

	public boolean DeleteThesisCheck(Thesischeck thesischeck) {
		// TODO Auto-generated method stub
		int num=thesischeckMapper.deleteByPrimaryKey(thesischeck.getId());
		if(num!=0)
		{
			return true;	
		}
		else
		{
			return false;	
		} 
	}

	public List<Thesischeck> GetThesisCheck(Thesischeck thesischeck) {
		// TODO Auto-generated method stub
		//如果不为空且Tid有值
		//设置变量值
		ThesischeckExample thesischeckExample=new ThesischeckExample();
		ThesischeckExample.Criteria criteria=thesischeckExample.createCriteria();
		
		//1.教务老师查看自己题目
		if(thesischeck!=null)
		{
			criteria.andTidEqualTo(thesischeck.getTid());
		}
		//2.所有申请
		else
		{
			//未处理
			criteria.andCheckdEqualTo(0);
		}
		return thesischeckMapper.selectByExample(thesischeckExample);
	}

	public boolean UpdateThesisApply(Thesisapply thesisapply) {
		// TODO Auto-generated method stub
		//设置变量
		int num=thesisapplyMapper.updateByPrimaryKeySelective(thesisapply);
		if(num!=0)
		{
			return true;	
		}
		else
		{
			return false;	
		}
	}

	public List<Thesisapply> GetThesisApply(Thesisapply thesisapply) {
		// TODO Auto-generated method stub
		//获取已经选课的学生
		//获取申请的学生
		ThesisapplyExample thesisapplyExample=new ThesisapplyExample();
		ThesisapplyExample.Criteria criteria=thesisapplyExample.createCriteria();
		criteria.andTidEqualTo(thesisapply.getTid());
		if(thesisapply.getApply()==2)
		{
			criteria.andApplyEqualTo(2);
		}
		return thesisapplyMapper.selectByExample(thesisapplyExample);
	}
	//详细信息
	public List<ThesisapplyVo> GetThesisApplyInfo(Thesisapply thesisapply)
	{
		return relationMapper.selectThesisApply(thesisapply.getTid());
	}
	
	
	public boolean AddThesis(Thesis thesis) {
		// TODO Auto-generated method stub
		int num=thesisMapper.insertSelective(thesis);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean AddTask(Task task) {
		// TODO Auto-generated method stub
		int num=taskMapper.insertSelective(task);
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean UpdateTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean DeleteTask(Task task) {
		// TODO Auto-generated method stub
		int num=taskMapper.deleteByPrimaryKey(task.getId());
		if(num!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Task> GetTask(Task task) {
		// TODO Auto-generated method stub
		TaskExample taskExample=new TaskExample();
		TaskExample.Criteria criteria=taskExample.createCriteria();
		if(task!=null)
		{	
			criteria.andTidEqualTo(task.getTid());
			criteria.andUidEqualTo(task.getUid());
		}
		else
		{
			taskExample.setOrderByClause("ID desc ");
		}
		return taskMapper.selectByExample(taskExample);
	}

	public List<Openreport> GetOpenreport(Openreport openreport) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean UpdateOpenreport(Openreport openreport) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Thesis> GetThesis(Thesis thesis) {
		// TODO Auto-generated method stub
		
		return thesisMapper.selectByExample(null);
	}
	//获取时间
	public String GetDate()
	{
		Date date= new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}

}
