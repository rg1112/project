package hq.servlet.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hq.c3p0.com.GetC3p0;

/**
 * Servlet Filter implementation class FilterLogin
 */
@WebFilter("/FilterLogin")
public class FilterLogin implements Filter {

    /**
     * Default constructor. 
     */
    public FilterLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		String type=request.getParameter("type");
		System.out.println(type);
		
		if(type.equals("管理员")){
		try {String user_name=(String)req.getParameter("user");
			String user_pwd=(String)req.getParameter("pwd");
			Connection con=GetC3p0.getConnection();
			String sql="select * from manager where m_name=? and m_pwd=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, user_pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				chain.doFilter(req, res);
			}else{
				req.getRequestDispatcher("login.jsp").forward(req, res);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			GetC3p0.close();
		}
		}
		else if(type.equals("用户")){
			try {String user_name=(String)req.getParameter("user");
			String user_pwd=(String)req.getParameter("pwd");
			Connection con=GetC3p0.getConnection();
			String sql="select * from user where user_name=? and user_pwd=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, user_pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				request.setAttribute("u_id", rs.getInt("user_id"));
				chain.doFilter(req, res);
			}else{
				req.getRequestDispatcher("login.jsp").forward(req, res);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			GetC3p0.close();
		}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
