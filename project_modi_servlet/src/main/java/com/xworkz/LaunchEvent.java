package com.xworkz;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LaunchEvent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String message = "New Launch has been initiated";
		
		resp.getWriter().println(message);
		
	/*
	 When we  click submit button with action name	in tom cat server, first actionName  
	  will be searched in web.xml, if action Name is found then it'll redirect to servlet class 
	  then process the request and send back servlet respo nse client.
	  
	  If action name is not found in web.xml, then we will get 404 erro(not found exception)
*/		
	
	}
	
}
