package com.xworkz.box;

import java.util.Scanner;

import com.xworkz.box.dto.BoxDTO;

public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		
		System.out.print("Enter Brand :");		
		String brand = sc.next();
		
		System.out.print("Ener product price");
		double price = sc.nextDouble();
		
		System.out.print("Enter Size :");
		String size = sc.next();
		
		System.out.print("Enter color");
		String color = sc.next();
		
		System.out.print("Enter No of Seats");
		int noOfSeats = sc.nextInt();
		
		
		BoxDTO box = new BoxDTO();
		box.setBrand(brand);
		box.setId(id);
		box.setPrice(price);
		box.setSize(size);
		box.setColor(color);
		box.setNoOfSeats(noOfSeats);
		
		
	}

	private int id;
	private String brand;
	private double price;
	private String color;
	private String size;
	private int noOfSets;
}
