package com.xworkz.collections.comparable.comparatorOrder;

import java.util.Comparator;

import com.xworkz.collections.comparable.OrderDTO;

public class OrderTypeComaparator implements Comparator<OrderDTO> {

	@Override
	public int compare(OrderDTO o1, OrderDTO o2) {

		return o1.getType().compareTo(o2.getType());
	}

}
