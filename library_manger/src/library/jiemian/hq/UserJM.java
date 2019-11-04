package library.jiemian.hq;

import java.util.Scanner;

import library.javabean.hq.User;
import library.service.hq.LoginService;
import library.service.hq.userService;

public class UserJM {
	LoginService l=new LoginService();
	public void indexu(User u) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=============用户主界面=============");
			System.out.println("==============1:修改密码===========");
			System.out.println("==============2:用户新增===========");
			System.out.println("==============3:用户删除===========");
			System.out.println("==============4:用户查询===========");
			System.out.println("=============-1:退出界面===========");
			System.out.println("===============选择功能============");
			int x = sc.nextInt();
			if (x == 1) {
				userService us = new userService();
				System.out.println("输入新密码");
				String newpwd = sc.next();
				us.updatepwd(u, newpwd);
			}
			if (x == 2) {
				System.out.println("添加用户界面");
				System.out.println("输入用户类型");
				String ut = sc.next();
				System.out.println("输入用户名");
				String un = sc.next();
				System.out.println("输入密码");
				String pwd = sc.next();
				User u1 = new User(un, pwd, ut);
				userService us1 = new userService();
				us1.insert(u1);

			}
			if (x == 3) {
				System.out.println("删除用户界面");
				System.out.println("输入用户名");
				String un = sc.next();
				User u1 = new User(un);
				userService us1 = new userService();
				us1.delete(u1);
			}
			if (x == 4) {
				System.out.println("模糊查询用户界面");
				System.out.println("输入模糊用户名");
				String s1="%";
				String un = sc.next();
				String nu1=s1+un+s1;
				userService us1 = new userService();
				us1.select(nu1);

			}
			if (x == -1) {
				
				l.loginService(u);
			}
		}

	}
}
