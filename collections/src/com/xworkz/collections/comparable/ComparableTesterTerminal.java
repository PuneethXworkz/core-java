package com.xworkz.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collections.comparable.comparatorTerminal.TerminalGatesComparator;
import com.xworkz.collections.comparable.comparatorTerminal.TerminalNameComparator;

public class ComparableTesterTerminal {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new TerminalsDTO(121,"KVSR",13,"Moderate","Domestic"));
		list.add(new TerminalsDTO(144,"APJ",7,"High","International"));
		list.add(new TerminalsDTO(332,"ABVP",5,"Low","Local"));
		list.add(new TerminalsDTO(102,"PRK",9,"High","International"));
		
		Collections.sort(list);
		System.out.println("Sorting by Id");
		list.forEach(System.out::println);

		System.out.println("Sorting by Name");
		Collections.sort(list, new TerminalNameComparator());
		list.forEach(System.out::println);

		System.out.println("Sorting by NoOfgates");
		Collections.sort(list, new TerminalGatesComparator());
		list.forEach(System.out::println);
		
	}

}
