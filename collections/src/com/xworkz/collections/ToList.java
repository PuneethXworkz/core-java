package com.xworkz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToList {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();	//List 
		
	//	List list = new LinkedList();	// difference in ArrayList and Linked list is in the memory side
		
		list.add("Bangalore");
		list.add("Mysore");
		list.add("Hassan");
		list.add("Bangalore");
		list.add("Jamkhandi");
		
		//System.out.println(list);
		
		list.forEach(System.out::println);
		System.out.println("get the data based on index :");
		System.out.println(list.get(3)); // 
	}

}

//diff btw arrayIndexOutOf bound exception and indexOutOfBound excep, search
// arrayIndexOutOfBound is parent of IndexOutOfBound

/*
 Some important points to remember
 1. List is index based.
 2. List is Sub interface of collection
 3. List can allow Duplicates
 4. List allow null values.
 5. it preserves the insertion order as it is index based. 
 order of input given to array, we will get the output in the same way is called insertion order
 
 */

/*
 1.Difference btw collection and list, difference btw collection
 2. methods in collection and list
 3. 
 
 
 
 * */
