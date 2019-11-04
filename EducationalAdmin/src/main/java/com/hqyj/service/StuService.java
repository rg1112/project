package com.hqyj.service;



import java.util.Date;
import java.util.List;

import com.hqyj.entity.All;
import com.hqyj.entity.Banji1;
import com.hqyj.entity.Course1;
import com.hqyj.entity.Grade1;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.PassWord;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;


public interface StuService {
	  
	  
	 Stu findByName(String ton);
	 Stu findSByName(String sno);
	 int updatepass(PassWord password);
	 List<Stu> queryStudentGradeg(String ton);
	 
	 
	 
	 
	 public List<Stu> findstuall();
		public int delectstu(int sid);
		 public int addStu(Stu stu);
		 public int addBanji(Banji1 banji);
		public int addCourse(Course1 c);
		public List<All> selectCourse(int sid);
		public int insertCourse(Course1 c); 
	 
	 
	 
		public List<All> selectCourseg(String son);
	 List<KaoQing> findPersonkqStu(String tonp);
	 List<KaoQing> findStudentKqAll();
	 int addStudentKq(KaoQing kao);
	 KaoQing findStudentByIdKq(int id);
	 int updateStudentKq(KaoQing kao);
	 int deleteStudentKq(int id);
	 //查询全部学生成绩信息
	 List<Stu> queryStudentGrade();
	 //添加学生成绩
	 int addStudentGrade(Grade1 g);
	 //通过ID查询学生成绩
	 List<Stu> findStudentGradeById(int sid);
	 //修改学生成绩
	 int updateStudentGrade(int cid,int grade,int sid,int gid);
	 //删除学生成绩
	 int deleteStudentGrade(int sid);
}
