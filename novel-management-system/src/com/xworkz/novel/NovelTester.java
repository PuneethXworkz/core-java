package com.xworkz.novel;

import java.util.Scanner;

import com.xworkz.novel.dto.NovelDTO;

public class NovelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter id :");
		int id = scan.nextInt();
		System.out.print("Enter Name :");
		String name = scan.next();
		System.out.print("Enter Author :");
		String author = scan.next();
		System.out.print("Enter Price :");
		double price = scan.nextDouble();
		System.out.print("Enter No of Pages :");
		int noOfPages = scan.nextInt();		
		
		NovelDTO novel = new NovelDTO();
		novel.setId(id);
		novel.setName(name);
		novel.setAuthor(author);
		novel.setPrice(price);
		novel.setNoOfPages(noOfPages);
		
		System.out.println(novel);
		
	}

}
