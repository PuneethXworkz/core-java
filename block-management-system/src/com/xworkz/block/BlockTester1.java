package com.xworkz.block;

public final class BlockTester1 {
	
	final static int j = 100;

	public static void main(String args []) {
		
	//	j = 90;// this value can not be assigned because we declared final static int j =100;
		//final method can be overloaded.can not be modified , can not be change or can not be inherited.
	}
	
	public static void method() {
		System.out.println("method without parameter");
	}
	

	public static void method(int i) {
		System.out.println("method with parameter");
	}

}
