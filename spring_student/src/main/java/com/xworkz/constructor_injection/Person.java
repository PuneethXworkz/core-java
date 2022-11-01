package com.xworkz.constructor_injection;

import java.util.List;



public class Person {

	private int id;
	private String name;
	private String address;
	private List<Car> listOfCars;
	
	public Person(int id, String name, String address, List<Car> listOfCars) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.listOfCars = listOfCars;
	}
	
	public void displayPerson() {
		System.out.println("Id :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
		System.out.println("List Of Cars :"+this.listOfCars);
	}	
}
