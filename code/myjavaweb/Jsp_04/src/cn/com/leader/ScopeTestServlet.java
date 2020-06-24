package cn.com.leader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScopeTestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("v1","这是一个request scope对象");
		request.getSession().setAttribute("v2", "这是一个session scope对象");
		request.getServletContext().setAttribute("v3", "这是一个application scope对象");
		
		//forward到一个JSP
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		//redirect
		//response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

}
