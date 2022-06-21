class BankAccount{

static double amount;
//static variable.

//method to get totalAmount();

public static void main(String args[]){

System.out.println("main method started");
deposit(5200.00);
//invoke withDraw()
deposit(10500.00);
System.out.println("End of the main method");
}

static void deposit(double amt){
	//(double amt)=parameter/parameterized variable
	System.out.println("Invoked deposit()");
	System.out.println("Amount to be deposit" +amt);
	System.out.println("Amount before deposit" + amount);
 amount= amount+amt;
System.out.println("Amount after deposit" + amount);
System.out.println("end of deposit"); 
}


} 