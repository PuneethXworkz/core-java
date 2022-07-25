package com.xworkz.library.crud.impl;

import java.util.Arrays;

import com.xworkz.library.crud.Library;
import com.xworkz.library.dto.BooksDTO;

public class LibraryImpl implements Library {
	
	//Library has Many books
		BooksDTO dtos[];
		
		//instance variable
		int index;
		
		public LibraryImpl (int size) {
			System.out.println("Welcome to Samskruthi Library");
			dtos = new BooksDTO[size];		
		}
		
		@Override
		public boolean addingBook(BooksDTO dto){
			System.out.println("addingBook() invoked");
			boolean isAdded = false;
			if(dto!= null && dto.getName()!= null){
				this.dtos[index++] = dto;
				isAdded = true;
				System.out.println("Book added Successfully");
			}
			else{
				System.out.println("Please fill the details correctly");
			}
			return isAdded;
		}
		
		@Override
		public void getBookDetails(){
			System.out.println("Inside getBookDetails() ");
			for(int i = 0; i < dtos.length; i++){
				System.out.println(dtos[i] );
			}
		}
		
		@Override
		public boolean updateTypeById(String type, int id){
			System.out.println("updateTypeById() created");
			boolean updatedType = false;
			
			for(int i=0;i<dtos.length;i++){
				if(dtos[i].getId()==id ){
					dtos[i].setType(type);
					updatedType = true;
				}
				else {
					System.out.println("Entered Id does not exist");
				}
			}
			return updatedType;
		}
		
		@Override
		public boolean updateNoOfPagesByName( String name, int noOfPages){
			System.out.println("updateNoOfPagesByName() created");
			boolean updatedPages = false;
			
			for(int i=0; i<dtos.length;i++){
				if(dtos[i].getName().equals(name) ){
					dtos[i].setNoOfPages(noOfPages);
					updatedPages = true;
				}
				else {
					System.out.println("Entered Name does not exist");
				}
			}
			return updatedPages;
		}
		
		@Override
		public String getBooks(){
			String books = null;
			System.out.println("getBooks() invoked ");
			
			for(int i=0;i<dtos.length;i++){
				
				books = dtos[i].getName();
				System.out.println(books);
			}
			
			
			return books;
		}
		
		@Override
		public boolean deleteBookById(int id){
			boolean deleteBook = false;
			System.out.println("deleteBookById() created");
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(dtos[j].getId() !=id ){
					dtos[i++]=dtos[j];
					System.out.println("Book details deleted succesfully");
					deleteBook=true;
				}
				else {
					System.out.println("Entered id does not exist");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return deleteBook;
		}
		
		@Override
		public boolean deleteBookByName(String name) {
			boolean deleteBook= false;
			System.out.println("deleteBookByName() created");
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(!dtos[i].getName().equals(name) ){
					dtos[i++] = dtos[j];
					System.out.println("Book deleted succesfully");
					deleteBook = true;
				}
				else {
					System.out.println("Entered Name doesnot exist");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return deleteBook;
		}

}