package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.service.TeacherService;


@Controller
public class TeacherController {
	@Autowired
	private TeacherService ts;
	@RequestMapping(value="user/query/allTeacher")
	public String queryTeacherAll(HttpServletRequest request ,Model model,@RequestParam(value = "currentPage",required=false,defaultValue="1")Integer currentPage){
		
//		PageInfo<Teacher> page=ts.selectByPage(0, 3);
//		List<Teacher>teachers=page.getList();
		List<Teacher>list=ts.findAll(currentPage);
		  PageInfo<Teacher> page = new PageInfo<Teacher>(list);
		  
		  model.addAttribute("pageInfo", page);
		  System.out.println(list);
//		  request.setAttribute("pageInfo",page );
		  System.out.println("首页:"+page.getFirstPage());
		  System.out.println("首页:"+page.getLastPage());
		  System.out.println("总数量：" + page.getTotal());
		   System.out.println("当前页查询记录：" + page.getList().size());
		   System.out.println("当前页码：" + page.getPageNum());
		   System.out.println("每页显示数量：" + page.getPageSize());
		   System.out.println("总页：" + page.getPages());
		
//		request.setAttribute("teachers",teachers );
		return "teacherlist";
	}
	@RequestMapping(value="/user/delete/teacher",method=RequestMethod.POST)
	@ResponseBody
	public String deleteTeacher(@RequestBody String id){
		System.out.println(id);
		int num=ts.deleteT(id);
		if(num>0){
			return "1";
		}else{
			return"0";
		}
	}
	@RequestMapping("/user/query/gxinxi")
	public String findTByName(HttpServletRequest request,String tid){
		Teacher teacher=ts.findTByTid(tid);
		request.setAttribute("teacher", teacher);
		return "listpersontg";
		
	}
	@RequestMapping(value="/user/update/teacher",method=RequestMethod.POST)
	public String updateTeacher(Teacher teacher){
			
			ts.update(teacher);
		return "czSuccess";
		
	}
}
