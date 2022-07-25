package com.xworkz.apartment;

import java.util.Scanner;

import com.xworkz.apartment.dto.ApartmentDTO;

public class ApartmentTester {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter Id :");
	int id = sc.nextInt();
		
	System.out.print("Enter Apartment Name :");
	String apartmentName = sc.next();
		
	System.out.print("Enter Address :");
	String address = sc.next();	
	
	System.out.print("Enter Owner Name :");
	String ownerName = sc.next();	
	
	ApartmentDTO apart = new ApartmentDTO();
	
	apart.setApartmentName(apartmentName);
	apart.setId(id);
	apart.setAddress(address);
	apart.setOwnername(ownerName);
	
	System.out.println(apart);
	
	
}

}