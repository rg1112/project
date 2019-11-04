package com.hqyj.service.impl;

import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.dao.KaoQingTMapper;
import com.hqyj.dao.TeacherMapper;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.PassWord;
import com.hqyj.entity.Teacher;
import com.hqyj.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper tm;
	@Autowired
	private KaoQingTMapper ka;
	
	
	@Override
	public Teacher findByName(String ton) {
		// TODO Auto-generated method stub
		Teacher teacher = tm.findByName(ton);
		return teacher;
	}
	 
	//查看个人考勤
	@Override
	public List<KaoQing> findPersonkq(String tonp) {
		List<KaoQing> kao = ka.findPersonkq(tonp);
		return kao;
	}
	
//	rg
	@Override
	public int insert(Teacher teacher) {
		// TODO Auto-generated method stub
		Object obj = new SimpleHash("MD5", teacher.getTpwd(), teacher.getTon(),1024);
		
		teacher.setTpwd(obj);
		int num=tm.insert(teacher);
		return num;
	}
	
	@Override
	public Teacher findTByName(String ton) {
		// TODO Auto-generated method stub
		Teacher teacher = tm.findTByName(ton);
		
		return teacher;
	}
	@Override
	public List<Teacher> findAll(Integer currentPage) {
		// TODO Auto-generated method stub
		//Commons.orderDetailPageNum=3
        PageHelper.startPage(currentPage, 3);
		List<Teacher>teachers = tm.findAll();
		return teachers;
	}
	@Override
	public int deleteT(String tid) {
		// TODO Auto-generated method stub
		int num=tm.deleteT(tid);
		return num;
	}
	@Override
	public PageInfo<Teacher> selectByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
//		创建
		PageHelper ph=new PageHelper();
		ph.startPage(pageNum, pageSize);
		List<Teacher> teachers=tm.findAll();
		PageInfo<Teacher> pageInfo=new PageInfo<>(teachers);
		return pageInfo;
		
	}
	@Override
	public Teacher findTByTid(String tid) {
		Teacher teacher = tm.findTByTid(tid);
		
		return teacher;
	}
	@Override
	public int update(Teacher teacher) {
		// TODO Auto-generated method stub
		int num=tm.update(teacher);
		return num;
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
		int num=tm.updatepass(password);
		return num;
	}

}
