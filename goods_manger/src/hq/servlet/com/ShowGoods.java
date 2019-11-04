package hq.servlet.com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.utils.Page;
import hq.javabean.com.FengYi;
import hq.javabean.com.Goods;
import hq.service.com.GoodsDao;

/**
 * Servlet implementation class ShowGoods
 */
@WebServlet("/ShowGoods")
public class ShowGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowGoods() {
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
		String nowPage = request.getParameter("page");
		//System.out.println(nowPage);
		GoodsDao g=new GoodsDao();
		FengYi f=new FengYi();
		 if(nowPage == null){
      	   f.setStart(0);
         }
         else{
      	   f.setStart((Integer.parseInt(nowPage)-1) * f.getRow());
         }
		// System.out.println(f.getRow());
		 //System.out.println(f.getStart());
		ArrayList<Goods> list=g.select(f);
		int num=g.selectnum();
		   Page<Goods> page  = new Page<Goods>();
           if(nowPage != null){
           	page.setPage(Integer.parseInt(nowPage));
           }
           page.setRows(list);
           page.setSize(f.getRow());
           page.setTotal(num);
           
           request.setAttribute("page", page);
		request.setAttribute("list", list);
		request.getRequestDispatcher("showgoods.jsp").forward(request, response);
	}

}
