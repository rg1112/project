package hq.servlet.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hq.service.com.GoodsDao;

/**
 * Servlet implementation class DelGoods
 */
@WebServlet("/DelGoods")
public class DelGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DelGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int g_id = Integer.parseInt(request.getParameter("g_id"));
		GoodsDao g = new GoodsDao();
		int num = g.delete(g_id);
		if (num > 0) {
			request.getRequestDispatcher("ShowGoods").forward(request, response);
		} else {
			System.out.println("错误");
		}
	}

}
