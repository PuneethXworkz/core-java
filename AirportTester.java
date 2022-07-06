class AirportTester {
	
	public static void main(String args[]){
		
		Airport air = new Airport();
		air.setName("KempeGowda International Airport");
		air.setType("International Airport");
		air.setNoOfRunways(12);
		air.setLocation("Bangalore");
		air.setNoOfTerminals(4);
		
		System.out.println(air.getName()+" "+air.getType()+" "+air.getNoOfRunways()+" "+air.getLocation()+" "+
										air.getNoOfTerminals()+"\n");
		
	}
}