package com.xworkz.collections.comparable.comparatorOrder;

import java.util.Comparator;

import com.xworkz.collections.comparable.OrderDTO;

public class OrderPriceComparator implements Comparator<OrderDTO> {

	@Override
	public int compare(OrderDTO o1, OrderDTO o2) {

		return (int) (o1.getPrice()-o2.getPrice());
	}

}
