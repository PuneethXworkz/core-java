class Library {
	
	//Library has Many books
	BookDTO dtos[];
	
	//instance variable
	int index;
	
	public Library (int size) {
		System.out.println("Welcome to Samskruthi Library");
		dtos = new BookDTO[size];		
	}
	
	public boolean addingBook(BookDTO dto){
		System.out.println("addingBook() invoked");
		boolean isAdded = false;
		if(dto!= null && dto.getName()!= null){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Book added Successfully");
		}
		else{
			System.out.println("Please fill the details correctly");
		}
		return isAdded;
	}
	
	public void getBookDetails(){
		System.out.println("Inside getBookDetails() ");
		for(int i = 0; i < dtos.length; i++){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAuthor()+" "+
			dtos[i].getNoOfPages()+" "+dtos[i].getType() );
		}
	}
	
	
}