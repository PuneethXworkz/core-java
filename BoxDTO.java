class BoxDTO {
	
public BoxDTO(){
	System.out.println("Box Object is created");
}
	private String brand;
	private double price;
	private String color;
	private String size;
	private int noOfSets;

	
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
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public String getSize(){
		return size;
	}	
	public void setSize(String size){
		this.size = size;
	}
	
	public int getNoOfSets(){
		return noOfSets;
	}
	public void setNoOfSets(int noOfSets){
		this.noOfSets = noOfSets;
	}
	
	
}