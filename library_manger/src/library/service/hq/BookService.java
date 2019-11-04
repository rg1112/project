package library.service.hq;

import library.javabean.hq.Book;
import library.method.hq.BookMethod;

public class BookService {
	BookMethod b=new BookMethod();
public void insert(Book b){
	int num =this.b.insert(b);
	if(num>0){
		System.out.println("新增成功");
		
	}else{
		System.out.println("新增失败");
	}
}
public void delete(String b){
	int num =this.b.delete(b);
	if(num>0){
		System.out.println("删除成功");
		
	}else{
		System.out.println("删除失败");
	}
}
public void update(Book b,String b1){
	int num =this.b.update(b,b1);
	if(num>0){
		System.out.println("修改成功");
		
	}else{
		System.out.println("修改失败");
	}
}
public void select1(String b){
	int num =this.b.selectT(b);
	if(num>0){
		System.out.println("查询成功");
		
	}else{
		System.out.println("查询无果");
	}
}
public void select2(String b){
	int num =this.b.selectMn(b);
	if(num>0){
		System.out.println("查询成功");
		
	}else{
		System.out.println("查询无果");
	}
}
public void select3(String b){
	int num =this.b.selectz(b);
	if(num>0){
		System.out.println("查询成功");
		
	}else{
		System.out.println("查询无果");
	}
}
public void select4(String b){
	int num =this.b.selectzt(b);
	if(num>0){
		System.out.println("查询成功");
		
	}else{
		System.out.println("查询无果");
	}
}
}
