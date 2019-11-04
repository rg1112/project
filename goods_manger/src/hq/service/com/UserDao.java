package hq.service.com;

import java.sql.SQLException;
import java.util.ArrayList;

import hq.c3p0.com.GetC3p0;
import hq.javabean.com.User;

public class UserDao extends GetC3p0 {
public void select(){
	ArrayList<User> u=new ArrayList<User>();
	
	String sql="select * from user";
	try {
		con=dataSource.getConnection();
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			int user_id=rs.getInt("user_id");
			String user_name=rs.getString("user_name");
			String user_pwd=rs.getString("user_pwd");
			User user=new User(user_id, user_name, user_pwd);
			u.add(user);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}public int login(String user,String pwd){
	//ArrayList<User> u=new ArrayList<User>();
	int num=0;
	try {
		con=dataSource.getConnection();
		String sql="select * from user where user_name=? and user_pwd=? ";
		ps=con.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pwd);
		rs=ps.executeQuery();
		while(rs.next()){
			//int user_id=rs.getInt("user_id");
//			String user_name=rs.getString("user_name");
//			String user_pwd=rs.getString("user_pwd");
//			User user=new User( user_name, user_pwd);
//			u.add(user);
			num++;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		close();
	}
	return num;
}

}
