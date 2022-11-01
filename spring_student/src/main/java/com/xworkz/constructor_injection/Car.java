package com.xworkz.constructor_injection;

import lombok.Data;
@Data
public class Car {

	private int id;
	private String name;
	private String model;
	private double price;
	
	public Car() {
	}
	
	public Car(int id, String name, String model, double price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public void displayCar() {
		System.out.println("Id :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.model);
		System.out.println("List Of Cars :"+this.price);
	}
	
}
