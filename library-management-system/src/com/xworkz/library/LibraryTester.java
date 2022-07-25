package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.impl.LibraryImpl;
import com.xworkz.library.dto.BooksDTO;

public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Books to be added :");
		int size = sc.nextInt();		
		
		LibraryImpl lib = new LibraryImpl(size);
			
			for(int i=0; i<size;i++){
		System.out.print("Enter id :");
		int id = sc.nextInt();
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter Author Name :");
		String author = sc.next();
		System.out.print("Enter No of Pages :");
		int noOfPages = sc.nextInt();
		System.out.print("Enter Type of Book :");
		String type = sc.next();
		
		BooksDTO dto = new BooksDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setAuthor(author);
		dto.setNoOfPages(noOfPages);
		dto.setType(type);
		
		lib.addingBook(dto);
	}
	
	String option = null;
	do{
		System.out.println("Enter 1 to Fetch all the book details");
		System.out.println("Enter 2 to type by Book Id");
		System.out.println("Enter 3 to Update No Of Pages By Book Name");
		System.out.println("Enter 4 to delete Book by Id");
		System.out.println("Enter 5 to delete Book by Name");
		System.out.println("Enter 6 to get all the books available");
		System.out.print("Enter Choice :");		
		int choice = sc.nextInt();
		switch(choice){
			case 1 :	lib.getBookDetails();
						break;
			
			case 2 :	System.out.print("Enter existing Id : ");
						int existingId = sc.nextInt();
						System.out.print("Enter type to be updated : ");
						String existingType = sc.next();
						lib.updateTypeById(existingType,existingId);
						break;
						
			case 3 :	System.out.print("Enter Existing Name : ");
						String existingName = sc.next();
						System.out.print("Enter updated no of pages :");
						int updatedNoOfPages = sc.nextInt();
						lib.updateNoOfPagesByName(existingName,updatedNoOfPages);
						break;
						
			case 4 :	System.out.print("Enter Book Id to be deleted : ");
						int existId = sc.nextInt();
						lib.deleteBookById(existId);
						break;
						
			case 5 :	System.out.print("Enter Book name to be deleted : ");
						String existName = sc.next();
						lib.deleteBookByName(existName);
						break;
						
			case 6 :	lib.getBooks();
						break;
						
			default :	System.out.println("Entered choice cannot be delivered");
				
		
		}
		
		System.out.print("Do you want to continue y/n :" );
		option =sc.next();
	}
	while(option.equals("y") );
	sc.close();
	}

}
