class Equitas extends Bank {

public Equitas(){
	System.out.println("Equitas obejct created");
}

public void rateOfInterest(double interest){
	System.out.println("Equitas Bank Rate of interest");
	
	interest = interest+1.86;
	super.rateOfInterest(interest);	
	
}


}