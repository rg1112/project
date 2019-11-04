package hq.service.com;

import java.sql.SQLException;
import java.util.ArrayList;

import hq.c3p0.com.GetC3p0;
import hq.javabean.com.FengYi;
import hq.javabean.com.Goods;
import hq.javabean.com.Jiao_Yi;

public class GoodsDao extends GetC3p0 {
	//展示商品交易
	public ArrayList<Jiao_Yi> show() {
		ArrayList<Jiao_Yi> list = new ArrayList<Jiao_Yi>();
		try {
			con = dataSource.getConnection();
			String sql = "SELECT j.j_id,COUNT(j.g_id) c_num ,g.g_id,g.g_name,profit.num,g.g_cb_price,g.g_xs_price ,(g.g_xs_price-g_cb_price)*profit.num profit from (goods g LEFT JOIN jiao_yi j on g.g_id=j.g_id)LEFT JOIN(SELECT g.g_id,g.g_name,sum(j.j_num) num  from goods g LEFT JOIN jiao_yi j on g.g_id=j.g_id GROUP BY g.g_id) as profit on profit.g_id=g.g_id  GROUP BY g.g_id";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int g_id = rs.getInt("g_id");
				String g_name = rs.getString("g_name");
				int j_num = rs.getInt("num");
				double g_cb_price = rs.getDouble("g_cb_price");
				double g_xs_price = rs.getDouble("g_xs_price");
				double j_profit = rs.getDouble("profit");
				Jiao_Yi j = new Jiao_Yi(g_id, j_num, j_profit, g_cb_price, g_xs_price, g_name);
				j.setJ_c_num(rs.getInt("c_num"));
				list.add(j);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	//展示商品
	public ArrayList<Goods> select(FengYi f) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		try {
			con = dataSource.getConnection();
			String sql = "SELECT * from goods LIMIT ?,?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, f.getStart());
			ps.setInt(2, f.getRow());
			rs = ps.executeQuery();
			while (rs.next()) {
				int g_id = rs.getInt("g_id");
				String g_name = rs.getString("g_name");
				double g_cb_price = rs.getDouble("g_cb_price");
				double g_xs_price = rs.getDouble("g_xs_price");
				String g_maker = rs.getString("g_maker");
				Goods g = new Goods(g_id, g_name, g_cb_price, g_xs_price, g_maker);
				list.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	//总记录条数
	public int selectnum() {
		int num=0;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT COUNT(*) size from goods ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				 num =rs.getInt("size");
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return num;
	}
	//查找一个商品
	public ArrayList<Goods> selectupdate(int gid) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		try {
			con = dataSource.getConnection();
			String sql = "SELECT * from goods where g_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,gid );
			rs = ps.executeQuery();
			while (rs.next()) {
				int g_id = rs.getInt("g_id");
				String g_name = rs.getString("g_name");
				double g_cb_price = rs.getDouble("g_cb_price");
				double g_xs_price = rs.getDouble("g_xs_price");
				String g_maker = rs.getString("g_maker");
				Goods g = new Goods(g_id, g_name, g_cb_price, g_xs_price, g_maker);
				list.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	//删除商品
	public int delete(int g_id) {
		int num = 0;
		try {
			con = dataSource.getConnection();
			String sql = "delete from goods where g_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, g_id);
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	//添加商品
	public int insert(Goods g) {
		int num = 0;
		try {
			con = dataSource.getConnection();
			String sql = "INSERT into goods(g_name,g_cb_price,g_xs_price,g_maker) VALUES(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, g.getG_name());
			ps.setDouble(2, g.getG_cb_price());
			ps.setDouble(3, g.getG_xs_price());
			ps.setString(4, g.getG_maker());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	//更新一个商品
	public int update(Goods g) {
		int num = 0;
		try {
			con = dataSource.getConnection();
			String sql = "UPDATE goods set g_name=?,g_cb_price=?,g_xs_price=?,g_maker=? WHERE g_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, g.getG_name());
			ps.setDouble(2, g.getG_cb_price());
			ps.setDouble(3, g.getG_xs_price());
			ps.setString(4, g.getG_maker());
			ps.setInt(5, g.getG_id());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
}
