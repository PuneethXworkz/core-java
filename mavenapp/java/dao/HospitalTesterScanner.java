package dao;

import java.util.Scanner;

public class HospitalTesterScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		HospitalDao hos = new HospitalDao();		
		
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
		
		
		HospitalDto dto = new HospitalDto();

		dto.setPatientId(patientId);
		dto.setName(name);
		dto.setAddress(address);
		dto.setContactNo(contactNo);
		dto.setReferredBy(referredBy);
		dto.setConsulting(consulting);
		dto.setRoomNo(roomNo);
		dto.setAlternateContact(alternateContact);
		dto.setHospitalName(hospitalName);
		dto.setHospitalAddress(hospitalAddress);
		
		hos.createHospitalInformation(dto);
		
		
		String option = null;
		
		do {
			System.out.println("Enter 1 to fetch all the hospital data :");
			System.out.println("Enter 2 to");
			System.out.println("Enter 3 to ");
			System.out.println("Enter 4 to ");
			System.out.println("Enter choice :");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : hos.getHospitalInformation();
					break;
					
			case 2 : 
				System.out.print("Enter existing PatientId :");
				int existingId = sc.nextInt();
				System.out.print("Enter name to be updated :");
				String updatedName = sc.next();
				hos.updateHopsitalDataById( updatedName, existingId);
				break;
				
			case 3:
				System.out.print("Enter existing Patient Id :");
				int existId = sc.nextInt();
				hos.getHospitalDataById(existId);
			case 4:
				System.out.print("Enter existing Patient ID to be deleted :");
				int existsId = sc.nextInt();
				hos.deleteHospitalInformationById(existsId);
			
			default: System.out.println("Given choice cannot be delivered");;
				
			}
			System.out.println("Do you want to continue y/n :");
			option = sc.next();
		}
		while(option.equals("y"));
		
		
	}
	
	


}


//Assignment


/*
 Student Project(id,name,rollNo,age,marks);
 Employee project(id,employeeName,employeeId,salary,designation);
 
 */