package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_PreparedStatement {
	
	public static void main(String[] args) {
		
		//two ways to create a constants 1.final 2.enum class
		
		try {
			
			Connection con = DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);
	
			//step 3;
			PreparedStatement pst = con.prepareStatement("insert into company.companyinfo values(?,?,?,?)");
			
			pst.setInt(1, 133);
			pst.setString(2, "FSR");
			pst.setString(3, "Peenya");
			pst.setString(4, "+91-992238747");
			
			//step 4:
			int count = pst.executeUpdate();
			System.out.println("Count :"+count);
		
		
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
	
		
	//write a prgm to inert hospital data using prepared statement
		
	}
}
