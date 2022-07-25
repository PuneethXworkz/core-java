package com.xworkz.bigbasket;

import java.util.Scanner;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public class BigBasketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :");
		int id = sc.nextInt();
		System.out.println("Owned By :");
		String ownedBy = sc.next();
		System.out.println("Origin :");
		String origin = sc.next();
		System.out.println("Type of Service");
		String typeOfService=sc.nextLine();
		
		BigBasketDTO big = new BigBasketDTO();
		big.setId(id);
		big.setOwnedBy(ownedBy);
		big.setOrigin(origin);
		big.setTypeOfService(typeOfService);


		System.out.println(big);
	}

}
