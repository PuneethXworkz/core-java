package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AutoLoading {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		//step 1 : jvm looks for a file called java.sql.Driver(Vendor Driver) inside META-INF
		//step 2 : create connection
		
		try {
			
			Connection con = DriverManager.getConnection(url, userName, password);
		/*metadata means information of information,
		 to get additional information about database then we use con.getMetaData()
			*/
			System.out.println("----DB----"+con.getMetaData().getDatabaseProductName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
