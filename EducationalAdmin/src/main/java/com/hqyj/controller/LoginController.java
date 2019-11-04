package com.hqyj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.entity.PassWord;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.service.StuService;
import com.hqyj.service.TeacherService;

@Controller
public class LoginController {
	@Autowired
	private TeacherService ts;
	@Autowired
	private StuService ss;
	
	@RequestMapping("/gologin")
	public String gologin(){
		return "login";
	}
	@RequestMapping("/logout")
	public String logout(){
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}
	@RequestMapping("/login")
	public String login(String type ,String ton,String password,HttpServletRequest request){
		System.out.println();
		System.out.println(type);
		request.getSession().setAttribute("ton",ton);
		request.getSession().setAttribute("password",password);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(ton,password);
		System.out.println(ton);
		System.out.println(password);
		try {
			subject.login(token);
			return "redirect:main";
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.getSession().setAttribute("error","账号密码错误");
			return "login";
		}
		
	}
	
	@RequestMapping("/user/query/grxinxi")
	public String findTByName(HttpServletRequest request){
		String name=(String) request.getSession().getAttribute("ton");
		String regex1="^s{1}[0-9]*$";
		if(name.matches(regex1)){
			Stu stu=ss.findSByName(name);
			request.setAttribute("stu", stu);
			return "listpersons";
		}
		else{
		Teacher teacher=ts.findTByName(name);
		request.setAttribute("teacher", teacher);
		return "listpersont";
		}
		
	}
	
	@RequestMapping("/user/update/pwd")
	public String updatePwd(HttpServletRequest request){
		String password=(String) request.getSession().getAttribute("password");
		String name=(String) request.getSession().getAttribute("ton");
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		return "password";
	}
	@RequestMapping("/user/update/newpwd")
	public String updatepass(HttpServletRequest request,PassWord password ){
		
		String name=(String) request.getSession().getAttribute("ton");
	
		System.out.println(password);
		String regex1="^s{1}[0-9]*$";
		if(name.matches(regex1)){
			ss.updatepass(password);
			return "czSuccess";
		}
		else{
			System.out.println(password);
		ts.updatepass(password);
		return "czSuccess";
		}
		
	}
}
