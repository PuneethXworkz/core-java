package com.xworkz.app;

import java.sql.*;
/*Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/

public class JdbcApp {

	static final String USERNAME ="root";
	static final String PASSWORD = "root";
	static final String URL="jdbc:mysql://localhost:3306";
	
	public static void main(String[] args) {
		
		createJDBC();
	}
	
	public static void createJDBC() {
		
		//step 1.load mysql driver		
		try {
			Class.forName("com.mysql.jdbc.Driver");//to us ethis we need to add mysql driver jar
			
			//step to create connection			
			Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
			
			
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

/*
 Load and register the Driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 
 DriverManager.getConnection("URL",USERNAME,PASSWORD);
 */
