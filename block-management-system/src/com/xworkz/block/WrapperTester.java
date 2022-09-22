package com.xworkz.block;

public class WrapperTester {

	public static void main(String[] args) {
		
		int value = 78;
		
		//auto boxing 
		Integer value1= 78;
		System.out.println(value == value1);
		
		//auto unboxing.
		value = value1.intValue();

		//creating object by string  literals
		String str = null;
		
		String str1 = "null";
		
		//System.out.println(str.equals(str1));//null pointer exception in run time.
		
		//bcoz comparing equals method from null data(default value) to string value
	
		System.out.println(str1.equals(str));//false bcoz comparing from string value to null data.
		
		System.out.println(str == str1);//always compare's the address of the data's not the value  or content  of the data.
		/*Literals object creation are stored in scp(string constant pool) inside heap memory
		 new keyword object are stored in heap memory
		
		*/
		
		
		
		
		
	}

}
