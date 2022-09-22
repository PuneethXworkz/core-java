package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalDaoSelf {
	
	public void saveHospitalInformation() {
		
		//number of columns= number of place holders(?)
		String insertQuery = "insert into patientdetails values (?,?,?,?,?,?,?,?,?,?)";		//? is a place holders
//		String SelectSQL = "SELECT * FROM company.companyinfo";

		
		Connection con = JDBCConnectionUtil.getConnection();
		
		//step 3 : create prepare statement
		
		try {
		
			//Statement state = con.createStatement();
			
			//when we use select query we use getter method
			//when we use prepared statement we use setter method
			
			PreparedStatement psmt = con.prepareStatement(insertQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Patient Id :");
			int patientId = sc.nextInt();
			System.out.print("Enter Patient Name :");
			String name = sc.next();
			System.out.print("Enter Patient address :");
			String address = sc.next();
			System.out.print("Enter Patient's contact No :");
			String contactNo = sc.next();
			System.out.print("Enter referred Dr :");
			String referredBy =sc.next();
			System.out.print("Enter consulting Dr :");
			String consulting =sc.next();
			System.out.print("Enter Room no :");
			int roomNo =sc.nextInt();
			System.out.print("Enter alternate contact");
			String alternateContact =sc.next();
			System.out.print("Enter Hospital Name :");
			String hospitalName =sc.next();
			System.out.print("Enter Hospital address :");
			String hospitalAddress =sc.next();
			
			psmt.setInt(1,patientId);
			psmt.setString(2, name);
			psmt.setString(3, address);
			psmt.setString(4, contactNo);
			psmt.setString(5, referredBy);
			psmt.setString(6, consulting);
			psmt.setInt(7, roomNo);
			psmt.setString(8, alternateContact);
			psmt.setString(9, hospitalName);
			psmt.setString(10, hospitalAddress);
			
		//step 4 : execute query
			int count =psmt.executeUpdate();
			System.out.println("Record Inserted------");

			//step 5 : close connection
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void getHospitalInformation() {
		String selectSql = "SELECT*FROM hospital.patientdetails";
		
		Connection con = JDBCConnectionUtil.getConnection();

		try {
			PreparedStatement psmt = con.prepareStatement(selectSql);
			
			ResultSet rs = psmt.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("PatientId :"+rs.getInt("PatientId"));
				System.out.println("Patient Name :"+rs.getString("name"));
				System.out.println("Patient Address :"+rs.getString("address"));
				System.out.println("Patient Contact No :"+rs.getString("contactNo"));
				System.out.println("Referred By :"+rs.getString("referredBy"));
				System.out.println("Consulting :"+rs.getString("consulting"));
				System.out.println("Room No :"+rs.getInt("roomNo"));
				System.out.println("Alternate Contact :"+rs.getString("alternateContact"));
				System.out.println("Hospital Name :"+rs.getString("hospitalName"));
				System.out.println("Hospital Address :"+rs.getString("hospitalAddress"));
			}
			con.close();

			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public void updateHopsitalInformation() {
		
		String sqlUpdate = "update patientdetails set name = name where patientId = patientId ";
		//String  sqlUpdate = "update patientdetails set name = \"Arohi\" where patientId=401 ";
		//String sqlUpdate = "update patientdetails set name = \"Kavana\" where patientId=555 ";

		Connection con = JDBCConnectionUtil.getConnection();

		try {	
			PreparedStatement psmt = con.prepareStatement(sqlUpdate);
			
//			Scanner sc = new Scanner(System.in);			
//			System.out.print("Enter exisitng patient id :");
//			int patientId = sc.nextInt();
//			System.out.print("Enter Patient Name to be updated :");
//			String name = sc.next();			
			
			int count = psmt.executeUpdate();
			System.out.println("records updated :"+count);
			
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public void deleteHospitalInformation() {
		
//		state.execute("delete from companyInfo where companyId=123;");

		
		String sqlDelete = "delete from patientdetails where patientId =401";
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			
			PreparedStatement psmt = con.prepareStatement(sqlDelete);
			
			int count =psmt.executeUpdate();
			System.out.println("Data deleted"+ count);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}

/*
 public void saveHospitalInformation() {
		
		//number of columns= number of place holders(?)
		String insertQuery = "insert into patientdetails values (?,?,?,?,?,?,?,?,?,?)";		//? is a place holders
//		String SelectSQL = "SELECT * FROM company.companyinfo";

		
		Connection con = JDBCConnectionUtil.getConnection();
		
		//step 3 : create prepare statement
		
		try {
		
			//Statement state = con.createStatement();
			
			//when we use select query we use getter method
			//when we use prepared statement we use setter method
			
			PreparedStatement psmt = con.prepareStatement(insertQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Patient Id :");
			int patientId = sc.nextInt();
			System.out.print("Enter Patient Name :");
			String name = sc.next();
			System.out.print("Enter Patient address :");
			String address = sc.next();
			System.out.print("Enter Patient's contact No :");
			String contactNo = sc.next();
			System.out.print("Enter referred Dr :");
			String referredBy =sc.next();
			System.out.print("Enter consulting Dr :");
			String consulting =sc.next();
			System.out.print("Enter Room no :");
			int roomNo =sc.nextInt();
			System.out.print("Enter alternate contact");
			String alternateContact =sc.next();
			System.out.print("Enter Hospital Name :");
			String hospitalName =sc.next();
			System.out.print("Enter Hospital address :");
			String hospitalAddress =sc.next();
			
			psmt.setInt(1,patientId);
			psmt.setString(2, name);
			psmt.setString(3, address);
			psmt.setString(4, contactNo);
			psmt.setString(5, referredBy);
			psmt.setString(6, consulting);
			psmt.setInt(7, roomNo);
			psmt.setString(8, alternateContact);
			psmt.setString(9, hospitalName);
			psmt.setString(10, hospitalAddress);
			
		//step 4 : execute query
			//int count =psmt.executeUpdate();
			System.out.println("Record Inserted------");

			//step 5 : close connection
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

 */
