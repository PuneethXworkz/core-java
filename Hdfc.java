class Hdfc extends Bank {

public Hdfc(){
	System.out.println("Hdfc object is created");
}

public void rateOfInterest(double interest){
	System.out.println("Hdfc Bank Rate of interest");
	
	interest = interest+1.65;
	super.rateOfInterest(interest);
	
	
}

}