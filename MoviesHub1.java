class MoviesHub1{
	
static String movies[]={"Charlie 777", "privthviRaj","KGF-2", "BB-2", "Major"};
	
public static void main(String a[]){

String value = getMovie("BB-2");
System.out.println("Come we will watch "+value);

}
public static String getMovie(String movie){
	String movieName= null;
	for(int i=0;i<movies.length;i++){
	if(movies[i]== movie){
		movieName = movies[i]; 
	}
	else{
		System.out.println(movie + " is not available in the list");
	}
	}
	
	return movieName;
}

}