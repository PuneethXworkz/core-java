package com.xworkz.ipl;

import java.util.Scanner;

import com.xworkz.ipl.dto.IplDTO;

public class IplTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter Format :");
		String format = sc.next();
		System.out.print("Enter No of Teams :");
		int noOfTeams = sc.nextInt();
		System.out.print("Enter First Season :");
		String firstSeason = sc.next();
		
		
		IplDTO ipl = new IplDTO();
		ipl.setId(id);
		ipl.setName(name);
		ipl.setFormat(format);
		ipl.setNoOfTeams(noOfTeams);
		ipl.setFirstSeason(firstSeason);
		
		System.out.println(ipl);

	}

}
