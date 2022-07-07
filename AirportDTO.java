class AirportDTO {
	
	public AirportDTO(){
		System.out.println("Airport() created");
	}
	
	private String name;
	private String type;
	private int noOfRunways;
	private String location;
	private int noOfTerminals;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public int getNoOfRunways(){
		return noOfRunways;
	}
	public void setNoOfRunways(int noOfRunways){
		this.noOfRunways = noOfRunways;
	}
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}
	
	public int getNoOfTerminals(){
		return noOfTerminals;
	}
	public void setNoOfTerminals(int noOfTerminals){
		this.noOfTerminals = noOfTerminals;
	}

}