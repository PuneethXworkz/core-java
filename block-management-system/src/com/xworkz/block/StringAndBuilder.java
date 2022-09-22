package com.xworkz.block;

public class StringAndBuilder {

	public static void main(String[] args) {
		
		String b = "Bavani";
		
		b = b+" Gowda";
		System.out.println("String behaviour");
		System.out.println(b.indexOf('w'));
		System.out.println(b);
		System.out.println(b.indexOf('o', 2));
		
		System.out.println("StringBuilder behaviour");
		StringBuilder build = new StringBuilder("Reshma");
		System.out.println(build);
		//System.out.println(build.reverse());
		build.append(" Sharma");
		System.out.println(build);
		System.out.println(build.reverse());
		
		
	}

}
