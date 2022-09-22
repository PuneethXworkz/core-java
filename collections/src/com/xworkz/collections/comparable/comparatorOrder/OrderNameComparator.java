package com.xworkz.collections.comparable.comparatorOrder;

import java.util.Comparator;

import com.xworkz.collections.comparable.OrderDTO;

public class OrderNameComparator implements Comparator<OrderDTO> {

	@Override
	public int compare(OrderDTO o1, OrderDTO o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
