class BigBasketTester {
	public static void main(String args[]){
		
		BigBasket big = new BigBasket();
		big.setOwnedBy("Tata Digital Limited");
		big.setTypeOfService("Online Super Market");
		big.setOrigin("India");
		big.setAmbassador("Sharukh Khan");
		
		System.out.println(big.getOwnedBy()+" "+big.getTypeOfService()+" "+big.getOrigin()+" "+big.getAmbassador()  );
	}
}