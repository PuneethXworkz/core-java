package com.xworkz.customer.crud.impl;

import java.util.Arrays;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerImpl implements Customer {
	
	//Customer has many orders
		OrderDTO dtos[];
		
		//instance variable
		int index;
		
		public CustomerImpl(int size){
			System.out.println("Customer() created ");
			dtos = new OrderDTO[size];
		}
		
		@Override
		public boolean orderToBePlaced(OrderDTO dto){
			System.out.println("orderToBePlaced() invoked");
			boolean order = false;		
			if(dto!=null){
				this.dtos[index++]=dto;
				order = true;
				System.out.println("Order details found");
			}
			else{
				System.out.println("Order details not matching");
			}
			
		return order;
		}
		
		@Override
		public void getOrderDetails(){
			System.out.println("getOrderDetails() invoked ");
			for(int i=0; i<dtos.length;i++){
				System.out.println(dtos[i]);
			}
		}
		
		@Override
		public boolean updatePriceById(int id, int price ){
			boolean updatedPrice = false;
			System.out.println("updatePriceBYId () created");
			for(int i=0; i<dtos.length;i++){
				if(dtos[i].getId()==id ){
					dtos[i].setPrice(price);
					updatedPrice = true;
				}
				else {
					System.out.println("Entered id doesnot exists");
				}			
			}
			return updatedPrice;
		}
		
		@Override
		public boolean updatePriceByName( String orderName, int price ){
			boolean updatedPrice = false;
			System.out.println("updatePriceByName () created");
			for(int i=0; i<dtos.length;i++){
				if(dtos[i].getOrderName().equals(orderName) ){
					dtos[i].setPrice(price);
					
				}
				else {
					System.out.println("Entered id doesnot exists");
				}			
			}
			return updatedPrice;
		}
		
		@Override
		public String getOrderNameById(int id){
			String orderedName=null;
			System.out.println("getOrderNameById() invoked");
			
			for(int i=0;i<dtos.length;i++){
				if(dtos[i].getId()==id ){
					orderedName = dtos[i].getOrderName();
					System.out.println("Order Name is :"+orderedName);
				
				}
				else {
					System.out.println("Entered Id doesnot Exists");
				}
			}		
			return orderedName;
		}
		
		@Override
		public OrderDTO getOrderDetailsById(int id){
			OrderDTO orderDetails = null;
			System.out.println("getOrderDetails() invoked");
			for(int i=0;i<dtos.length;i++){
				if(dtos[i].getId()==id ){
					orderDetails = dtos[i];
					System.out.println(orderDetails);
				}
				else {
					System.out.println("Entered Id does not exists");
				}
			}
			
			return orderDetails;
		}
		
		@Override
		public boolean deletedOrderById(int id){
			boolean deletedOrder = false;
			System.out.println("deletedOrderById () created");
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(dtos[j].getId() !=id ){
					dtos[i++]=dtos[j];
					System.out.println("Order deleted successfully");
					deletedOrder = true;
				}
				else {
					System.out.println("Entered id does not exists");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return deletedOrder;		
		}
		
		@Override
			public boolean deletedOrderByName(String name){
			boolean deletedOrder = false;
			System.out.println("deletedOrderByName () created");
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(!dtos[j].getOrderName().equals(name) ){
					dtos[i++]=dtos[j];
					System.out.println("Order deleted successfully");
					deletedOrder = true;
				}
				else {
					System.out.println("Entered id does not exists");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return deletedOrder;		
		}
		
		@Override
		public int getOrderQuantity(){
			int orderQuantity=0;
			
			for(int i=0;i<dtos.length;i++){
				orderQuantity = dtos[i].getOrderQuantity();
				
				System.out.println(orderQuantity);
			}
			return orderQuantity;
		}
}
