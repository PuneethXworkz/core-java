class BankOfBaroda extends Bank {

public BankOfBaroda(){
	System.out.println("BankOfBaroda object created");
}

public void rateOfInterest(double interest){
	
	System.out.println("Bank Of Baroda Rate of interest");
interest = interest+1.3;
	super.rateOfInterest(interest);
	
	}

}