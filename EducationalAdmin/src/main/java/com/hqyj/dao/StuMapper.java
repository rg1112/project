package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.All;
import com.hqyj.entity.Banji1;
import com.hqyj.entity.Course1;
import com.hqyj.entity.PassWord;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
@Repository
public interface StuMapper {
    

	Stu findByName(String ton);
	Stu findSByName(String sno);
	 int updatepass(PassWord password);
	
	
	
	
	
	Teacher queryPersonkq(String ton);
	
	public List<Stu> findstuall();
	public int delectstu(int sid);

	public int addStu(Stu stu);
	public int addBanji(Banji1 banji);
	public int addCourse(Course1 c);
	public List<All> selectCourse(int sid);
	public List<All> selectCourseg(String son);
	public int insertCourse(Course1 c); 
	
}