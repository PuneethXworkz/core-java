class OximeterTester {
	
	public static void main(String args[]){
		
		OximeterDTO oxi = new OximeterDTO();
		oxi.setBrand("Oxi-Level");
		oxi.setPrice(549.99);
		oxi.setType("Digital/Battery Operated");
		oxi.setReadingsGiven("Pulse Rate/ Oxigen Level/ Blood Pressure");
		
		System.out.println(oxi.getBrand()+" "+oxi.getPrice()+" "+oxi.getType()+" "+oxi.getReadingsGiven() );
	}
	
}