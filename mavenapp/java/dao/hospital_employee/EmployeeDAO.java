package dao.hospital_employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.JDBCConnectionUtil;

public class EmployeeDAO {

public void createEmployeeInfo(EmployeeDTO dto) {
		
		String insertQuery = "insert into hospital.employeedetails values (?,?,?,?,?,?)";		//? is a place holders
		Connection con = JDBCConnectionUtil.getConnection();
		
		//step 3 : create prepare statement
		PreparedStatement psmt;
		
		try {
			//when we use select query we use getter method
			//when we use prepared statement we use setter method
			
			psmt = con.prepareStatement(insertQuery);
			
			psmt.setInt(1,dto.getEmployeeId());
			psmt.setString(2, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setString(3, dto.getAddress());
			psmt.setString(4, dto.getContactNo());
			psmt.setString(5, dto.getGender());
	

			
		//step 4 : execute query
			int count =psmt.executeUpdate();
			System.out.println("Oner record Inserted------"+count);

			//step 5 : close connection
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}		

	}

	
	
}
