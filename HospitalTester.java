class HospitalTester {
	
	public static void main(String a[]){
		
	Hospital hos = new Hospital();
		
		PatientDTO dto = new PatientDTO(); 
		dto.setId(101);
		dto.setName("Rahi");
		dto.setAddress("Kormangala, Bangalore");
		dto.setGender(Gender.male);
		dto.setContactNo("+91_9933228856");
		hos.createPatient(dto);
		
		PatientDTO dto1 = new PatientDTO();
		dto1.setId(202);
		dto1.setName("Vamika");
		dto1.setAddress("BM Road ,Hassan");
		dto1.setGender(Gender.female);
		dto1.setContactNo("+91_876637281");
		hos.createPatient(dto1);
		
		PatientDTO dto2 = new PatientDTO();
		dto2.setId(303);
		dto2.setName("Arohi");
		dto2.setAddress("Frazer Town");
		dto2.setGender(Gender.female);
		dto2.setContactNo("+91_9956238750");
		hos.createPatient(dto2);
		
		PatientDTO dto3 = new PatientDTO();
		dto3.setId(404);
		dto3.setName("Barkat");
		dto3.setAddress("Batkal");
		dto3.setGender(Gender.male);
		dto3.setContactNo("+91_9076125578");
		hos.createPatient(dto3);
		
		PatientDTO dto4 = new PatientDTO();
		dto4.setId(505);
		dto4.setName("Kush");
		dto4.setAddress("Peenya ");
		dto4.setGender(Gender.male);
		dto4.setContactNo("+91_8863499922");
		hos.createPatient(dto4);
		
		hos.getPatientDetials();
	}	
	
}