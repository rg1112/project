package com.hqyj.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hqyj.entity.All;
import com.hqyj.entity.Banji;
import com.hqyj.entity.Banji1;
import com.hqyj.entity.Course;
import com.hqyj.entity.Course1;
import com.hqyj.entity.Stu;
import com.hqyj.entity.TKaoqing;
import com.hqyj.factory.MyShiroFilterFactoryBean;
import com.hqyj.service.StuService;
import com.hqyj.service.TKaoqingService;

@Controller
@RequestMapping("/kaoqing")
public class KaoQingController {
	@Autowired
	private MyShiroFilterFactoryBean myShiroFilterFactoryBean;
	@Autowired
	private TKaoqingService tks;
	@Autowired
	private StuService ss;
	

@RequestMapping("/query/findTkaoqingAll")	
	public String findTkaoqingAll(HttpServletRequest request){
		 List<TKaoqing> tkao = tks.findTkaoqingAll();
		request.setAttribute("tkao", tkao);
		return "findTkaoqingAll";
	}



@RequestMapping("/query/findstuall")	
	public String findstuall(HttpServletRequest request){
		List<Stu> stu = ss.findstuall();
		request.setAttribute("stu", stu);
		return "findstuall";
	}
@RequestMapping("/query/studentgc")	
public String findstuallg(HttpServletRequest request){
	String ton = (String) request.getSession().getAttribute("ton");
	List<All> course = ss.selectCourseg(ton);
	request.setAttribute("course", course);
	return "findstuall";
}


//删除教师考勤
@RequestMapping("/delete/TkaoqingBytkid")	
	public String delectTkaoq(int tkid,HttpServletRequest request){
	System.out.println("^^^^^^^^"+tkid);
	int tkaoq = tks.delectTkaoq(tkid);
		if(tkaoq>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		List<TKaoqing> tkao = tks.findTkaoqingAll();
		request.setAttribute("tkao", tkao);
		return "findTkaoqingAll";
	}

//删除学生信息
@RequestMapping("/delect/stu")	
	public String delectstu(int sid,HttpServletRequest request){
		int delstu = ss.delectstu(sid);
		if(delstu>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		List<Stu> stu = ss.findstuall();
		request.setAttribute("stu", stu);
		return "findstuall";
	}

//根据id查出所要修改的教师考勤情况的表
@RequestMapping("/select/TkaoqingBytkid")	
	public String updateTkaoqingBytkid(int tkid,HttpServletRequest request){
		List<TKaoqing> kq = tks.selectkq(tkid);
		request.setAttribute("kq", kq);
		return "TkaoqingBytkid";
	}

//根据id添加教师考勤情况
@RequestMapping("/select/TkaoqingBytid")	
public String updateTkaoqingBytid(int tid,HttpServletRequest request){
	List<TKaoqing> kq = tks.selectkqt(tid);
	request.setAttribute("kq", kq);
	return "TkaoqingBytid";
}


//根据sid先查询课程信息再添加
@RequestMapping("/add/course")	
public String addCourse(int sid,HttpServletRequest request){
	List<All> course = ss.selectCourse(sid);
	request.setAttribute("course", course);
	return "addcourse";
}

//根据sid添加课程信息
@RequestMapping("/addcourse/success")	
public String addCourseSuccess(Course1 c ,HttpServletRequest request){
	
//	System.out.println("#################################"+sid);
//	System.out.println("#################################"+cid);
	int insertcourse = ss.insertCourse(c);
	if(insertcourse>0){
		System.out.println("inserrt成功");
	}else{
		System.out.println("inserrt失败");
	}
	List<Stu> stu1 = ss.findstuall();
	request.setAttribute("stu", stu1);
	return "findstuall";
}

@RequestMapping(value="/success/TkaoqingBytkid",method=RequestMethod.POST)	
public String updatesuccess(TKaoqing tk,HttpServletRequest request){
	System.out.println(tk.getTkid());
	int num = tks.updateTkaoqingBytkid(tk);
	if(num>0){
		System.out.println("修改成功");
	}else{
		System.out.println("修改失败");
	}
	 List<TKaoqing> tkao = tks.findTkaoqingAll();
	request.setAttribute("tkao", tkao);
	return "findTkaoqingAll";
}


@RequestMapping("/add/Tkaoqing")	
public String addTkaoqing(){
	return "addTkaoqing";
}


@RequestMapping("/add/addstu")	
public String addstu(){
	return "addstu";
}


//增加学生信息
@RequestMapping(value="/success/addstu",method=RequestMethod.POST)	
public String addstusuccess(Stu stu,Course1 c,Banji1 b, HttpServletRequest request){
	int num = ss.addStu(stu);
	int addCourse = ss.addCourse(c);
	int addBanji = ss.addBanji(b);
	if(num>0 && addCourse>0 && addBanji>0){
		System.out.println("增加成功");
	}else{
		System.out.println("增加失败");
	}
	List<Stu> stu1 = ss.findstuall();
	request.setAttribute("stu", stu1);
	return "findstuall";
}

@RequestMapping("/success/addTkaoqing")	
public String addTkaoqing(TKaoqing tk,HttpServletRequest request){
	int num = tks.addTkaoqing(tk);
	if(num>0){
		System.out.println("增加成功");
	}else{
		System.out.println("增加失败");
	}
	 List<TKaoqing> tkao = tks.findTkaoqingAll();
		request.setAttribute("tkao", tkao);
		return "findTkaoqingAll";
}

@RequestMapping("/success/addstu1")	
public String allme(All a,HttpServletRequest request){
	System.out.println("%%%%%"+a);
	Stu s=new Stu();
	s.setSname(a.getSname());
	s.setSno(a.getSno());
	s.setSex(a.getSex());
	int addStu = ss.addStu(s);
	Integer sid = s.getSid();
	System.out.println("%%%%%%%%%%"+sid);
	
	Banji1 b=new Banji1();
	b.setSid(sid);
	b.setBid(a.getBid());
	int addBanji = ss.addBanji(b);
	
	Course1 c=new Course1();
	c.setCid(a.getCid());
	c.setSid(sid);
	
	int addCourse = ss.addCourse(c);
	List<Stu> stu1 = ss.findstuall();
	request.setAttribute("stu", stu1);
	return "findstuall";
}


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
