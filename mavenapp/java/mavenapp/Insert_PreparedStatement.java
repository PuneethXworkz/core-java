package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;

public class Insert_PreparedStatement {

	public static void main(String[] args) {
		
	}
	
	static void prepareStament() {
		
		
		
	}
	static void statement() {
		
		String selectSQL = "SELECT id,name,address,rollno from xworkz.xworkzstudent;";
		String url ="jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			
			Instant startTime = Instant.now();
			System.out.println("Start Time----statement "+startTime);
			
			Statement st = con.createStatement();
			
			ResultSet rs= st.executeQuery(selectSQL);
			while(rs.next()) {
				
				System.out.print(" StudentId :"+rs.getInt(1));//resultSet Index
				System.out.print("StudentName :"+rs.getString(2));
				System.out.print(" RollNo :"+rs.getString("rollno"));//column name
				System.out.println(" StudentAddress :"+rs.getString("address"));
				
			}			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}		

	}
}
