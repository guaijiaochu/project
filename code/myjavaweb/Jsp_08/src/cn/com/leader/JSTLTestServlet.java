package cn.com.leader;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSTLTestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("sex", "张三");
		request.getSession().setAttribute("age", "30");
		getServletContext().setAttribute("address","北京");
		
		request.setAttribute("something", "<font  color='red'>随便</font>");
		
		
		
		
		Customer c=new Customer();
		c.setId(100);
		c.setName("王五");
		c.setSex("男");
		
		request.setAttribute("person", c);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
