package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeTester {

	public static void main(String[] args) {
		
		String insertQry= "insert into employee values(?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username = "root";
		String password = "Xworkzodc@123";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement psmt = con.prepareStatement(insertQry);
			
			EmployeeDTO dto = new EmployeeDTO();
			
			dto.setId(668);
			dto.setName("kahani");
			dto.setAddress("DevLoka");
			dto.setSalary(33303);
			dto.setDateOfJoin("23/12/2022");
			
			psmt.setInt(1,dto.getId());
			psmt.setString(2,dto.getName());
			psmt.setString(3, dto.getAddress());
			psmt.setInt(4, dto.getSalary());
			psmt.setString(5, dto.getDateOfJoin());
			int count = psmt.executeUpdate();
			
			System.out.println("One data inserted succesfully -----:"+count);
			
			psmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
