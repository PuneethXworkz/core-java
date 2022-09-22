package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Tester {
	
	public static void main(String[] args) {
		//using arrays concept can store heterogeneous/multiple type of data
		
		Object obj[] = new Object[3];
		obj[0]='a';
		obj[1]="Virat";
		obj[2]=2;
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		Collection<Object> col = new ArrayList<Object>();
		col.add("Rahul");
		col.add('R');
		col.add(true);
		col.add(3567);
		
		System.out.println(col);
		//col.forEach(System.out::println);
		col.remove(true);
		//col.forEach(System.out::println);
		System.out.println(col);
		
		
		
		
		
		
	}
	
	
}
