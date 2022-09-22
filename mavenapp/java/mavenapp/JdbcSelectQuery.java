package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery {

	public static void main(String[] args) {

		String SelectSQL = "SELECT * FROM company.companyinfo";
		String url ="jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		//Step 2 :
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			
			//step 3 :
			
			Statement st = con.createStatement();
			
	//step 4: always better to use executeQuery for non-DML query(i,e select Query)
	/*executeQuery will return ResultSet interface, ResultSet interface holds table data,to check whether the table has records or not, 
	we use ResultSet.next();,if records are present than RS.next() will return true else false.
	
	to get column data we should use ResultSet.getX(index number); X represents data type; we can give index number or column name
				*/
			
			/*
			 whenever insert,update,delete only dml query ie executeUpdate should be used
			 */
			
			ResultSet rs= st.executeQuery(SelectSQL);
			while(rs.next()) {
				System.out.print("CompanyId :"+rs.getInt("companyId"));
				System.out.print(" CompanyName :"+rs.getString("companyName"));
				System.out.print(" CompanyAddress :"+rs.getString("address"));
				System.out.println( " CompanyContact :"+rs.getString("contact"));
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
	}

}
