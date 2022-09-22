package com.xworkz.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collections.comparable.comparatorFood.NameComparator;
import com.xworkz.collections.comparable.comparatorOrder.OrderNameComparator;
import com.xworkz.collections.comparable.comparatorOrder.OrderPriceComparator;
import com.xworkz.collections.comparable.comparatorOrder.OrderTypeComaparator;

public class ComparableTesterOrder {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new OrderDTO(111,"Puma",5999.99,"Shoes"));
		list.add(new OrderDTO(121,"Nyka",888.99,"Personal Care"));
		list.add(new OrderDTO(221,"Ambati",1999.99,"Groceries"));
		list.add(new OrderDTO(343,"Cintu",199.90,"Chocolates"));
		list.add(new OrderDTO(494,"Jolly Rancher",499.00,"Snacks"));
		
		Collections.sort(list);
		System.out.println("Sorting with ID");
		list.forEach(System.out::println);
		
		System.out.println("Sorting with name");
		Collections.sort(list, new OrderNameComparator());
		list.forEach(System.out::println);
		
		System.out.println("Sorting By price");
		Collections.sort(list, new OrderPriceComparator());
		list.forEach(System.out::println);
		
		
		System.out.println("Sorting  by Type");
		Collections.sort(list, new OrderTypeComaparator());
		list.forEach(System.out::println);
	}

}