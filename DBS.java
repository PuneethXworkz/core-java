class DBS extends Bank {

public DBS(){
	System.out.println("DBS object is created");
}

public void rateOfInterest(double interest){
	System.out.println("DBS Bank Rate of interest");
	
interest = interest+1.35;

super.rateOfInterest(interest);

}
}