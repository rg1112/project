package hq.servlet.com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hq.javabean.com.Goods;
import hq.service.com.GoodsDao;

/**
 * Servlet implementation class UpdateShow
 */
@WebServlet("/UpdateShow")
public class UpdateShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int gid=Integer.parseInt(request.getParameter("g_id"));
		request.getAttribute("g_id");
		GoodsDao g=new GoodsDao();
		ArrayList<Goods> list=g.selectupdate(gid);
		request.setAttribute("list", list);
		request.getRequestDispatcher("updategoods.jsp").forward(request, response);
	}
	}


