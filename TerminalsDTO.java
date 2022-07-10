class TerminalsDTO {
	
	public TerminalsDTO(){
		System.out.println("TerminalsDTO crea");
	}
	private String name;
	private int id;
	private String type;
	private int noOfGates;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public int getNoOfGates(){
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates){
		this.noOfGates = noOfGates;
	}
}