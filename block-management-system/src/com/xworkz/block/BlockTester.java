package com.xworkz.block;

public class BlockTester {
	
	int blockInit;
	{
		System.out.println("instance block is executed");
		blockInit = 10;
	}
	
	static int blockInIt;
	static {
		System.out.println("static block is executed");
		blockInIt = 20;
		System.out.println("Static value :"+BlockTester.blockInIt);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		BlockTester blockTester = new BlockTester();
		System.out.println("Instance value :"+blockTester.blockInit);
		
		System.out.println("main method ended");
	}
}
