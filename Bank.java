class Bank {
double amount=1500;

public void rateOfInterest(double interest){

double totalInterest = amount*interest/100;

System.out.println("Rate of Interest is "+interest);
amount = amount+totalInterest;
System.out.println("Total Interest :"+totalInterest);
System.out.println("Amount after interest added :"+amount+"\n");
}


}