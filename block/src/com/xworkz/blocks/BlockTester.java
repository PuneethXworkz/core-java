package com.xworkz.blocks;

public class BlockTester {
	
	public BlockTester() {
		System.out.println(getClass().getSimpleName()+"created");
	}
	
	int blockInt;
	static int blockinit;
	 {
		System.out.println("instance block is executed");
		 blockInt= 10;
	}

	static{
		System.out.println("static block executed");
		blockinit =15;
		System.out.println(BlockTester.blockinit);
	}
	public static void main(String[] args) {
	System.out.println("main method created");
		
	BlockTester block = new BlockTester();
	System.out.println("Object created");
	System.out.println(block.blockInt);
	
	System.out.println("main method ended");

	}

}
