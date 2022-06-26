class BankTester{

public static void main(String a[]){
	
	SBI sbi = new SBI();
	sbi.ownedBy = "Government";
	sbi.transactionTimings = "10AM - 3Pm";
	sbi.modeOfTransaction = "Online/Offline";
	sbi.currencyAccepted = "INR & All currencies Accepted";
	
	sbi.transaction();
System.out.println("Owned By :" +sbi.ownedBy+"\n"+"Transaction Timings : "+sbi.transactionTimings+"\n"+"Mode of Transaction Accepted : "+sbi.modeOfTransaction+"\n"+"Currency Accpeted & Transacted : "+sbi.currencyAccepted);
	
}


}