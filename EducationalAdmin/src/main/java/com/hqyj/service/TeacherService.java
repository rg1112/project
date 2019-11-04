package com.hqyj.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.PassWord;
import com.hqyj.entity.Teacher;

public interface TeacherService {
	
	public PageInfo<Teacher> selectByPage(int pageNum,int pageSize);
	  int insert(Teacher teacher);
	  int update(Teacher teacher);
	  int updatepass(PassWord password);
	 Teacher findByName(String ton);
	 Teacher findTByName(String name);
	 Teacher findTByTid(String tid);
	 List<Teacher> findAll(Integer currentPage);
	  int deleteT(String tid);
	  
	  
	 List<KaoQing> findPersonkq(String tonp);
	 
}
