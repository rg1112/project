package library.jiemian.hq;

import java.util.Scanner;

import library.javabean.hq.Book;
import library.javabean.hq.User;
import library.service.hq.BookService;
import library.service.hq.LoginService;

public class BookJM {
	LoginService l = new LoginService();
	BookService bs = new BookService();

	public void indext(User u) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=============图书管理主界面=============");
			System.out.println("==============1:图书新增===============");
			System.out.println("==============2:图书删除===============");
			System.out.println("==============3:图书修改===============");
			System.out.println("==============4:图书查询===============");
			System.out.println("=============-1:退出界面===============");
			System.out.println("===============选择功能================");
			int x = sc.nextInt();

			if (x == 1) {
				System.out.println("添加图书界面");
				System.out.println("输入图书名");
				String book_name = sc.next();
				System.out.println("输入图书类型");
				String book_type = sc.next();
				System.out.println("输入图书作者");
				String book_author = sc.next();
				System.out.println("输入图书出版社");
				String book_publish = sc.next();
				System.out.println("输入图书状态");
				String book_condition = sc.next();
				Book b = new Book(book_name, book_type, book_author, book_publish, book_condition);
				BookService bs = new BookService();
				bs.insert(b);

			}
			if (x == 2) {
				System.out.println("删除图书界面");
				System.out.println("输入图书名");
				String b = sc.next();
				bs.delete(b);
			}
			if (x == 3) {
				System.out.println("更改图书信息界面");
				System.out.println("输入需修改的图书名");
				String b1 = sc.next();
				System.out.println("输入新的图书名");
				String book_name = sc.next();
				System.out.println("输入新的图书类型");
				String book_type = sc.next();
				System.out.println("输入新的图书作者");
				String book_author = sc.next();
				System.out.println("输入新的图书出版社");
				String book_publish = sc.next();
				System.out.println("输入新的图书状态");
				String book_condition = sc.next();
				Book b = new Book(book_name, book_type, book_author, book_publish, book_condition);
				bs.update(b, b1);

			}
			if (x == 4) {
				System.out.println("-------------查询图书界面------------");
				System.out.println("-----------1:图书类别查询精确查询-------");
				System.out.println("-----------2:书名模糊查询-------------");
				System.out.println("-----------3:作者模糊查询-------------");
				System.out.println("-----------4:图书状态精确查询----------");
				System.out.println("------------选择查询类型--------------");
				int l = sc.nextInt();
				if (l == 1) {
					System.out.println("图书类别");
					String b = sc.next();
					bs.select1(b);
				}
				if (l == 2) {
					System.out.println("模糊书名");
					String b = sc.next();
					String s1 = "%";

					String b1 = s1 + b + s1;
					bs.select2(b1);
				}
				if (l == 3) {
					System.out.println("模糊作者名");
					String b = sc.next();
					String s1 = "%";
					String b1 = s1 + b + s1;
					bs.select3(b1);
				}
				if (l == 4) {
					System.out.println("图书状态");
					String b = sc.next();
					bs.select4(b);
				}

			}
			if (x == -1) {
				l.loginService(u);
			}
		}

	}
}
