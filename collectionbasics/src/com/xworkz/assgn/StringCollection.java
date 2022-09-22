package com.xworkz.assgn;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollection {

	public static void main(String[] args) {
		
		Collection<String> str = new ArrayList<String>();
		
		str.add("Pumba");
		str.add("Omba");
		str.add("Luha");
		str.add("sion");
		str.add("yoki");
		str.add("zuri");
		str.add("Zarki");
		str.add("Yasnaya");
		str.add("Pochiniki");
		
		str.forEach(System.out::println);
		
		
	}

}
