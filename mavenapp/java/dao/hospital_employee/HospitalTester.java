package dao.hospital_employee;

public class HospitalTester {

	public static void main(String[] args) {
		
		HospitalDAO dao = new HospitalDAO();
		
		//If you want to insert new record change the setter data
		HospitalDTO dto = new HospitalDTO();
		
//		dto.setPatientId(786);
//		dto.setName("Tanu");
//		dto.setAddress("Lg nagar");
//		dto.setContactNo("+91-9012763489");
//		dto.setReferredBy("Dr.Adi");
//		dto.setConsulting("Dr.Anthya");
//		dto.setRoomNo(131);
//		dto.setAlternateContact("+91-9721347865");
//		dto.setHospitalName("Nadi");
//		dto.setHospitalAddress("yamanagar");
//		
//		dao.createHospitalInfo(dto);
		
		//to read or fetch the data
		//dao.getHospitalInformation();
		
		//update the information
//		HospitalDTO hospitalDto = dao.getHospitalDataById(202);
//		hospitalDto.setRoomNo("443");
//		//dao.updatePatientNameById(Integer.parseInt(hospitalDto.getRoomNo()),dto.getPatientId());
		dao.updatePatientNameById("520",111);
//		
		//dao.getHospitalDataById(666);
		
		//delete the data from table;
		//dao.deleteHospitalInformationById(555);
		
	}

}
