package com.xworkz.person;

import java.util.List;

import lombok.Data;
@Data
public class Person {
	
	private int id;
	private String name;
	private String address;
	private List<Car> listOfCars;

}
