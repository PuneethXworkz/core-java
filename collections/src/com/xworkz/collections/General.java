package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class General {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection col = new ArrayList();
		col.add("Vikrant");
		col.add(false);
		col.add('A');
		col.add(1);
		col.add("F&F-90");
		
		//col.remove(1);
		col.forEach(System.out::println);
		
		
		

	}

}
