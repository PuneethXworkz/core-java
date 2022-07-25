package com.xworkz.box.dto;

public class BoxDTO {

	public BoxDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String brand;
	private double price;
	private String color;
	private String size;
	private int noOfSeats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getNoOfSets() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public String toString() {
		return "BoxDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size
				+ ", noOfSets=" + noOfSeats + "]";
	}
}
