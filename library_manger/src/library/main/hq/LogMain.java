package library.main.hq;

import java.util.Scanner;

import library.javabean.hq.User;
import library.jiemian.hq.ReaderJM;
import library.service.hq.LoginService;
import library.util.hq.Util;

public class LogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("******************图书管理系统**********************");
		System.out.println("*                                               *");
		System.out.println("*******************1:登录*************************");
		System.out.println("*                                               *");
		System.out.println("*******************2:注册*************************");
		System.out.println("*                                               *");
		System.out.println("*******************-1:退出系统*********************");
		System.out.println("*                                               *");
		System.out.println("********************请选择：***********************");
		int num=sc.nextInt();
		if(num==1){
			login();
		}
		if(num==2){
			ReaderJM z=new ReaderJM();
			z.insert();
		}
		if(num==-1){
			Util util = new Util();
			util.close();
			System.exit(0);
			System.out.println("已退出系统");
		}
		
	}
public static void login(){
	Scanner sc=new Scanner(System.in);
	System.out.println("***********************登录界面********************");
	System.out.println("**********************输入用户类型******************");
	String ut=sc.next();
	System.out.println("**********************输入用户名*******************");
	String u=sc.next();
	System.out.println("**********************输入密码*********************");
	String pwd=sc.next();
	User u1=new User(u, pwd, ut);
	LoginService ls=new LoginService();
	ls.loginService(u1);
}
}
