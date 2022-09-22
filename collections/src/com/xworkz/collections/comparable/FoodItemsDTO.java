package com.xworkz.collections.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class FoodItemsDTO implements Comparable<FoodItemsDTO> {

	private int foodId;
	private String foodName;
	private double price;
	private String type;
	private String deliveryCharges;
	
	@Override
	public int compareTo(FoodItemsDTO o) {

		return this.foodId-o.foodId;
		
	}	
}
