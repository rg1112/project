package library.method.hq;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import library.javabean.hq.User;
import library.util.hq.Util;

public class Login extends Util {
	public List<Object> login(User u) {
		List<Object> list = new ArrayList<Object>();
		String sql = "SELECT * from user where user_role=? and user_name=? and user_pwd=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, u.getUser_role());
			ps.setString(2, u.getUser_name());
			ps.setString(3, u.getUser_pwd());
			rs = ps.executeQuery();
			while (rs.next()) {
				User u1 = new User();
				u1.setUser_role(rs.getString("user_role"));
				u1.setUser_name(rs.getString("user_name"));
				u1.setUser_pwd(rs.getString("user_pwd"));
				// String user_name=rs.getString("user_name");
				// String user_pwd=rs.getString("user_pwd");
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
