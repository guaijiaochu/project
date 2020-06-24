package cn.com.leader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScopeTestServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("v1","����һ��request scope����");
		request.getSession().setAttribute("v2", "����һ��session scope����");
		request.getServletContext().setAttribute("v3", "����һ��application scope����");
		
		//forward��һ��JSP
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		//redirect
		//response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

}
