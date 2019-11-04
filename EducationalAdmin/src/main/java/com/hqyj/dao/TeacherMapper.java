package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.PassWord;
import com.hqyj.entity.Teacher;
@Repository
public interface TeacherMapper {
   
	public Teacher findByName(String name);
   
    int insert(Teacher teacher);
    int update(Teacher teacher);
    int updatepass(PassWord password);
    Teacher findTByName(String name);
    Teacher findTByTid(String tid);
    List<Teacher> findAll();
    int deleteT(String tid);

    
}