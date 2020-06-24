package cn.com.leadar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javassist.bytecode.Descriptor.Iterator;

public class ListProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//List products=(List)request.getAttribute("products");
		HttpSession session= request.getSession();
		List products=(List)session.getAttribute("ps");
		
		response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");

			out.println(" 现在选择的物品是：<br/>");
			for ( Iterator iterator=products.iterator();iterator.hasNext();){
				String productsId= iterator.next();
				out.println(productId+",");
				
			}
			
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
	
	}

}
