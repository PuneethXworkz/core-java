package dao.hospital_employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.JDBCConnectionUtil;

public class HospitalDAO {
	
	//HospitalDTO dto;
	
public void createHospitalInfo(HospitalDTO dto) {
		
		String insertQuery = "insert into hospital.patientdetails values (?,?,?,?,?,?,?,?,?,?)";		//? is a place holders
		Connection con = JDBCConnectionUtil.getConnection();
		
		//step 3 : create prepare statement
		PreparedStatement psmt;
		
		try {
			//when we use select query we use getter method
			//when we use prepared statement we use setter method
			
			psmt = con.prepareStatement(insertQuery);
			
			psmt.setInt(1,dto.getPatientId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getAddress());
			psmt.setString(4, dto.getContactNo());
			psmt.setString(5, dto.getReferredBy());
			psmt.setString(6, dto.getConsulting());
			psmt.setString(7, dto.getRoomNo());
			psmt.setString(8, dto.getAlternateContact());
			psmt.setString(9, dto.getHospitalName());
			psmt.setString(10, dto.getHospitalAddress());
			
		//step 4 : execute query
			int count =psmt.executeUpdate();
			System.out.println("Oner record Inserted------"+count);

			//step 5 : close connection
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}		

	}

	public void getHospitalInformation() {
		String selectSql = "SELECT * FROM hospital.patientdetails" ;
		Connection con = JDBCConnectionUtil.getConnection();

	try {
		PreparedStatement psmt = con.prepareStatement(selectSql);
		
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
			
		HospitalDTO dto = new HospitalDTO();
			
			dto.setPatientId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setAddress(rs.getString(3));
			dto.setContactNo(rs.getString(4));
			dto.setReferredBy(rs.getString(5));
			dto.setConsulting(rs.getString(6));
			dto.setRoomNo(rs.getString(7));
			dto.setAlternateContact(rs.getString(8));
			dto.setHospitalName(rs.getString(9));
			dto.setHospitalAddress(rs.getString(10));
			
			System.out.println("Hospital data :"+dto.toString());
		}
		con.close();

	} catch (SQLException e) {

		e.printStackTrace();
	}
	
}
	
public void updatePatientNameById(String roomNo, int patientId) {
	
	String sqlUpdate = "update hospital.patientdetails set roomNo = ? where patientId = ? ";
	Connection con = JDBCConnectionUtil.getConnection();

	try {	
		PreparedStatement psmt = con.prepareStatement(sqlUpdate);
		
		psmt.setString(1,roomNo);			
		psmt.setInt(2,patientId);						
		
		int count = psmt.executeUpdate();			
		System.out.println("1 record updated :"+count);			
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

public HospitalDTO getHospitalDataById(int patientId) {
	
	String selectQuery = "select * from hospital.patientdetails  where patientId =?";
	
	Connection con = JDBCConnectionUtil.getConnection();
	HospitalDTO dto = new HospitalDTO();
	
	try {
	
		PreparedStatement psmt = con.prepareStatement(selectQuery);
		psmt.setInt(1, patientId);
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
			dto.setPatientId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setAddress(rs.getString(3));
			dto.setContactNo(rs.getString(4));
			dto.setReferredBy(rs.getString(5));
			dto.setConsulting(rs.getString(6));
			dto.setRoomNo(rs.getString(7));
			dto.setAlternateContact(rs.getString(8));
			dto.setHospitalName(rs.getString(9));
			dto.setHospitalAddress(rs.getString(10));
			
			System.out.println("Patient Id :"+rs.getInt(1)+" Name:"+rs.getString(2)+" Address :"+rs.getString(3)+" ContactNO :"+rs.getString(4)+" ReferredBy:"+rs.getString(5)+" Consulting:"+rs.getString(6)+" RoomNo:"+rs.getString(7)+" AlternateNo:"+rs.getString(8)+" HospitalName:"+rs.getString(9)+" Hospital Address:"+rs.getString(10));
			
		}			
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return dto;			
}	

public void deleteHospitalInformationById(int id) {
	
	String sqlDelete = "delete from hospital.patientdetails where patientId =?";
	Connection con = JDBCConnectionUtil.getConnection();
	
	try {			
		PreparedStatement psmt = con.prepareStatement(sqlDelete);
		psmt.setInt(1, id);
		
		int count =psmt.executeUpdate();
		System.out.println("1 record deleted"+ count);
	
	} catch (SQLException e) {

		e.printStackTrace();
	}
}

	
	
	
	
}
