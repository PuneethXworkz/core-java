package com.xworkz.hotel.crud.impl;

import java.util.Arrays;

import com.xworkz.hotel.crud.Hotel;
import com.xworkz.hotel.dto.FoodItemsDTO;

public class HotelImpl implements Hotel {
	

	//Hotel has many FoodItemsDTO(Arrays) to pick single item.
	FoodItemsDTO dtos[];
	
	//instance variable
	int index;
	
	public HotelImpl(int size){
		System.out.println("Hotel () created");
		dtos = new FoodItemsDTO[size];
	}
	
	@Override
	public boolean addingFoodItems(FoodItemsDTO dto){
		System.out.println("addingFoodItems() created");
		boolean isAdded = false;		
		if(dtos!=null && dto.getName()!= null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Food Items Added succesfully");
		}
		else{
			System.out.println("Food Items not found");
		}
		return isAdded;
	}
	
	@Override
	public void getFoodItems(){
		System.out.println("Food Items Available are :");
		
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i]);
		}
	}
	
	@Override
	public boolean updatePriceById(int id, int price){
		boolean updatedPrice=false;
		System.out.println("updatePriceById() invoked");
		for(int i=0;i<dtos.length; i++){
			if(dtos[i].getId()==id ){
				dtos[i].setPrice(price);
				updatedPrice=true;
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}		
		return updatedPrice;
	}
	
	@Override
	public boolean updatePriceByType(String type, int price){
		boolean updatePrice=false;
		System.out.println("updatePriceType() invoked");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getType().equals(type) ){
				dtos[i].setPrice(price);
				updatePrice = true;
			}
			else {
				System.out.println("Entered type does not exists");
			}
		}		
		return updatePrice;
	}
	
	@Override
	public FoodItemsDTO getFoodItemById(int id){
		FoodItemsDTO foodItem = null;
		System.out.println("getFoodItemById() invoked");
		for(int i=0;i<dtos.length;i++){
			if (dtos[i].getId() == id ){
				foodItem = dtos[i];
				System.out.println(foodItem);
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		return foodItem;
	}
	
	@Override
	public boolean deleteFoodItemById(int id){
		boolean deleteFoodItem = false;
		int i,j=0;
		for(i=0,j=0;j<dtos.length;j++){
			if(dtos[j].getId()!=id ){
			dtos[i++]=dtos[j];
			System.out.println("Food Item deleted Successfully");
			deleteFoodItem = true;
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		dtos = Arrays.copyOf(dtos,i);		
		return deleteFoodItem;
	}
	
	@Override
	public boolean deleteFoodItemsByName(String name){
		boolean deletedFoodItem = false;
		int i,j=0;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getName().equals(name) ){
				dtos[i++]=dtos[j];
				System.out.println("Food Item deleted Successfully");
				deletedFoodItem = true;
			}
			else {
				System.out.println("Entered Name does not found");
			}
		}
		dtos = Arrays.copyOf(dtos,i);
		return deletedFoodItem;
	}
	
	@Override
	public String getAllFoodNames(){
		String foodNames = null;
		System.out.println("getAllFoodNames() invoked");
		for(int i=0;i<dtos.length;i++){
		foodNames = dtos[i].getName() ;
		System.out.println(foodNames);
		}
		
		return foodNames;		
	}

}
