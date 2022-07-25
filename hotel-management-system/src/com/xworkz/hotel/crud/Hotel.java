package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodItemsDTO;

public interface Hotel {
	
	public boolean addingFoodItems(FoodItemsDTO dto);
	public void getFoodItems();
	public boolean updatePriceById(int id, int price);
	public boolean updatePriceByType(String type, int price);
	public FoodItemsDTO getFoodItemById(int id);
	public boolean deleteFoodItemById(int id);
	public boolean deleteFoodItemsByName(String name);
	public String getAllFoodNames();

}
