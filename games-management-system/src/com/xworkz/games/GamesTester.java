package com.xworkz.games;

import java.util.Scanner;

import com.xworkz.games.dto.GamesDTO;

public class GamesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Owned By :");
		String ownedBy = sc.next();
		System.out.print("Available In :");
		String availableIn = sc.next();
		System.out.print("Game Type :");
		String type = sc.next();
		System.out.println("Can be Played By");
		String canBePlayedBy = sc.next();
		
		GamesDTO games = new GamesDTO();
		games.setId(id);
		games.setName(name);
		games.setOwnedBy(ownedBy);
		games.setAvailableIn(availableIn);
		games.setType(type);
		games.setCanBePlayedBY(canBePlayedBy);
		
		
		System.out.println(games);
	}

	
}
