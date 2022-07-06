class Games {
	
	public Games(){
		System.out.println("Games() created");
	}
	
	private String name;
	private String ownedBy;
	private String isAvailableIn;
	private String canBePlayedBy;
	private String type;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getOwnedBy(){
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy){
		this.ownedBy = ownedBy;
	}
	
	public String getIsAvailableIn(){
		return isAvailableIn;
	}
	public void setIsAvailableIn(String isAvailableIn){
			this.isAvailableIn = isAvailableIn;
	}
	
	public String getCanBePlayedBy(){
		return canBePlayedBy;
	}
	public void setCanBePlayedBy(String canBePlayedBy){
		this.canBePlayedBy = canBePlayedBy;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
}