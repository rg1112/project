package library.jiemian.hq;

import java.util.Scanner;

import library.javabean.hq.Borrowinfo;
import library.javabean.hq.Reader;
import library.javabean.hq.User;
import library.main.hq.LogMain;
import library.service.hq.ReaderService;
import library.util.hq.Util;


public class ReaderJM {
	Scanner sc = new Scanner(System.in);
	ReaderService r = new ReaderService();
	public void indexr(User u) {
		
		while (true) {
			
			System.out.println("******************读者主界面********************");
			System.out.println("******************1：读者查询1 *****************");
			System.out.println("******************2：读者查询2******************");
			System.out.println("******************3：读者借书*******************");
			System.out.println("******************4：读者还书*******************");
			System.out.println("******************-1：退出*********************");
			System.out.println("*******************选择功能*********************");
			int x = sc.nextInt();
			if (x == 1) {
				r.select1();
				
			}
			if (x == 2) {
				r.select2();

			}
			if (x == 3) {
				System.out.println("******************借书界面******************");
				System.out.println("书号");
				int book_id=sc.nextInt();
				System.out.println("读者号");
				int reader_id=sc.nextInt();
				System.out.println("借书日期");
				String brinfo_borrowtime=sc.next();
				System.out.println("还书日期");
				String brinfo_returntime=sc.next();
				System.out.println("押金");
				int brinfo_cash=sc.nextInt();
				Borrowinfo b=new Borrowinfo(book_id, reader_id, brinfo_borrowtime, brinfo_returntime, brinfo_cash);
				r.jieshu(b);
			}
			if (x == 4) {
				System.out.println("*********************还书界面*************");
				System.out.println("书号");
				int num=sc.nextInt();
				r.huanshu(num);

			}
			if (x == -1) {
				
				LogMain.main(null);
				
			}
}
		}
	public void insert(){
		System.out.println("-------------读者注册页面-------------");
    	System.out.println("请输入读者姓名:");
    	String reader_name = sc.next();
    	System.out.println("请输入借书证号:");
    	String reader_borrowno = sc.next();
    	System.out.println("请输入性别:");
    	String reader_sex = sc.next();
    	System.out.println("请输入电话号码:");
    	String reader_phone = sc.next();
    	System.out.println("所在系:");
    	String reader_school = sc.next();
    	System.out.println("所在班级:");
    	String reader_class = sc.next();
		Reader r1=new Reader(reader_borrowno, reader_name, reader_sex, reader_phone, reader_school, reader_class);
		r.insert(r1);
		LogMain.main(null);
	}
	}
