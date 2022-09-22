package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class MethodsOfCollection {
	
	public static void main(String[] args) {
		Collection<Object> coll = new ArrayList<Object>();
		System.out.println(coll.isEmpty());//checks whether the collection is empty or not/ data added or not
		coll.add("Object");	//add()- adds single data or object in the collection
		
		coll.add(1);
		coll.add("null");
		coll.add(null);
		coll.add('d');
		coll.add(true);
		coll.add(987.098);
		System.out.println(coll);
		coll.forEach(System.out::println);//or data can be fetched by 
		System.out.println(coll.isEmpty());
		
		Collection<Object> coll2 = new ArrayList<Object>();
		
		coll2.add("Bangalore");
		coll2.add("Mysore");
		System.out.println("before addAll "+coll2);
		coll2.addAll(coll);	//addAll() adds the collection type of data- holds all previous ref data into the the new object
		System.out.println("after addAll :"+coll2);
		boolean remove = coll2.removeAll(coll);	//remove all elements of old collection, in the new collection 
		System.out.println("Is elements removed in new collection :"+remove);
		System.out.println("After removeAll :"+coll2);
		
		boolean check = coll.contains('d');	//contains()-checks whether the data available
		System.out.println(check);
		
		//coll2.clear();		//clear()-clears the data of the collection ref/object
		//System.out.println(coll2);
		
		boolean contains = coll2.containsAll(coll);	//checks whole collection present or not   comment clear() and add another ref as above
		System.out.println(contains);
		
		System.out.println(coll.size());	//returns the size of the collections
		System.out.println(coll2.size());
		
		System.out.println(coll.hashCode());	//returns unique code of the collection
		System.out.println(coll2.hashCode());
		
	}
	
}
