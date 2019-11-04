package com.hqyj.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Grade1;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;

@Repository
public interface StuGMapper {
	
	List<Stu> queryStudentGrade();
	List<Stu> queryStudentGradeg(String ton);
	int addStudentGrade(Grade1 g);
	List<Stu> findStudentGradeById(int sid);
	int updateStudentGrade(int cid,int grade,int sid,int gid);
	int deleteStudentGrade(int sid);

}
