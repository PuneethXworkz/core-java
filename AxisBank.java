class AxisBank extends Bank {

public AxisBank(){
	System.out.println("AxisBank object created");
}
public void rateOfInterest(double interest){
	
	System.out.println("Axis Bank Rate of Interest");
	
	interest = interest + 1.4;
	super.rateOfInterest(interest);

	}


}