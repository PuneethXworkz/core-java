package com.xworkz.assgn;

import java.util.ArrayList;
import java.util.Collection;

public class CharCollection {

	public static void main(String[] args) {
		
		
		Collection<Character> ch = new ArrayList<Character>();
		
		ch.add('a');
		ch.add('z');
		ch.add('j');
		ch.add('d');
		ch.add('l');
		ch.add('z');
		ch.add('x');
		ch.add('9');
		ch.add('2');
		ch.add(' ');
		
		ch.forEach(System.out::println);
	
	
	}
}
