package com.xworkz.collections.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class OrderDTO implements Comparable<OrderDTO> {
	
	private int id;
	private String name;
	private double price;
	private String type;
	
	
	@Override
	public int compareTo(OrderDTO o) {
		return this.id-o.id;
	}

}
