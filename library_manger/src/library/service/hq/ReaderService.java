package library.service.hq;

import java.util.List;
import java.util.Scanner;

import library.javabean.hq.Borrowinfo;
import library.javabean.hq.Reader;
import library.javabean.hq.User;
import library.main.hq.LogMain;
import library.method.hq.Login;
import library.method.hq.ReaderMethod;
import library.util.hq.Util;

public class ReaderService {
	ReaderMethod r=new ReaderMethod();
	public void insert(Reader r){
		int num =this.r.insert(r);
		if(num>0){
			System.out.println("新增成功");
			
		}else{
			System.out.println("新增失败");
		}
	}
	public void select1(){
		int num =r.select1();
		if(num>0){
			System.out.println("查询成功");
			
		}else{
			System.out.println("查询无结果");
		}
	}
	public void select2(){
		int num =r.select2();
		if(num>0){
			System.out.println("查询成功");
			
		}else{
			System.out.println("查询无结果");
		}
	}
	public void jieshu(Borrowinfo b){
		int num =r.jieshu(b);
		if(num>0){
			System.out.println("借书成功");
			
		}else{
			System.out.println("借书失败");
		}
	}
	public void huanshu(int b){
		int num =r.huanshu(b);
		if(num>0){
			System.out.println("还书成功");
			
		}else{
			System.out.println("还书失败");
		}
	}
}

