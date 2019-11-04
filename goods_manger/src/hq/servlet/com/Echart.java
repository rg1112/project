package hq.servlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hq.javabean.com.Jiao_Yi;
import hq.service.com.GoodsDao;

/**
 * Servlet implementation class Echart
 */
@WebServlet("/Echart")
public class Echart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Echart() {
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
		GoodsDao g=new GoodsDao();
		ArrayList<Jiao_Yi> list=g.show();
		ArrayList<Double> profitlist=new ArrayList<Double>();
		ArrayList<String> namelist=new ArrayList<String>();
		for(Jiao_Yi j:list){
			profitlist.add(j.getJ_profit());
			namelist.add(j.getG_name());
		}
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("nameList", namelist);
		map.put("profitList", profitlist);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw=response.getWriter();
		pw.write(JSON.toJSONString(map));
		
	}

}
