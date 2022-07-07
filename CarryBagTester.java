class CarryBagTester {

public static void main(String args[]){
	
	CarryBagDTO carry = new CarryBagDTO();
	//carry.name = "";
	//carry.price = "";
	
	carry.setName("Fresh Mart Carry");
	carry.setPrice(6.99);
	
	System.out.println(carry.getName() +" "+ carry.getPrice());
	carry.holdThings();
		
}

}