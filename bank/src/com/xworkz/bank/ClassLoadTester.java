package com.xworkz.bank;

public class ClassLoadTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			m1();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}
	
	public static void m1() throws ClassNotFoundException {
		System.out.println("m1 method started");
		m2();
		
		System.out.println("m1 method ended");
	}
	
	public static void m2() throws ClassNotFoundException {
		System.out.println("m2 method started");
		m3();
		
		System.out.println("m2 method ended");
	}
	
	public static void m3()  throws ClassNotFoundException {
		System.out.println("m3 method started");
		Class.forName("java.lang.String");
		
//		try {
//			Class.forName("com.xworkz.airport.cruds");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("m3 method ended");
	}
}

