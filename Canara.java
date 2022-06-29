class Canara extends Bank {

public Canara(){
	System.out.println("Canara Object is created");
}

public void rateOfInterest(double interest){
	System.out.println("Canara Bank Rate of interest");
	
	interest = interest+1.0;
	super.rateOfInterest(interest);
	
}
}