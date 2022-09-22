 package com.xworkz.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTesterForString {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Jamshedpur");
		list.add("Kolkota");
		list.add("Ambola");
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}


/*
 Collections is a class in java, filtering the existing data we make use of collections,
 Collections is used to sort the data List type of data
 Collections is also called as utility class in higher level, 
 collection is a interface in java.
 
 java 8 feature
 
 String Class also implements Comparable interface, so sorting is easy for String object
 for Own created object Comparable is created as it is not implemented Comparable class
 
 default sorting technique in java is comparable using compareTo(), 
 id is considered to be default value.
 
 sort oly sorts that data which object is trying to implement comparable interface.
 */