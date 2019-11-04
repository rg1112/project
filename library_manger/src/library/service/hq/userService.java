package library.service.hq;

import library.javabean.hq.User;
import library.method.hq.userMethod;

public class userService {
public void updatepwd(User u,String newpwd){
	userMethod u1=new userMethod();
	int num=u1.updatepwd(u, newpwd);
	if(num>0){
		System.out.println("修改密码成功");
		
	}else{
		System.out.println("修改失败");
	}
}
public void insert(User u){
	userMethod u1=new userMethod();
	int num=u1.insert(u);
	if(num>0){
		System.out.println("添加成功");
		
	}else{
		System.out.println("添加失败");
	}
}
public void delete(User u){
	userMethod u1=new userMethod();
	int num=u1.delete(u);
	if(num>0){
		System.out.println("删除成功");
		
	}else{
		System.out.println("删除失败");
	}
}
public void select(String u){
	userMethod u1=new userMethod();
	int num=u1.select(u);
	if(num>0){
		System.out.println("查询成功");
		
	}else{
		System.out.println("查询失败");
	}
}
}
