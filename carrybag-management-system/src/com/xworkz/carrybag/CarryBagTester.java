package com.xworkz.carrybag;

import java.util.Scanner;

import com.xworkz.carrybag.dto.CarryBagDTO;

public class CarryBagTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Id :");
	int id = sc.nextInt();
	System.out.print("Enter Name :");
	String name = sc.next();
	System.out.print("Enter Carry bag Price :");
	double price = sc.nextDouble();
	System.out.print("Enter Capacity :");
	String capacity = sc.next();
	
	CarryBagDTO carry = new CarryBagDTO();
	carry.setId(id);
	carry.setName(name);
	carry.setPrice(price);
	carry.setCapacity(capacity);
	
	System.out.println(carry);
	
	}

}
