package com.hqyj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.dao.TeacherMapper;
import com.hqyj.entity.Grade;
import com.hqyj.entity.Grade1;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.service.StuService;
import com.hqyj.service.TeacherService;

@Controller
public class HeadController {
	@Autowired
	private TeacherService ts;
	@Autowired
	private StuService stu;
	
	@RequestMapping("/head/add/teacher")
	public String addTeacher(Teacher teacher){
			
			ts.insert(teacher);
		return "czSuccess";
}
	@RequestMapping("/add/studentkq")
	public String addStudentkq(){
		return "addStudentKq";	
	}
	
	@RequestMapping("/update/studentkq")
	public String updateStudentkq(int sid,HttpServletRequest request){
		System.out.println(sid);
		KaoQing kq = stu.findStudentByIdKq(sid);
		List<KaoQing> kao1 = new ArrayList<KaoQing>();
		kao1.add(kq);
		request.setAttribute("kao1", kao1);
		return "queryStudentIdkq";	
		
	}
	
	@RequestMapping("/delete/studentkq")
	@ResponseBody
	public int deleteStudentkq(@RequestBody int sid,HttpServletRequest request){
		System.out.println("+++++++"+sid);
		int num = stu.deleteStudentKq(sid);
		return num;	
		
	}
	
	@RequestMapping("/add/studentgrade")
	public String addStudentGrade(){
		return "addStudentGrade";	
	}
	
	@RequestMapping("/update/studentgrade")
	public String updateStudentGrade(int sid,HttpServletRequest request){
		System.out.println(sid);
		List<Stu> s = stu.findStudentGradeById(sid);
		int[] a = new int[5];
		Grade1 g1 = new Grade1();
		List<Grade1> gr = new ArrayList<Grade1>();
		int i=0;
		int id = 0;
		int gid=0;
	    for (Stu stu : s) {
			id=stu.getSid();
			for (Grade g : stu.getGrade()) {
				gid = g.getGid();
			    a[i]=g.getGrade();
			    i++;
			}
		}
		g1.setSid(id);
		g1.setGid(gid);
		g1.setG1(a[0]);
		g1.setG2(a[1]);
		g1.setG3(a[2]);
		g1.setG4(a[3]);
		g1.setG5(a[4]);
		gr.add(g1);
		request.setAttribute("s", gr);
		return "queryStudentGrade2";	
		
	}
	
	
	@RequestMapping("/delete/studentgrade")
	@ResponseBody
	public int deleteStudentGrade(@RequestBody int sid){
		System.out.println("+++++++"+sid);
		int num = stu.deleteStudentGrade(sid);
		return num;	
		
	}
}
