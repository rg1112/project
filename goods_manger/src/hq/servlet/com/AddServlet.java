package hq.servlet.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hq.c3p0.com.PNumber;
import hq.javabean.com.Goods;
import hq.service.com.GoodsDao;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
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
		request.setCharacterEncoding("utf-8");
		String g_name = request.getParameter("g_name");
		String g_cb_prices = request.getParameter("g_cb_price");
		String g_xs_prices = request.getParameter("g_xs_price");
		String g_maker = request.getParameter("g_maker");
		// 校验数据
		if (g_name == null || g_name.equals("")) {

			request.getRequestDispatcher("addgoods.jsp").forward(request, response);

			return;
		}

		else if (g_cb_prices == null || g_cb_prices.equals("")) {

			request.getRequestDispatcher("addgoods.jsp").forward(request, response);
			return;
		} else if (!(PNumber.isNumeric(g_cb_prices))) {
			request.getRequestDispatcher("addgoods.jsp").forward(request, response);
			return;
		} else if (g_xs_prices == null || g_xs_prices.equals("")) {
			request.getRequestDispatcher("addgoods.jsp").forward(request, response);
			return;
		} else if (!(PNumber.isNumeric(g_xs_prices))) {
			request.getRequestDispatcher("addgoods.jsp").forward(request, response);
			return;
		} else if (g_maker == null || g_maker.equals("")) {

			request.getRequestDispatcher("addgoods.jsp").forward(request, response);
			return;
		} else {
			double g_cb_price = Double.parseDouble(request.getParameter("g_cb_price"));
			double g_xs_price = Double.parseDouble(request.getParameter("g_xs_price"));
			Goods goods = new Goods(g_name, g_cb_price, g_xs_price, g_maker);
			GoodsDao g = new GoodsDao();
			int num = g.insert(goods);
			if (num > 0) {
				request.getRequestDispatcher("ShowGoods").forward(request, response);
			} else {
				System.out.println("错误");
			}
		}
	}

}
