package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class General1 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		List col = new LinkedList<E>();
		col.add("Xworkz, BTM");
		col.add("Xworkz, RAjajinagar");
		col.add("Java");
		col.add("SQL");
		col.add("Web Technology");
		col.add("JDBC");
		col.add("Frameworks");
		col.add(24000);
		col.add("2nd block");
		col.add(26000);
		col.add("Angular");
		col.add("React");
		

		
		
		int sizeValue = col.size();
		System.out.println(sizeValue);
		col.forEach(System.out::println);
		
		System.out.println(col);
		//col.size();
		//col.forEach(System.out::println);
		
		System.out.println(col.size());
	}

}
//
//fro(){
//	System.out.println(a[i]);
//}
