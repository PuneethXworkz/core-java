class OximeterDTO {
	
	public OximeterDTO(){
		System.out.println("Oximeter() created");
	}
	
	private String brand;
	private double price;
	private String type;
	private String readingsGiven;
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	
	public String getReadingsGiven(){
		return readingsGiven;
	}
	public void setReadingsGiven(String readingsGiven){
		this.readingsGiven = readingsGiven;
	}
	
}