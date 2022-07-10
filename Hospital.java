class Hospital {
	
	//has many patients
	PatientDTO[] dtos;
	
	//instance variable
	int index;
	
	public Hospital (int size){
		System.out.println("Welcome to Raksha Hospital");
		dtos = new PatientDTO[size];
	}
	
	public boolean createPatient(PatientDTO dto){
		System.out.println("Inside createPatient() ");
		boolean isAdded = false;
		if(dto!=null && dto.getName()!=null && dto.getId()!=0 && dto.getAddress()!=null 
		/*&& dto.getGender()!=null */ && dto.getContactNo()!=null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Patient details added succesfully");
		}
		else{
			System.out.println("Cannot add patient... please fill correct details");
		}
		return isAdded;
	}
	
	public void getPatientDetials(){
		System.out.println("Inside getPatientDetials() ");
		for(int i = 0; i<dtos.length; i++ ){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()
			+" "+/*dtos[i].getGender()+" "*/dtos[i].getContactNo() );
	}

}
}