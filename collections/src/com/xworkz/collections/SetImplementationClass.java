package com.xworkz.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationClass {

	public static void main(String[] args) {
	
		
		//Set set = new HashSet(); // set can be created using hashset(Class), has Set is interface
		
		
		/*Set set = new LinkedHashSet();
		set.add("Rama");
		set.add("Krishna");
		set.add("Rama");
		set.add("Koorma");
		set.add(null);
		set.add(null);*/
		
		Set set = new TreeSet(); //Independent of preserve insertion data, to get sorted data.
		//SortedSet is sub inteface of set.
		set.add("Lanka");
		set.add("Bangla");
		set.add("Zimbabwe");
		set.add("Colombu");
		set.add("Arka");
		
		
		set.forEach(System.out::println);		

	}

}

/*
 Set interfaces does not allow duplicates 
 only one null value can be added in set interface
 set does not preserve the insertion order,
 it is been used to add only unique data.
 
 Linked HashSet and HashSet
 - HashSet does not allow duplicates and does not preserves Insertion order.
 LinkedHasSet does not allow duplicates and preserves Insertion Order. follows doubly link datastructure
 TreeSet does not preserve insertion order and output will be in alphabetical order.
 
 
  */
