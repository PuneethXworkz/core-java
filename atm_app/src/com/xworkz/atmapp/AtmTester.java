package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount to be withdrawn :");
		int amount = sc.nextInt();
		
		AtmCard atm = new AtmCard();
		
		try {
			atm.withdraw(amount);
		} catch (AtmException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Closing all coslty resources is mandatory so closing them in finally block");
			
			sc.close();//Either exception occurred or not finally block gets executed so all costly resources get closed.
			
			System.gc();//Calling gc mechanism externally. can be called/ written by developer also
			//for cleanup gc() called internally uses finalize().
		} 
		
	System.out.println("Main method ended");	
	}

}
