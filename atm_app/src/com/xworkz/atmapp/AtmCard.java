package com.xworkz.atmapp;

public class AtmCard {
	
	public void withdraw(int withdrawalAmount) throws AtmException {
		int balance = 3500;
		
		
		  if(withdrawalAmount<=balance) {
			System.out.println("Amount withdrawn successfully");
		}else if(withdrawalAmount%100 == 0) {
			throw new AtmException("Please enter Amount in multiple's of 100's.. ");
		}else if (withdrawalAmount>balance) {
			throw new AtmException("Insufficient Balance to withdraw entered amount ");
		}

		
	}
	
	
}
