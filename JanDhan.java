class JanDhan extends Bank {

public JanDhan(){
	System.out.println("JanDhan object is created");
}

public void rateOfInterest(double interest){
	System.out.println("Jan Dhan Bank Rate of interest");
	
	interest=interest+1.70;
	super.rateOfInterest(interest);
		
}


}