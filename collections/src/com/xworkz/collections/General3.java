package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class General3 {

	public static void main(String[] args) {
		
		Collection col = new ArrayList();
		
		System.out.println("Is collection is empty or not");
		System.out.println(col.isEmpty());
		//boolean emp = col.isEmpty();	// to check whether collection is empty or not
		//System.out.println(emp);
		
		col.add(9986040739L);		//add() excepts Obejct type parameter
		col.add(9739129329L);
		col.add(9738700428L);
		col.add(9886416881L);
		col.add(true);
		col.add('A');
		col.add(-2222222222f);
		col.add(43309.876d);
		col.add(null);
		col.add("null");
		col.add(0);
		
		boolean con = col.contains('A');//contains - to check or compare value is present in collection or not
		System.out.println("Is Char present in collection :"+con);
		
		//col.clear();		//clear() to clear the data present in the collection/array
		System.out.println(col);
		//col.forEach(System.out::println);
		
		Collection coll = new ArrayList();
		coll.addAll(col);		// addAll excepts Collection type parameter
		coll.add("mankata");
		coll.add("Major");
		coll.add("Janu");
		
		System.out.println("Before Remove all");
		System.out.println(coll);
		
		boolean rem = coll.removeAll(col);
		boolean check = coll.containsAll(col);//to check all th data avialbel in old collection
		
		System.out.println(check);
		System.out.println(coll); 	//to print all
		
		boolean rem1 = col.removeAll(coll);
		//System.out.println(coll);
		
//		System.out.println("After clear all");
//		coll.clear();
//		System.out.println(coll);
		
		System.out.println("after retain all");
		boolean ret = col.retainAll(coll);
		System.out.println(ret);
		System.out.println(col);
		System.out.println(coll);
		
		//retainAll
		
		//use get ,method, add using index and without index
		
		//list documentataion, linked list arraylist, vector list
		
		/*
		 
		 */
		
		
		

	}

}
