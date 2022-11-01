package com.xworkz;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("-----Hello------");
		Instant inst = Instant.now();
		String message = "welcome modi to Bangalore "+inst.toString();	
		//System.out.println("Message :"+message);
		
		resp.getWriter().println("Message :"+message);
	}
}
