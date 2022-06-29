class AccountTester{

public static void main(String a[]){
	
	SavingsAccount sa = new SavingsAccount(2.0);
	sa.deposit(6000);
	sa.withdraw(2000);
	sa.periodicInterest();
	double amount = sa.getBalance();
	
	SavingsAccount other = new SavingsAccount(2.0);
	sa.transfer(100, other);
	
	double totalAmount = other.getBalance();
System.out.println("Amount transferred to other Account "+totalAmount);	


CurrentAccount ca = new CurrentAccount(2.0, 1.5);
ca.deposit(300.0);
ca.withdraw(500);
ca.deposit(2000);
ca.deposit(1200);
ca.deposit(5000);


 System.out.println("Start of Current Account ()"); 
} 

}
