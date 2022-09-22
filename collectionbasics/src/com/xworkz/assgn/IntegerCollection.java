package com.xworkz.assgn;

import java.util.ArrayList;
import java.util.Collection;

public class IntegerCollection {

	public static void main(String[] args) {
		
		Collection<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(3);
		in.add(5);
		in.add(8);
		in.add(1);
		in.add(9);
		
		in.forEach(System.out::println);
	}

}
