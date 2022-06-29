class CurrentAccount extends BankAccount {
int freeTransactions = 4;
int noOfTransaction =0;
double transactionFee;
double interestRate;
//double totalTransactionFee;

public CurrentAccount(double interestRate, double transactionFee){
	System.out.println("Current Account() created");
	this.interestRate = interestRate;
	this.transactionFee = transactionFee;
	
}

public void deposit(double amt){
	System.out.println("Invoke deposit()");	
	System.out.println("Amount to be deposit "+amt);
	System.out.println("Amount before deposit"+amount);
	amount=amount+amt;
	System.out.println("Amount after Deposit" +amount);
	System.out.println("End of deposit()");
noOfTransaction++;
	}
	
	public void withdraw(double amt1){
 System.out.println("Invoked withdraw");
 System.out.println("Amount to be withdraw"+amt1);
// System.out.println("Amount before withdraw" +amount);
amount=amount-amt1;
if(amount<amt1){
	System.out.println("Insufficient balance");
	}
	else{
		System.out.println(amount);
	}
System.out.println("Amount after withdraw"+amount);
System.out.println("End of withdraw");
noOfTransaction++;
	}
	
public double getBalance(){
	System.out.println("Balance :"+amount);
		return amount;
}

public double deductionFee(){
	double totalTransactionFee = 0;
	if(noOfTransaction>freeTransactions){
		totalTransactionFee = transactionFee*(noOfTransaction-freeTransactions);
		amount=amount-transactionFee;
		System.out.println("Total Transaction Fee :"+totalTransactionFee);
		System.out.println("Balance after transaction fee deduction :"+amount);
			}
	else{
		getBalance();
	}
	
	return totalTransactionFee;
	
}
public double periodicInterest(){
	System.out.println("Interest to be added :"+amount);
	double inter = getBalance() * interestRate/100;
deposit(inter);
System.out.println("Balance after Interest added :"+amount);
	return inter;
	}

}