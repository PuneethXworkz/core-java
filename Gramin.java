class Gramin extends Bank {

public Gramin(){
	System.out.println("Gramin Object is created");
}

public void rateOfInterest(double interest){
	System.out.println("Gramin Bank Rate of interest");
	
	interest = interest + 2.25;
	
	super.rateOfInterest(interest);


}


}