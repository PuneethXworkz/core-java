class CarryBagDTO {
	
	public CarryBagDTO (){
	
	}
	
private String name;									//to achieve Encapsulation
private double price;

public String getName(){								//getter and setter 
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}
public void setPrice(double price){
	this.price = price;
}

void holdThings(){
	
	System.out.println("To carry curryy");
}
}