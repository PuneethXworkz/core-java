class BookMyMovie{
	
String theatreName;
int totalNoOfTickets;
String movies[];
static int ticketPrice = 500;
//int noOfTickets;

String snacks[] = {"Pop Corn","Ice Cream","Cool Drinks","Sand Wich"};
int totalSnacks = 20;
int snackPrice =50;
//int noOfSnacks;


public BookMyMovie(String theatreName, int totalNoOfTickets, String movies[] ){
this.theatreName = theatreName;
this.totalNoOfTickets = totalNoOfTickets;	
this.movies = movies;
	
	System.out.println("BookMyMovie Object is created");
}
public int showTime(int noOfTickets, String bookedBy, String movieName){
	int totalTicketPrice = 0;
	System.out.println("Inside showtime()....");
	System.out.println("Arg 1 : No of Tickets "+noOfTickets);
	System.out.println("Arg 2 : Booked By "+bookedBy);
	System.out.println("Arg 3 : Movie Name "+movieName);
	
	for(int index = 0; index < movies.length; index++){
		
		if(movieName == movies[index]){
			System.out.println("Movie name matched");
			
		if(noOfTickets < totalNoOfTickets){
			totalTicketPrice = noOfTickets*ticketPrice;
			totalNoOfTickets = totalNoOfTickets-noOfTickets;
			System.out.println("For Movie :" +movieName+"\n"+"No of Tickets that are remaining :" +totalNoOfTickets+"\n"+"Total price is :"+ totalTicketPrice);
	}
		else{
			System.out.println("Isht Tickets illa...");
		}	
	}
	else{
		System.out.println("Movie not available");
	}
}
return totalTicketPrice;
}

public int snackTime(String snackName, int quantity){
int totalSnackPrice = 0;
	System.out.println("Buying Snacks time ");
	System.out.println("Snack Name :"+snackName);
	System.out.println("Snack quantity :" + quantity);
	System.out.println("Snack Price :"+snackPrice);
	
	for (int i=0;i<snacks.length;i++){
		if(snackName == snacks[i]){
			System.out.println("Snack Found");
			
		if(quantity < totalSnacks){
			totalSnackPrice =quantity*snackPrice;
			quantity = totalSnacks - quantity;
			System.out.println("For Snacks :"+snackName+"\n"+"Total Snacks Price :"+totalSnackPrice+"\n"+"Snacks remaining after booking :"+quantity+"\n");
			
		}
		else{
			System.out.println("Ashtond Snacks thinakke illa nam athra");
		}
		
		}
		else{
			System.out.println("Nimma Snacks Siktha illa");
		}
	}
	
	return totalSnackPrice;
}

}