class BankAccount1{

static double amount=12000.00d;

public static void main(String args[]){

System.out.println("main method started");
withdraw (2000);
withdraw(1000);

System.out.println("End of main method");

}


static void withdraw(double wdr){
	System.out.println("Invoked withdraw()");
	System.out.println("Amount to be Withdraw" + wdr);
	System.out.println("Amount before Withdraw"+amount);
	amount= amount-wdr;
	System.out.println("Amount after deposit" + amount);
	System.out.println("End od withdraw");
}

}