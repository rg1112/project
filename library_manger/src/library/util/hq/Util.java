package library.util.hq;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
protected static Connection con=null;
protected static PreparedStatement ps=null;
protected static ResultSet rs=null;
static{
	getConnection();
}
public static Connection getConnection(){
	InputStream in=Object.class.getResourceAsStream("/config.properties");
	Properties p=new Properties();
	try {
		p.load(in);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		System.err.println("加载流异常");
		e1.printStackTrace();
	}
	try {
		Class.forName(p.getProperty("driver"));
		try {
			con=DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pwd"));
			//System.out.println("加载完成");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("连接数据库错误");
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.err.println("驱动加载错误");
		e.printStackTrace();
	}
	return con;
}
public void close(){
	
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
		System.err.println("关闭异常");
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Connection con=getConnection();
	try {
		ps=con.prepareStatement("select * from user");
		rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("连接成功");
		}else{
			System.out.println("连接失败");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
