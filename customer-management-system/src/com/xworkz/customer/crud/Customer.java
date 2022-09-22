package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface Customer {

	public boolean orderToBePlaced(OrderDTO dto);
	
	public void getOrderDetails();
	public boolean updatePriceById(int id, int price );	
	public boolean updatePriceByName( String orderName, int price );	
	public String getOrderNameById(int id);	
	public OrderDTO getOrderDetailsById(int id);	
	public boolean deletedOrderById(int id);
		public boolean deletedOrderByName(String name);	
	public int getOrderQuantity();
	
}
