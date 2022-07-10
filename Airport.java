class Airport {
	
	//Airport has many Terminals
	TerminalsDTO dtos[];
	
	//instance variable
	int index;
	
	public Airport(int size){
		System.out.println("Welcome to KempeGowda International Airport");
		dtos = new TerminalsDTO[size];
	}
	
	public boolean createTerminals(TerminalsDTO dto) {
		System.out.println("TerminalsDTO() invoked");
		boolean isAdded = false;
		if(dto!= null && dto.getName()!= null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Terminal added successfully");
		}
		else{
			System.out.println("Please provide correct details");
		}
		return isAdded;		
	}
	
	public void getTerminalDetails(){
		System.out.println("Inside getTerminalDetails()");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getType()+" "+dtos[i].getNoOfGates() );
		}
		
		
	}
	
	
}	