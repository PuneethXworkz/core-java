class WeaponsDTO {
	
	public WeaponsDTO(){
		System.out.println("Weapons() created");
	}
	
	private String name;
	private String type;
	private String firingMode;
	private String price;
	private String isUsedFor;
	
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
	
	public String getFiringMode(){
		return firingMode;
	}
	public void setFiringMode(String firingMode){
		this.firingMode = firingMode;
	}
	
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price = price;
	}
	
	public String getIsUsedFor(){
		return isUsedFor;
	}
	public void setIsUsedFor(String isUsedFor){
		this.isUsedFor = isUsedFor;
	}
} 