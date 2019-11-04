package com.hqyj.controller;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.entity.Grade;
import com.hqyj.entity.Grade1;
import com.hqyj.entity.KaoQing;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.factory.MyShiroFilterFactoryBean;
import com.hqyj.service.StuService;
import com.hqyj.service.TeacherService;

@Controller
@RequestMapping("/user")
public class StuAndTeaController {
	@Autowired
	private MyShiroFilterFactoryBean myShiroFilterFactoryBean;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StuService stuService;
	
//	//修改密码
//	@RequestMapping("/update/pwd")
//	public String updatePwd(){
//		return "updatePwd";
//	}
	
	//查询个人信息
	@RequestMapping("/query/xinxi")
	public String queryXinix(){
		return "personInfo";
	}
	
	//查询学生成绩
	@RequestMapping("/query/studentScore")
	public String queryStuScore(){
		return "stuScore";
	}
	
//	//查询所有老师
//	@RequestMapping("/query/allTeacher")
//	public String queryTeacherAll(){
//		return "teacherall";
//	}
	
	@RequestMapping("/add/studentScore")
	public String addStuScore(){
		return "addStuScore";
	}
	@RequestMapping("/update/studentScore")
	public String updateStuScore(){
		return "updateStuScore";
	}
	@RequestMapping("/query/classroom")
	public String queryClassroom(){
		return "classroom";
	}
	@RequestMapping("/add/teacher")
	public String addTeacher(){
		return "addTeacher";
	}
	//查询个人考勤
	@RequestMapping("/query/personkq")
	public String queryPersonkq(HttpServletRequest request){
		String tonp = (String) request.getSession().getAttribute("ton");
		List<KaoQing> kao = new ArrayList<>();
		System.out.println("@@@@@@@@@@@@@"+tonp);
		String regex1="^s{1}[0-9]*$";
		if(tonp.matches(regex1)){
			kao = stuService.findPersonkqStu(tonp);
			for (KaoQing kaoQing : kao) {
				System.out.println(kaoQing);
			}
			request.setAttribute("kaos", kao);
			return "personkqStu";
		}else{
			kao = teacherService.findPersonkq(tonp);
			request.setAttribute("kaot", kao);
			return "personkq";
		}
		
	}
	//查询全部学生考勤
	@RequestMapping("query/studentkq")
	public String queryStudentkq(HttpServletRequest request){
		List<KaoQing> stu1 = stuService.findStudentKqAll();
		request.setAttribute("stu1", stu1);
		return "queryStudentkq";
	}
	
	
	
	
	//录入学生考勤
	@RequestMapping("/add/studentkq")
	public String addStudentkq(int sid,Date stime,String skq,HttpServletRequest request){
		KaoQing kao = new KaoQing();
		kao.setTkid(sid);
		kao.setTtime(stime);
		kao.setTkcontebt(skq);
		int num = stuService.addStudentKq(kao);
		if(num>0){
			System.out.println("录入成功!");
		}else{
			System.out.println("录入失败!");
		}
		return "czSuccess";
	}
	

	//修改学生考勤
	@RequestMapping("/update/studentkq")
	public String updateStudentkq(int tkid,Date ttime,String tkcontebt){
		KaoQing kao = new KaoQing();
		kao.setTkid(tkid);
		kao.setTtime(ttime);
		kao.setTkcontebt(tkcontebt);
		System.out.println(kao);
		int num = stuService.updateStudentKq(kao);
		return "czSuccess";
		
	}
	
	//查询全部学生成绩信息
	@RequestMapping("/query/studentgrade")
	public String queryStudentgrade(HttpServletRequest request){
		List<Stu> grade = stuService.queryStudentGrade();
		request.setAttribute("grade", grade);
		return "queryStudentGrade";
		
	}
	
	@RequestMapping("/query/studentg")
	public String queryStudentg(HttpServletRequest request){
		String ton = (String) request.getSession().getAttribute("ton");
		List<Stu> grade = stuService.queryStudentGradeg(ton);
		request.setAttribute("grade", grade);
		return "queryStudentGrade3";
		
	}
	
	//添加学生成绩
	@RequestMapping("/add/studentgarde")
	public String addStudentGrade(Grade1 g,HttpServletRequest request){
		int num = stuService.addStudentGrade(g);
		if(num>0){
			return "czSuccess";
		}else{
			return null;
		}
		
		
	}
	
	//修改学生成绩
	@RequestMapping("/update/studentgrade")
	public String updateStudentGrade(Grade1 g,HttpServletRequest request){
		int gid = g.getGid();
		System.out.println("hhhhhhhhhh"+gid);
		int sid = g.getSid();
		int g1 = g.getG1();
		int g2 = g.getG2();
		int g3 = g.getG3();
		int g4 = g.getG4();
		int g5 = g.getG5();
		int[] a = new int[5];
		int cid=5;
		int num=0;
		int i = 0;
		a[0]=g1;
		a[1]=g2;
		a[2]=g3;
		a[3]=g4;
		a[4]=g5;
		for(i=4;i>=0;i--){
			num = stuService.updateStudentGrade(cid, a[i], sid, gid);
			gid--;
			cid--;
		}
		if(num >0){
			return "czSuccess";
		}
		else{
			return null;
		}
		
	}
	
	
	
	
	
	
	/*@RequestMapping("/addAuth")
	public String addStu(Student stu){
//		修改权限代码
		reloadFilterChains();
		return "login";
	}*/
	
	/**
     * 动态更新新的权限
     * @param filterMap
     */
    public void reloadFilterChains() {  
        synchronized (myShiroFilterFactoryBean) {   //强制同步，控制线程安全  
            AbstractShiroFilter shiroFilter = null;  
  
            try {  
                shiroFilter = (AbstractShiroFilter) myShiroFilterFactoryBean.getObject();  
  
                PathMatchingFilterChainResolver resolver = (PathMatchingFilterChainResolver) shiroFilter  
                        .getFilterChainResolver();  
                // 过滤管理器  
                DefaultFilterChainManager manager = (DefaultFilterChainManager) resolver.getFilterChainManager();  
                // 清除权限配置  
                manager.getFilterChains().clear();  
                myShiroFilterFactoryBean.getFilterChainDefinitionMap().clear();  
                // 重新设置权限  
                myShiroFilterFactoryBean.setFilterChainDefinitions(MyShiroFilterFactoryBean.filterChainDefinitions);//传入配置中的filterchains  
  
                Map<String, String> chains = myShiroFilterFactoryBean.getFilterChainDefinitionMap();  
                //重新生成过滤链  
                if (!CollectionUtils.isEmpty(chains)) {  
                    for (Map.Entry<String, String> chain : chains.entrySet()) {
                        manager.createChain(chain.getKey(), chain.getValue().replace(" ", ""));
                    }
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }
   
}
