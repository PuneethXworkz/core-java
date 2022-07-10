import java.util.Scanner;

class HospitalTester {
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter No of Patients :");
		int size = sc.nextInt();
		Hospital hos = new Hospital(size);
			for(int i=0; i<size; i++){
		System.out.print("Enter Patient's Name :");
		String name = sc.next();
		System.out.print("Enter Patient's Id :");
		int id = sc.nextInt();
		System.out.print("Enter Patient's Address :");
		String address = sc.next();
		System.out.print("Patient's Contact No :");
		String contactNo = sc.next();
		//System.out.print("Patients gender :");
		//Gender gender = sc.next();
		
		PatientDTO dto = new PatientDTO(); 
		dto.setId(id);
		dto.setName(name);
		dto.setAddress(address);
		//dto.setGender(gender);
		dto.setContactNo(contactNo);
		hos.createPatient(dto);
	}				
		hos.getPatientDetials();
	}	

}