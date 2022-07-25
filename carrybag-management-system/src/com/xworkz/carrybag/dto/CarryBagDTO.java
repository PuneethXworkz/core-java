package com.xworkz.carrybag.dto;

public class CarryBagDTO {

	
	public CarryBagDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private double price;
	private String capacity;
	
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarryBagDTO [id=" + id + ", name=" + name + ", price=" + price + ", capacity=" + capacity + "]";
	}
	
}
