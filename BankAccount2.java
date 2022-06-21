class BankAccount2{
static double amount;

public static void main(String a[]){
// invoking deposit method(12000)
deposit(12000);
getTotalAmount ();
//invoking withraw deposit(12000-3000=9000)
withdraw(3000);
getTotalAmount ();
//invoking deposit method(9000+1000=10000)
deposit(1000);
getTotalAmount ();
//invoking withraw method(1000-4000=6000)
withdraw(4000);
getTotalAmount ();
//Invoking deposit(6000+8000=14000)
deposit(8000);
getTotalAmount();
//invoking withdraw method(14000-5500=)
withdraw(5500);
getTotalAmount();

deposit(3300);
getTotalAmount();

withdraw(2950);
//Invoking Total Amount Method.
getTotalAmount ();
}

public static void deposit(double amt){
	System.out.println("Amount to be deposit "+amt);
	System.out.println("Amount before deposit"+amount);
	amount=amount+amt;
	System.out.println("Amount after Deposit" +amount);
}
public static void withdraw(double amt1){
 System.out.println("Amount to be withdraw"+amt1);
 System.out.println("Amount before withdraw" +amount);
amount=amount-amt1;
System.out.println("Amount after withdraw"+amount);
	
}
public static void getTotalAmount(){
		System.out.println(amount);
	}
}