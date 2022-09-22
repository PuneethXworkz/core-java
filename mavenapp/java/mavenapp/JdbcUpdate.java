package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/company";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection con = null;
		
		try {
			//step 1-load and register Driver
		//its not required, it loads automatically from vendor DB jar(Mysql.jar)
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2: Create Connection
			con = DriverManager.getConnection(url, userName, password);
			//what is driver manager(factory or helper class), getConnection(Factory or helper method to create connection object)
			

			//Step 3 : Create Statement
			Statement state = con.createStatement();
			
			//Step 4: Execute sql query.
			//state.execute("update company.companyinfo set companyName =\"PSR\" where companyId=121;");
			//state.execute("update company.companyinfo set companyName =\"MSR\" where companyId=123;");
			//state.execute("update company.companyinfo set companyName =\"LSR\" where companyId=124;");
			
			state.execute("delete from companyInfo where companyId=123;");

			//Step 5 : Close connection.
			
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
