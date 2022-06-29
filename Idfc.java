class Idfc extends Bank {

public Idfc(){
	System.out.println("Idfc object created");
}

public void rateOfInterest(double interest){
	System.out.println("Idfc Bank Rate of interest");
	
	interest=interest+2.10;
	
	super.rateOfInterest(interest);
	
}

}