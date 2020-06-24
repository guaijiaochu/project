package cn.com.leadfar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScopeTestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("v1","request 对象11");
		request.getSession().setAttribute("v2", "session 对象11");
		getServletContext().setAttribute("v3", "application 对象11");
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
