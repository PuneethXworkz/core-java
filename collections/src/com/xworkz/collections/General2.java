package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class General2 {		//to compare array and collection by printing ref in sop

	
	public static void main(String[] args) {
		
		List col = new ArrayList();
		
		col.add("Variables");
		col.add("Methods");
		col.add("Arrays");
		col.add("Class & Objects");
		col.add( 34 );
		col.add("Method Overloading");
		col.add("Constructor");
		col.add("Constructor oveloading");
		col.add("Inheritance");
		col.add("Polymorphism");
		col.add("Abstraction");
		col.add("Encapsulation");
		col.add("Constructor Chaining");
		col.add("method overriding");
		col.add("String class");
		col.add("Wrapper class");
		col.add("Object Class");
		col.add("Collections");
		col.add("String builder & Buffer");
		
		col.forEach(System.out::println); // or use oly reference to print
		//also
		System.out.println(col);
		
int i[] = {11,22,33,44};
System.out.println(i);//prints oly alpha numeric data, or array ref,(not human understandable)
		
	}
}
