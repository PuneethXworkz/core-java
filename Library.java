class Library{

String name;
int libraryId;
String location;
int noOfBooks;
long contactNo;
String type;

public Library(String name, int libraryId, String location, int noOfBooks,long contactNo, String type ){
	this.name = name;
	this.libraryId = libraryId;
	this.location = location;
	this.noOfBooks = noOfBooks;
	this.contactNo = contactNo;
	this.type = type;
	
	}

public static void main(String a[]){

Library lib = new Library( "Sanskrithi", 1133, "basaveshwara Nagar", 1560, 90874564239L, "Public");
System.out.println("Name of the Library :"+lib.name+"\n"+"Library Id :"+lib.libraryId+"\n"+"Location :"+lib.location+"\n"+"No of Books :"+lib.noOfBooks+"\n" + "Contact No :"+lib.contactNo +"\n"+"Type :"+lib.type+"\n" );


Library lib2 = new Library( "Shobha",5567, "Bellandur", 1892, 9871230985L, "school");
System.out.println("Name of the Library :"+lib2.name+"\n"+"Library Id :"+lib2.libraryId+"\n"+"Location :"+lib2.location+"\n"+"No of Books :"+lib2.noOfBooks+"\n" + "Contact No :"+lib2.contactNo +"\n"+ "Type :"+lib2.type+"\n" );

Library lib3 = new Library("Thinkers",1145,"Dollars Colony",9965,876029837L,"Public");
System.out.println("Name of the Library :"+lib3.name+"\n"+"Library Id :"+lib3.libraryId+"\n"+"Location :"+lib3.location+"\n"+"No of Books :"+lib3.noOfBooks+"\n"+"Contact No :"+lib3.contactNo+"\n"+"Type :"+lib3.type+ "\n");

Library lib4 = new Library("Snansthana",5578,"Rajaji Nagar",8832,9012374281L,"College");
System.out.println("Name of the Library :"+lib4.name+"\n"+"Library Id :"+lib4.libraryId+"\n"+"Location :"+lib4.location+"\n"+"No of Books :"+lib4.noOfBooks+"\n"+"Contact No :"+lib4.contactNo+"\n"+"Type :"+lib4.type+ "\n");
	
}
}