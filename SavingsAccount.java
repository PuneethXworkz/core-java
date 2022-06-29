class SavingsAccount extends BankAccount {

double interestRate;

public SavingsAccount(double interestRate){
// super() will be called by  compiler.
this.interestRate = interestRate;
}

// calculate periodicInterest.
public double periodicInterest(){
	
	System.out.println("Interest to be added :"+amount);
	double interest = getBalance() * interestRate/100;
deposit(interest);
System.out.println("Balance after Interest added :"+amount);
	return interest;
	}

	public void transfer(double amount, BankAccount other){
		withdraw(amount);
		other.deposit(amount);
	}
	
	
}