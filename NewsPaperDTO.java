class NewsPaperDTO {
	public NewsPaperDTO(){
		System.out.println("NewsPaper() created");
	}
	
	private String name;
	private String type;
	private int noOfSheets;
	private String owner;
	private int price;
	
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
	
	public int getNoOfSheets(){
		return noOfSheets;
	}
	public void setNoOfSheets(int noOfSheets){
		this.noOfSheets = noOfSheets;
	}
	
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}