package studentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dao.JDBCConnectionUtil;

public class PuneethStudentDao {

	
	public void createStudent() {
		
		String insertQuery = "insert into student.studentinfo values (?,?,?,?,?)";		//? is a place holders

		StudentDto st = new StudentDto();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name :");
		String studentName = sc.next();
		System.out.print("Enter Student Id :");
		int studentId = sc.nextInt();
		System.out.print("Enter Student RollNo :");
		int rollNo = sc.nextInt();
		System.out.print("Enter Student's Age :");
		int age = sc.nextInt();
		System.out.print("Enter year Of pass Out :");
		String yearOfPassOut =sc.next();

		
		st.setStudentName(studentName);
		st.setStudentId(studentId);
		st.setRollNo(rollNo);
		st.setAge(age);		
		st.setYearOfPassOut(yearOfPassOut);
		
//		System.out.println("------------student----------"+st.toString());
		Connection con = JDBCConnectionUtil.getConnection();
		
		//step 3 : create prepare statement
		
		try {
					
			//when we use select query we use getter method
			//when we use prepared statement we use setter method
			
			//executeQuery-select i.e only fetching
			//executeUpdate-create(insert), update, delete
			
			PreparedStatement psmt = con.prepareStatement(insertQuery);
			
			psmt.setString(1, st.getStudentName());
			psmt.setInt(2, st.getStudentId());
			psmt.setInt(3, st.getRollNo());
			psmt.setInt(4, st.getAge());
			psmt.setString(5, st.getYearOfPassOut());
			
			
		//step 4 : execute query
			int count =psmt.executeUpdate();
			System.out.println("Record Inserted------"+count);

			//step 5 : close connection
			con.close();
			sc.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}		
		
	}
}
