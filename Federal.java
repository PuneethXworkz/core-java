class Federal extends Bank {

public Federal(){
	System.out.println("Federal object is created ");
}

public void rateOfInterest(double interest){
	System.out.println("Federal Bank Rate of interest");
	
	interest = interest+2.88;
	super.rateOfInterest(interest);

}


}