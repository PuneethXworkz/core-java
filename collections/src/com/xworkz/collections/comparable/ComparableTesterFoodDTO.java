package com.xworkz.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collections.comparable.comparatorFood.DeliveryChargesComparator;
import com.xworkz.collections.comparable.comparatorFood.NameComparator;
import com.xworkz.collections.comparable.comparatorFood.PriceComparator;
import com.xworkz.collections.comparable.comparatorFood.NameComparator;

public class ComparableTesterFoodDTO {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new FoodItemsDTO(10,"Dosa",35.00D,"Veg","Rs5"));
		list.add(new FoodItemsDTO(16,"Rava_Idli",45.00,"Veg","Rs8"));
		list.add(new FoodItemsDTO(13,"Masala_Dosa",60.00,"Veg","Rs10"));
		list.add(new FoodItemsDTO(17,"Poori",30.00,"Veg","Rs5"));

		Collections.sort(list);
		System.out.println("Without Sorting");
		list.forEach(System.out::println);
		
		System.out.println("Sorting by Id");
		list.forEach(System.out::println);
		
		System.out.println("Sorting by name");
		Collections.sort(list, new NameComparator());
		list.forEach(System.out::println);
		
		System.out.println("Sorting by price");
		Collections.sort(list, new PriceComparator());
		list.forEach(System.out::println);
		
		System.out.println("Sorting by Deleivery Charges");
		Collections.sort(list, new DeliveryChargesComparator());
		list.forEach(System.out::println);
		
	}

}
