package com.xworkz.collections.comparable.comparatorFood;

import java.util.Comparator;

import com.xworkz.collections.comparable.FoodItemsDTO;

public class NameComparator implements Comparator<FoodItemsDTO> {

	@Override
	public int compare(FoodItemsDTO o1, FoodItemsDTO o2) {
		
		return o1.getFoodName().compareTo(o2.getFoodName());
	}

}
