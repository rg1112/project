package library.service.hq;

import java.util.List;
import java.util.Scanner;

import library.javabean.hq.Book;
import library.javabean.hq.User;
import library.jiemian.hq.BookJM;
import library.jiemian.hq.ReaderJM;
import library.jiemian.hq.UserJM;
import library.main.hq.LogMain;
import library.method.hq.Login;
import library.util.hq.Util;

public class LoginService {
	BookService bs = new BookService();

	public void loginService(User u) {
		Scanner sc = new Scanner(System.in);
		Login l = new Login();

		List<Object> l1 = l.login(u);

		String s = u.getUser_role();
		System.out.println(s);
		while (true) {
			if (l1.size() > 0 &&s.equals("管理员")) {
				System.out.println("登录成功");
				System.out.println("-------------管理员主界面-------------");
				System.out.println("------------1：用户管理界面------------");
				System.out.println("------------2：图书管理界面------------");
				System.out.println("----------- -1：退出-----------------");
				System.out.println("--------------选择功能----------------");
				int j = sc.nextInt();
				if (j == 1) {
					UserJM uj = new UserJM();
					uj.indexu(u);
				}
				if (j == 2) {
					BookJM bj = new BookJM();
					bj.indext(u);
				}
				if (j == -1) {
					LogMain.main(null);

				}
			} else if (l1.size() > 0 && s.equals("读者")) {
				System.out.println("登录成功");
				ReaderJM rj=new ReaderJM();
				rj.indexr(u);
				
				break;

			} else {
				System.out.println("登录失败");
				System.out.println("用户名或密码或类型不正确");
				LogMain.main(null);
				continue;
			}
		}
	}

}
