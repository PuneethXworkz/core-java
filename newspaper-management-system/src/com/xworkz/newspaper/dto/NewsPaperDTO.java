package com.xworkz.newspaper.dto;

public class NewsPaperDTO {

	public NewsPaperDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name ;
	private int noOfSheets;
	private String type;
	private String owner;
	private double price;
	
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
	public int getNoOfSheets() {
		return noOfSheets;
	}
	public void setNoOfSheets(int noOfSheets) {
		this.noOfSheets = noOfSheets;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "NewsPaperDTO [id=" + id + ", name=" + name + ", noOfSheets=" + noOfSheets + ", type=" + type
				+ ", owner=" + owner + ", price=" + price + "]";
	}
	
	
}
