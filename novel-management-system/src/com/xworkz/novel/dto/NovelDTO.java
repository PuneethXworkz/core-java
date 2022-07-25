package com.xworkz.novel.dto;

public class NovelDTO {

	public NovelDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String author;
	private double price;
	private int noOfPages;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	@Override
	public String toString() {
		return "NovelDTO [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", noOfPages="
				+ noOfPages + "]";
	}	
}
