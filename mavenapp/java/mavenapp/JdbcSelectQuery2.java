package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery2 {

	public static void main(String[] args) {
		
		String selectSQL = "SELECT id,name,address,rollno from xworkz.xworkzstudent;";
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
			
			ResultSet rs= st.executeQuery(selectSQL);
			while(rs.next()) {
		//next method is boolean type, returns true if records are present in the table,else throws an exception
				
				System.out.print(rs.getInt(1));//resultSet Index
				System.out.print("StudentName :"+rs.getString(2));
				System.out.print(" RollNo :"+rs.getString("rollno"));//column name
				System.out.println(" StudentAddress :"+rs.getString("address"));
				
			}			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}		
	}

}


/*
 create new class selectQuery_execute
 */
 