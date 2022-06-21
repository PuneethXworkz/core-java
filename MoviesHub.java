class MoviesHub{

static String movies[]={"Charlie 777", "privthviRaj","KGF-2", "BB-2", "Major"};

public static void main(String a[]){

getMovies();
}
public static void getMovies(){
	
	for(int i=0;i<movies.length;i++){
		System.out.println(movies[i]);
	}
}

}