package cn.com.leadar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		List products=null;
		if(session.getAttribute("ps")==null){
			products=new ArrayList();
			session.setAttribute("ps", products);
		}else{
			products = (List) session.getAttribute("ps");
		}
		
		String ProductId = request.getParameter("ProductId");
		products.add(ProductId);
		
		
		//request.setAttribute("products", products);
		request.getRequestDispatcher("/servlet/ListProduct").forward(request, response);
	
	}
}
