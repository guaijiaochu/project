package cn.com.leader;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSTLTestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("sex", "����");
		request.getSession().setAttribute("age", "30");
		getServletContext().setAttribute("address","����");
		
		request.setAttribute("something", "<font  color='red'>���</font>");
		
		
		
		
		Customer c=new Customer();
		c.setId(100);
		c.setName("����");
		c.setSex("��");
		
		request.setAttribute("person", c);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
