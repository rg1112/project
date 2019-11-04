package library.method.hq;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import library.javabean.hq.User;
import library.util.hq.Util;

public class userMethod extends Util {
public int updatepwd(User u,String newpwd){
	int num=0;
	String sql = "UPDATE  user set user_pwd=? where user_name=? and user_pwd=?";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, newpwd);
		ps.setString(2, u.getUser_name());
		ps.setString(3, u.getUser_pwd());
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return num;
}
public int insert(User u){
	int num=0;
	String sql = "INSERT into user VALUES(?,?,?)";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, u.getUser_name());
		ps.setString(2, u.getUser_pwd());
		ps.setString(3, u.getUser_role());
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return num;
}
public int delete(User u){
	int num=0;
	String sql = "DELETE from user where user_name=?";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, u.getUser_name());
		num=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		//close();
	}
	
	return num;
}
public int select(String u) {
	int num=0;
	String sql = "SELECT * from user where user_name like ?";

	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, u);
		rs = ps.executeQuery();
		while (rs.next()) {
			//rs.getString("user_role");
			//rs.getString("user_name");
			//rs.getString("user_pwd");
			 String user_name=rs.getString("user_name");
			 String user_pwd=rs.getString("user_pwd");
			 String user_role=rs.getString("user_role");
			 System.out.println("user_name:"+user_name+"\t user_pwd:"+user_pwd+"\t user_role:"+user_role);
			 num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return num;

	
}
}
