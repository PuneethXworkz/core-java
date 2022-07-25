package com.xworkz.blocks;

public class BlockTester1 {

	public BlockTester1() {
	System.out.println(this.getClass().getSimpleName()+"  object is created ");
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
//		System.out.println(BlockTester.blockinit);
	}
	
	public static void main(String[] args) {
	System.out.println("main method created");
	
	BlockTester1 tester = new BlockTester1();
	
	Block block = new Block();
	//System.out.println(block);
	
	System.out.println("main method ended");

	}
	
	
}
