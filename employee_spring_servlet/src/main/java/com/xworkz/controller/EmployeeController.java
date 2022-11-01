package com.xworkz.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.EmployeeDto;
import com.xworkz.service.EmployeeService;

public class EmployeeController  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("-------Controller Logic------");
		//CONTROLLER LOGIC		
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
	
			//create dto object, set all UI data into 
			EmployeeDto dto = new EmployeeDto();
			dto.setName(name);
			dto.setEmail(email);
			dto.setPassword(password);
			
			//pass dto to service class.
			EmployeeService service = new EmployeeService();
			
		Boolean result =service.saveEmployee(dto);	 
		
		//RequestDispatcher dispacther = null;
		//req.getRequestDsipatcher("Success.jsp")
		
		if(result==true) {
	resp.getWriter().println("Data Inserted successfully");
			
		}
		else {
			System.out.println("Data not inserted");
		}			
			/*
			 J2ee notes in Github */			
	}

}
