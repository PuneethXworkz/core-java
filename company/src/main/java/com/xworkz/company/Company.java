package com.xworkz.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Company {

	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");
										
			Connection con = DriverManager.getConnection(url, userName, password);
			
			Statement st = con.createStatement();
			
			st.execute("insert into Company.companyInfo values(121,'JSR','Banaswadi','+91-998872765') ");
			st.execute("insert into Company.companyInfo values(123,'HSR','BasammanaPalya','+91-974334455') ");
			st.execute("insert into Company.companyInfo values(124,'BSR','Banshankari','+91-99763532') ");
			con.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
