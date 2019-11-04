package hq.c3p0.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class GetC3p0 {
public static ComboPooledDataSource dataSource=new ComboPooledDataSource();
public static Connection con=null;
public static PreparedStatement ps=null;
public static ResultSet rs=null;
public static Connection getConnection(){
	try {
		 con=dataSource.getConnection();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
/**
 * 
 */
public static void close(){
	try {
		if(rs!=null){
			rs.close();
		}
		if(ps!=null){
			ps.close();
		}
		if(con!=null){
			con.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Connection con=getConnection();
	if(con!=null){
		System.out.println("连接成功");
	}
	select1();
}
public static void select1(){
	String sql="select * from goods";
	try {
		con=dataSource.getConnection();
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			int g_id=rs.getInt("g_id");
			String g_name=rs.getString("g_name");
			System.out.println(g_id+","+g_name);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		close();
	}
}
}
