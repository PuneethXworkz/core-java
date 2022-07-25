package com.xworkz.newspaper;

import java.util.Scanner;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public class NewsPaperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter Owner Name :");
		String owner = sc.next();
		System.out.print("Enter No of Sheets :");
		int noOfSheets = sc.nextInt();
		System.out.print("Enter Price :");
		double price = sc.nextDouble();
		System.out.print("Enter Type :");
		String type = sc.next();
		
	NewsPaperDTO paper =  new NewsPaperDTO();
	paper.setId(id);
	paper.setName(name);
	paper.setOwner(owner);
	paper.setNoOfSheets(noOfSheets);
	paper.setPrice(price);
	paper.setType(type);
	
	System.out.println(paper);		
	}

}
