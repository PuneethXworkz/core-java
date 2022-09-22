package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery_Execute {
	
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//int id = sc.nextInt();
	//String name sc.next();
    //String adress = sc.next();
	
	//insert into xworkz.students value(111,'asvcx','ertyuio','vfgbhj87');	
	//for insert statement 
		String selectSQL2 = "SELECT id,name,address,rollno from xworkz.xworkzstudent;";
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
			Boolean res = st.execute(selectSQL2);
			
		if(res==true) {
			ResultSet rs = st.getResultSet();
			//ResultSet rs= st.executeQuery(selectSQL2);
			while(rs.next()) {
				
				System.out.print(" StudentId :"+rs.getInt(1));//resultSet Index
				System.out.print("StudentName :"+rs.getString(2));
				System.out.print(" RollNo :"+rs.getString("rollno"));//column name
				System.out.println(" StudentAddress :"+rs.getString("address"));
				
			}//end of while
		}//end of if
		else {
			System.out.println("dml query");
		}
		
		}
		catch (SQLException e) {

			e.printStackTrace();
		}//end of catch
					
		}
}


/*
 using executeUpdate insert a record into table
 using Scanner input 
 
 
 Result is a interface which holds tale data
 */


