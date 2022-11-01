package com.xworkz.demo;

import lombok.Data;

@Data
public class Demo {
	
	private Demo() {
		System.out.println("---------Demo Constructor created-----------");
	}
	
	private String message;

}
