class BeerTester{

public static void main(String a[]){
	
	KingFisher beer = new KingFisher();
	beer.price = 140;
	beer.quantity = "750 Ml";
	beer.alcoholPercent = "19.7%";
	beer.manufactureDate = "22-12-2021";
	beer.expiry = "Best before 28 months";
	
	
	beer.getHigh();
System.out.println("Price : "+beer.price+"\n"+"Quantity : "+beer.quantity+"\n"+"Alcohol Percent : "+beer.alcoholPercent+"\n"+"Manufactured date : "+beer.manufactureDate+"\n"+"Expiry : "+beer.expiry);
	
}
}