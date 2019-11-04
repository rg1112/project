package library.method.hq;

import java.sql.SQLException;

import library.javabean.hq.Book;
import library.util.hq.Util;

public class BookMethod extends Util {
public int insert(Book b){
	int num=0;
	String sql="insert into book(book_name,book_type,book_author,book_publish,book_condition) VALUE(?,?,?,?,?)";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, b.getBook_name());
		ps.setString(2, b.getBook_type());
		ps.setString(3, b.getBook_author());
		ps.setString(4, b.getBook_publish());
		ps.setString(5, b.getBook_condition());
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return num;
}
public int delete(String b){
	int num=0;
	String sql="DELETE from book where book_name=?";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, b);
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return num;
}
public int update(Book b,String b1){
	int num=0;
	String sql="UPDATE  book set book_name=?,book_type=?,book_author=?,book_publish=?,book_condition=? where book_name=?";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, b.getBook_name());
		ps.setString(2, b.getBook_type());
		ps.setString(3, b.getBook_author());
		ps.setString(4, b.getBook_publish());
		ps.setString(5, b.getBook_condition());
		ps.setString(6, b1);
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return num;
}
public int selectT(String b) {
	int num=0;
	String sql = "SELECT * from book where book_type=?";

	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, b);
		rs = ps.executeQuery();
		while (rs.next()) {
			//rs.getString("user_role");
			//rs.getString("user_name");
			//rs.getString("user_pwd");
			 String book_id=rs.getString("book_id"); 
			 String book_name=rs.getString("book_name");
			 String book_type=rs.getString("book_type");
			 String book_author=rs.getString("book_author");
			 String book_publish=rs.getString("book_publish");
			 String book_condition=rs.getString("book_condition");
			 System.out.println("book_id:"+book_id+"book_name:"+book_name+"\t book_type:"+book_type+"\t book_author:"+book_author+"\t book_publish:"+book_publish+"\t book_condition:"+book_condition);
			 num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;

	
}
public int selectMn(String l) {
	int num=0;
	String sql = "SELECT * from book where book_name like ?";

	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, l);
		
		rs = ps.executeQuery();
		while (rs.next()) {
			//rs.getString("user_role");
			//rs.getString("user_name");
			//rs.getString("user_pwd");
			 String book_id=rs.getString("book_id"); 
			 String book_name=rs.getString("book_name");
			 String book_type=rs.getString("book_type");
			 String book_author=rs.getString("book_author");
			 String book_publish=rs.getString("book_publish");
			 String book_condition=rs.getString("book_condition");
			 System.out.println("book_id:"+book_id+"book_name:"+book_name+"\t book_type:"+book_type+"\t book_author:"+book_author+"\t book_publish:"+book_publish+"\t book_condition:"+book_condition);
			 num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;

	
}
public int selectz(String l) {
	int num=0;
	String sql = "SELECT * from book where book_author like ?";

	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, l);
		
		rs = ps.executeQuery();
		while (rs.next()) {
			//rs.getString("user_role");
			//rs.getString("user_name");
			//rs.getString("user_pwd");
			 String book_id=rs.getString("book_id"); 
			 String book_name=rs.getString("book_name");
			 String book_type=rs.getString("book_type");
			 String book_author=rs.getString("book_author");
			 String book_publish=rs.getString("book_publish");
			 String book_condition=rs.getString("book_condition");
			 System.out.println("book_id:"+book_id+"book_name:"+book_name+"\t book_type:"+book_type+"\t book_author:"+book_author+"\t book_publish:"+book_publish+"\t book_condition:"+book_condition);
			 num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;

	
}
public int selectzt(String l) {
	int num=0;
	String sql = "SELECT * from book where book_condition = ?";

	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, l);
		
		rs = ps.executeQuery();
		while (rs.next()) {
			//rs.getString("user_role");
			//rs.getString("user_name");
			//rs.getString("user_pwd");
			 String book_id=rs.getString("book_id"); 
			 String book_name=rs.getString("book_name");
			 String book_type=rs.getString("book_type");
			 String book_author=rs.getString("book_author");
			 String book_publish=rs.getString("book_publish");
			 String book_condition=rs.getString("book_condition");
			 System.out.println("book_id:"+book_id+"book_name:"+book_name+"\t book_type:"+book_type+"\t book_author:"+book_author+"\t book_publish:"+book_publish+"\t book_condition:"+book_condition);
			 num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;

	
}

}
