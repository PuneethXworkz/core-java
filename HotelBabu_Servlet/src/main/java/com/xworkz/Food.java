package com.xworkz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Food extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String message = req.getParameter("displayFood");
		
		System.out.println("Display Message :"+message);
		
		resp.getWriter().println("<h3>Food you ordered is :"+message+"Served"+"</h3>");
	}
	
}
