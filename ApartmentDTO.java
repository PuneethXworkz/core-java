class ApartmentDTO {	//1st Rule			//Syntax for writting getter and setter
	
	DTO[Data Transfer Object]			//2nd Rule	// design pattern
public ApartmentDTO(){
	
}	
	//3rd Rule
	private int id;				//property/member/states of an object.
	private String name;
	private String ownerName;
	
//4th Rule
public int getId(){ 					// we write getter by having  a prefix as get	
	return id
}	
public void setId(int id){				// we write setter by having a prefix as set
	this.id = id ;
}

public String getName(){
	return name;
}

	
}



// (public) (return type used while declaring variable) (getVariableName){
	//return variableName;
	
	
// (public)(return typ will be void while declaring variable)(setVariableName){
	// this.variableName = variableName;