class BookMyMovieTester{

public static void main(String a[]){
	
String movies[] = {"Om","Galipata","Upendra","A","H20","Raktha Kaneeru","Surya Vamsha","Yejamana"};

BookMyMovie bookMyShow = new BookMyMovie("Bharathi",200,movies);
	bookMyShow.showTime(4,"Devva","A");
	bookMyShow.snackTime("Pop Corn",4);	
}

}