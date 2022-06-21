class Theatre{

// Creating Class and Object 
//Instance variable, creating object using new keyword;
String name;
String address;
long contactNo;
String ownerName;
int noOfSeats;
String runningMovies[] = new String[3];
//String runningMovies[]= {"Charlie 777", "Vikram", "Major"}; 

/*
String runningMovies1[]={"KGF-2","James","bajarangi-2"};

String runningMovies2[]={"Don","Kotigobba3","Ombattane Dikku"};

String []runningMovies3 = {"Sri Allamaprabhu","Gajanana Gang","matador"};

String[] runningMovies4 = {"Bhoot", "It-2","LoveMocktail-2"};
*/
public static void main(String a[]){

//ClassName refVariable = new ClassName();

Theatre theatre = new Theatre();
	theatre.name = "Veeresh";
	theatre.address = "Magadi road";
	theatre.contactNo = 8908908901L;
	theatre.ownerName = "Darshan";
	theatre.noOfSeats = 152;
	theatre.runningMovies[0]= "Vikram";
	theatre.runningMovies[1]= "Charlie 777";
	theatre.runningMovies[2]= "RRR";		
System.out.println("Top 5 Theatre's in Bengaluru"+'\n');
System.out.println("Name of the 1st Theatre 	  :" + theatre.name);
System.out.println("Address of the Theatre 	 	  :" + theatre.address);
System.out.println("Contact Number			  :"+theatre.contactNo);
System.out.println("Owner of the Theatre 		  :"+ theatre.ownerName);
System.out.println("No of Seats Available		  :"+theatre.noOfSeats);
System.out.println("Running Movies in Veeresh Theatre :");
theatre.getRunningMovies();
}

//Theatre theatre1 = new Theatre()
/*

theatre.name1 = "Prassanna";
		theatre.address1 = "Magadi road";
		theatre.contactNo1 = 9876543210L;
		theatre.ownerName1 = "Sudeep";
		theatre.noOfSeats1 = 180;
		theatre.runningMovies[0]="Om";
		theatre.runningMovies[1]= "Xander";
System.out.println("Name of the Second Theatre    :"+theatre.name1);
System.out.println("Adress of the theatre         :"+theatre.address1);
System.out.println("Contact Number 			:"+theatre.contactNo1);
System.out.println("Owner of the Theatre		  :"+theatre.ownerName1);
System.out.println("No of Seats Available		  :"+theatre.noOfSeats1);
System.out.println("Running Movies in Prassanna Theatre :");
theatre.getRunningMovies1();

/*theatre.name2 = "Nataraj";
theatre.address2 = "Sampige road Malleshwaram";
theatre.contactNo2 = 8765432109L;
theatre.ownerName2 = "Ganesh";
theatre.noOfSeats2 = 162;
System.out.println("Name of the third Theatre	:"+theatre.name2);
System.out.println("Address of the Theatre	:"+theatre.address2);
System.out.println("Contact Number			:"+theatre.contactNo2);
System.out.println("Owner of the Theatre	:"+theatre.ownerName2);
System.out.println("No of Seats Available	:"+theatre.noOfSeats2);
System.out.println("Running Movies in Nataraj Theatre :");
theatre.getRunningMovies2();

theatre.name3 = "Kapali";
theatre.address3 = "majestic";
theatre.contactNo3 = 7654321098L;
theatre.ownerName3 = "Prem";
theatre.noOfSeats3 = 230;
System.out.println("Name of the fourth Theatre :"+theatre.name3);
System.out.println("Address of the theatre :"+theatre.address3);
System.out.println("Contact Number 	:"+theatre.contactNo3);
System.out.println("Owner of the Theatre	:"+theatre.ownerName3);
System.out.println("No of Seats Available 	:"+theatre.noOfSeats3);
System.out.println("Running Movies in Kapali Theatre 	:");
theatre.getRunningMovies3();

theatre.name4 = "Akash";
theatre.address4 = "Laggere";
theatre.contactNo4 = 6543210987L;
theatre.ownerName4 = "Puneeth";
theatre.noOfSeats4 = 280;
System.out.println("Name of the fifth Theatre :" + theatre.name4);
System.out.println("Addres of the theatre :" + theatre.address4);
System.out.println("Contact Number :" + theatre.contactNo4);
System.out.println("Owner of the Theatre :" +theatre.ownerName4);
System.out.println("No of Seats Available :" +theatre.noOfSeats4);
System.out.println("Running Movies in Akash Theatre  :");
theatre.getRunningMovies4();

}
*/
public void getRunningMovies(){
	for (int a=0;a<runningMovies.length;a++){
		System.out.print(""+runningMovies[a] +"");
	}
	System.out.println();
}
/*
public void getRunningMovies1(){
	for(int b=0;b<runningMovies1.length;b++){
		System.out.println(runningMovies1[b]);
	}
}
public void getRunningMovies2(){
	for(int b=0;b<runningMovies2.length;b++){
		System.out.println(runningMovies2[b]);
	}
}

public void getRunningMovies3(){
	for(int c=0;c<runningMovies3.length;c++){
		System.out.println(runningMovies3[c]);
	}
}
public void getRunningMovies4(){
	for(int d=0;d<runningMovies4.length;d++){
		System.out.println(runningMovies4[d]);
	}
}
*/
}