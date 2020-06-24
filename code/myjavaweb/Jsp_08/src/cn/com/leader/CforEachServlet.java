package cn.com.leader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CforEachServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	List cs= new ArrayList();
	
	for (int i=0;i<10;i++){
		Customer c=new Customer();
		c.setId(i+10);
		c.setName("¹Ë¿Í"+i);
		c.setSex(Math.random()>0.5?"ÄÐ":"Å®");
		cs.add(c);
		
		request.setAttribute("customers", cs);
		
		for (int i=0;i<cs.size();i++){
			Customer c=(Customer)cs.get(i);
		c.getName();
		}
		
		request.getRequestDispatcher("/c_foreach.jsp").forward(request, response);
		
	}
	
	}

}
