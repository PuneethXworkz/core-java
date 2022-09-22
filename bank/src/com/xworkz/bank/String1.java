package com.xworkz.bank;

public class String1 {
	
	public static void main(String[] args) {
		
		long i = 555888877L;
		
		System.out.println("main method started");
		
		try{
			int y = 54/0 ;
	 
		Long.parseLong("i");
		
		}catch(NumberFormatException |ArithmeticException ex) {//declaring both exception in single block
			ex.printStackTrace();
		System.out.println(i);
		
		}
		
		System.out.println("main method ended");
	}
}
