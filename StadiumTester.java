class StadiumTester {
public static void main(String args[]){
	System.out.println("Main method() created");
	Stadium stad = new Stadium();
	stad.setName ("Chinna Swamy");
	stad.setNoOfSeats (887);
	stad.setLocation ("Bangalore");
	stad.setType ("International Stadium");
	stad.setOwner ( "Swamy");
	
	System.out.println(stad.getName()+" "+stad.getNoOfSeats()+" "+stad.getLocation()+" "+stad.getType()+" "+stad.getOwner()+" ");
	
}

}