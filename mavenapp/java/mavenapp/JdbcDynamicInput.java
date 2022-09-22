package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDynamicInput {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter ID :");
		int courseid = sc.nextInt();
		System.out.print("Enter Course Name :");
		String courseName = sc.next();
		System.out.print("Enter Course duration :");
		String duration = sc.next();
		System.out.print("Enter Faculty Available :");
		int facultyavailable = sc.nextInt();
		
		String insertsql= String.format("insert into xworkz3.courses "+"values(%d,'%s','%s',%d)"+"",courseid,courseName,duration,facultyavailable);
		
		
		System.out.println(insertsql);
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			
			Statement state = con.createStatement();//Statement is a interface
			
			int numberOfRowAffected = state.executeUpdate(insertsql);
			System.out.println("Inserted data :"+numberOfRowAffected);
						
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally{
			sc.close();
		}
		
	}

}
