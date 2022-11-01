package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.dto.EmployeeDto;

public class EmployeeDao {
	
	//In spring boot dao class  is called as repository
	
	public Boolean saveEmployee(EmployeeDto dto) {
		
		System.out.println("----------DAO---------");
		
		//jdbc logic / DATA BASE LOGIC
		
		String url ="jdbc:mysql://localhost:3306/games";
		String userName = "root";
		String pwd = "Xworkzodc@123";
		int result=0;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, pwd);
			
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?,?)");
			
			psmt.setInt(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getEmail());
			psmt.setString(4, dto.getPassword());
			
			 result = psmt.executeUpdate();
										
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println("----------return to caller (service class)--------");
	
		return result >=1 ? true:false;			//ternary operator ?true : false
	}

}
