package library.method.hq;

import java.sql.SQLException;

import library.javabean.hq.Borrowinfo;
import library.javabean.hq.Reader;
import library.util.hq.Util;

public class ReaderMethod extends Util {
	public int insert(Reader re){
		int num=0;
		try {//关闭自动提交
			con.setAutoCommit(false);
			//新增读者的sql
			String sql ="insert into reader (reader_name,reader_borrowno,reader_sex,reader_phone,reader_school,reader_class) VALUES(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, re.getReader_name());
			ps.setString(2, re.getReader_borrowno());
			ps.setString(3, re.getReader_sex());
			ps.setString(4, re.getReader_phone());
			ps.setString(5, re.getReader_school());
			ps.setString(6, re.getReader_class());
			num=ps.executeUpdate();
			String sql1 = "insert into user values(?,?,?)";
			ps = con.prepareStatement(sql1);
			ps.setString(1, re.getReader_borrowno());
			ps.setString(2, "123");
			ps.setString(3, "读者");
			num = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return num;
	}

	public int select1(){
		int num=0;
		String sql="SELECT  reader_name,book_name,brinfo_borrowtime,brinfo_returntime from reader r, borrowinfo l,book b where r.reader_id=l.reader_id and b.book_id = l.book_id and  DATE_FORMAT(brinfo_returntime,'%m-%d') > DATE_FORMAT(NOW(),'%m-%d') and DATE_FORMAT(brinfo_borrowtime,'%m-%d') < DATE_FORMAT(ADDDATE(NOW(),INTERVAL 7 day),'%m-%d')";
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
			String reader_name=rs.getString("reader_name");
			String book_name=rs.getString("book_name");
			String brinfo_borrowtime=rs.getString("brinfo_borrowtime");
			String brinfo_returntime=rs.getString("brinfo_returntime");
			 System.out.println("reader_name:"+reader_name+"\t book_name:"+book_name+"\t brinfo_borrowtime:"+brinfo_borrowtime+"\t brinfo_returntime:"+brinfo_returntime);
			 num++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	public int select2(){
		int num=0;
		String sql="SELECT  reader_name,book_name,brinfo_borrowtime,brinfo_returntime from reader r, borrowinfo l,book b where r.reader_id=l.reader_id and b.book_id = l.book_id and brinfo_borrowtime<now()";
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				
			String reader_name=rs.getString("reader_name");
			String book_name=rs.getString("book_name");
			String brinfo_borrowtime=rs.getString("brinfo_borrowtime");
			String brinfo_returntime=rs.getString("brinfo_returntime");
			 System.out.println("reader_name:"+reader_name+"\t book_name:"+book_name+"\t brinfo_borrowtime:"+brinfo_borrowtime+"\t brinfo_returntime:"+brinfo_returntime);
			 num++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	public int jieshu(Borrowinfo re){
		int num=0;
		try {//关闭自动提交
			con.setAutoCommit(false);
			//新增读者的sql
			String sql ="insert into borrowinfo (book_id,reader_id,brinfo_borrowtime,brinfo_returntime,brinfo_cash) VALUES(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, re.getBook_id());
			ps.setInt(2, re.getReader_id());
			ps.setString(3, re.getBrinfo_borrowtime());
			ps.setString(4, re.getBrinfo_returntime());
			ps.setInt(5, re.getBrinfo_cash());
			num=ps.executeUpdate();
			String sql1 = "update book set book_condition=? where book_id=?";
			ps = con.prepareStatement(sql1);
			ps.setString(1, "借出");
			ps.setInt(2, re.getBook_id());
			num = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return num;
	
		
	}
	public int huanshu(int b){
		int num=0;
		try {//关闭自动提交
			con.setAutoCommit(false);
			//新增读者的sql
			String sql ="delete from borrowinfo where book_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, b);
			num=ps.executeUpdate();
			String sql1 = "update book set book_condition=?  where book_id=?";
			ps = con.prepareStatement(sql1);
			ps.setString(1, "未借");
			ps.setInt(2, b);
			num = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return num;
	
		
	}
}
