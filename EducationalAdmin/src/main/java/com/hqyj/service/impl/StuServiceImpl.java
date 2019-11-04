package com.hqyj.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.KaoQingSMapper;
import com.hqyj.dao.KaoQingTMapper;
import com.hqyj.dao.StuGMapper;
import com.hqyj.dao.StuMapper;
import com.hqyj.dao.TeacherMapper;
import com.hqyj.entity.All;
import com.hqyj.entity.Banji1;
import com.hqyj.entity.Course1;
import com.hqyj.entity.Grade1;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.PassWord;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.service.StuService;
import com.hqyj.service.TeacherService;
@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper sm;
	@Autowired
	private KaoQingSMapper ka;
	@Autowired
	private StuGMapper sg;
	
	@Override
	public Stu findByName(String ton) {
		// TODO Auto-generated method stub
		Stu stu = sm.findByName(ton);
		return stu;
	}
	//查看个人考勤
	@Override
	public List<KaoQing> findPersonkqStu(String tonp) {
		List<KaoQing> kao = ka.findPersonkqStu(tonp);
		return kao;
	}
	@Override
	public List<KaoQing> findStudentKqAll() {
		List<KaoQing> stu = ka.findStudentKqAll();
		return stu;
	}
	@Override
	public int addStudentKq(KaoQing kao) {
		ka.addStudentKq(kao);
		return 0;
	}
	@Override
	public KaoQing findStudentByIdKq(int id) {
		KaoQing kao = ka.findStudentByIdKq(id);
		return kao;
	}
	@Override
	public int updateStudentKq(KaoQing kao) {
		ka.updateStudentKq(kao);
		return 0;
	}
	//删除学生考勤
	@Override
	public int deleteStudentKq(int id) {
		int num = ka.deleteStudentKq(id);
		return num;
	}
	//查询全部学生成绩
	@Override
	public List<Stu> queryStudentGrade() {
		List<Stu> grade = sg.queryStudentGrade();
		return grade;
	}
	//添加学生成绩
	@Override
	public int addStudentGrade(Grade1 g) {
		int num = sg.addStudentGrade(g);
		return num;
	}
	//通过ID查询学生成绩
	@Override
	public List<Stu> findStudentGradeById(int sid) {
		List<Stu> s = sg.findStudentGradeById(sid);
		return s;
	}
	 //修改学生成绩
	@Override
	public int updateStudentGrade(int cid,int grade,int sid,int gid) {
		int num = sg.updateStudentGrade(cid,grade,sid,gid);
		return num;
	}
	@Override
	public int deleteStudentGrade(int sid) {
		int num = sg.deleteStudentGrade(sid);
		return num;
	}
	
	
	
	
	
	@Override
	public List<Stu> findstuall() {
		List<Stu> findstuall = sm.findstuall();
		return findstuall;
	}
	@Override
	public int delectstu(int sid) {
		int delstu = sm.delectstu(sid);
		return delstu;
	}
	@Override
	public int addStu(Stu stu) {
		int addstu = sm.addStu(stu);
		return addstu;
	}

	@Override
	public int addBanji(Banji1 banji) {
		int addBanji = sm.addBanji(banji);
		return addBanji;
	}

	@Override
	public int addCourse(Course1 c) {
		int addCourse = sm.addCourse(c);
		return addCourse;
	}

	@Override
	public List<All> selectCourse(int sid) {
		List<All> selectCourse = sm.selectCourse(sid);
		return selectCourse;
	}

	@Override
	public int insertCourse(Course1 c) {
		int insertCourse = sm.insertCourse(c);
		return insertCourse;
	}

	
	
//	rg
	@Override
	public Stu findSByName(String sno) {
		// TODO Auto-generated method stub
		Stu stu = sm.findSByName(sno);
		return stu;
	}

	@Override
	public int updatepass(PassWord password) {
		// TODO Auto-generated method stub
		Object obj = new SimpleHash("MD5", password.getOldpwd(), password.getName(),1024);
		Object objn = new SimpleHash("MD5", password.getNewpwd(), password.getName(),1024);
		password.setNewpwd(objn);
		password.setOldpwd(obj);
		System.out.println(obj);
		System.out.println("yyyyyyyyyyyyyyyyyyy");
		int num=sm.updatepass(password);
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public List<Stu> queryStudentGradeg(String ton) {
		List<Stu> grade = sg.queryStudentGradeg(ton);
		return grade;
	}
	@Override
	public List<All> selectCourseg(String son) {
		// TODO Auto-generated method stub
		List<All> selectCourse = sm.selectCourseg(son);
		return selectCourse;
	}
    
	
	
	
	
	
	
	
	
	
}
