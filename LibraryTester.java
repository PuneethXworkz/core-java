import java.util.Scanner;

class LibraryTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Books to be added ");
		int size = sc.nextInt();		
		
		Library lib = new Library(size);
			
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
		
		BookDTO dto = new BookDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setAuthor(author);
		dto.setNoOfPages(noOfPages);
		dto.setType(type);
		
		lib.addingBook(dto);
	}
		lib.getBookDetails();
	}		
	
} 