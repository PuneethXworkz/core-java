class BankAccount{
 double amount;
public BankAccount(){
System.out.println("BankAccount () created");	
}

public void deposit(double amt){
	System.out.println("Amount to be deposit "+amt);
	//System.out.println("Amount before deposit"+amount);
	amount=amount+amt;
	System.out.println("Amount after Deposit" +amount);
}
public void withdraw(double amt1){
 System.out.println("Amount to be withdraw"+amt1);
// System.out.println("Amount before withdraw" +amount);
amount=amount-amt1;
System.out.println("Amount after withdraw"+amount);
	
}
public double getBalance(){
	System.out.println("Balance :"+amount);
		return amount;
	}
	
}