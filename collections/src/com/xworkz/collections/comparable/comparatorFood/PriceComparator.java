package com.xworkz.collections.comparable.comparatorFood;

import java.util.Comparator;

import com.xworkz.collections.comparable.FoodItemsDTO;

public class PriceComparator implements Comparator<FoodItemsDTO> {

	@Override
	public int compare(FoodItemsDTO o1, FoodItemsDTO o2) {
		return (int) (o1.getPrice()-o2.getPrice());
	}

}
