package com.xworkz.musicplayer;

import java.util.Scanner;

import com.xworkz.musicplayer.dto.MusicPlayerDTO;

public class MusicPlayerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter price :");
		double price = sc.nextDouble();
		System.out.print("Enter Charging Type :");
		String chargingType = sc.next();
		System.out.print("Enter Blutooth range :");
		String bluetoothRange = sc.next();
		
		MusicPlayerDTO music = new MusicPlayerDTO();
		music.setId(id);
		music.setName(name);
		music.setPrice(price);
		music.setChargingType(chargingType);
		music.setBluetoothRange(bluetoothRange);
		
		System.out.println(music);
		
	sc.close();
	}

}
