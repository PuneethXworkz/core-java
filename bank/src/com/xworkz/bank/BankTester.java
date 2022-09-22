package com.xworkz.bank;

public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VijayaBank bank = new VijayaBank();
		bank.name = "SBI";
		bank.location = "Peenya Branch";
		bank.getAmount();
		bank.getBalance();
		bank.getMoney();
		
		System.out.println(bank.name+" "+bank.location);
		
		
		
	}

}
