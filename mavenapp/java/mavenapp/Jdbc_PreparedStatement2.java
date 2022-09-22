package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_PreparedStatement2 {
	
	public static void main(String[] args) {
		
		try {
		
			Connection con = DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);
			
			PreparedStatement psmt = con.prepareStatement("insert into hospital.patientdetails values(?,?,?,?,?,?,?,?,?,?)");
			
//			psmt.setInt(1, 11);
//			psmt.setString(2, "Param");
//			psmt.setString(3, "Himachala");
//			psmt.setString(4, "+91-9900112265");
//			psmt.setString(5, "Dr.Himesh");
//			psmt.setString(6, "Dr.Reshamiya");
//			psmt.setInt(7, 101);
//			psmt.setString(8, "+91-9900112266");
//			psmt.setString(9, "Ananya");
//			psmt.setString(10, "Rajajinagar");
			
//			psmt.setInt(1, 12);
//			psmt.setString(2, "Pasina");
//			psmt.setString(3, "Panaga");
//			psmt.setString(4, "+91-9876543277");
//			psmt.setString(5, "Dr.Paschi");
//			psmt.setString(6, "Dr.Pakri");
//			psmt.setInt(7, 102);
//			psmt.setString(8, "+91-9876543278");
//			psmt.setString(9, "Ananya");
//			psmt.setString(10, "Rajajinagar");
//			
			psmt.setInt(1, 13);
			psmt.setString(2, "Gogga");
			psmt.setString(3, "Ganj");
			psmt.setString(4, "+91-8787876556");
			psmt.setString(5, "Dr.Gajni");
			psmt.setString(6, "Dr.Gani");
			psmt.setInt(7, 103);
			psmt.setString(8, "+91-9089786756");
			psmt.setString(9, "Kanva");
			psmt.setString(10, "Nandini LAyout");
		
			int count = psmt.executeUpdate();
			System.out.println("Count is "+count);
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
