class Restaurant{

String name;
int id;
String address;
long contactNumber;
String ownerName;

public static void main(String bhar[]){
	
	Restaurant rest = new Restaurant();
rest.name = "Amogha";
rest.id = 222;
rest.address = "Laggere";
rest.contactNumber = 9987765543L;
rest.ownerName = "Amoghavarsha";
	System.out.println("Restaurant Name :"+rest.name);
	System.out.println("Restaurant ID :"+ rest.id);
	System.out.println("Address :"+rest.address);
	System.out.println("Contact No :"+ rest.contactNumber);
	System.out.println("Owner Name :"+rest.ownerName + "\n");
	
	Restaurant rest1 = new Restaurant();
rest1.name = "Sagar";
rest1.id = 123;
rest1.address = "Raj Kumar Road";
rest1.contactNumber = 8768768769L;
rest1.ownerName = "SagarVathsa";
	System.out.println("Restaurant Name :"+rest1.name);
	System.out.println("Restaurant ID :"+rest1.id);
	System.out.println("Address :"+rest1.address);
	System.out.println("Contact No :"+rest1.contactNumber);
	System.out.println("Owner Name :"+rest1.ownerName + "\n");
	
	Restaurant rest2 = new Restaurant();
rest2.name = "Shanthi Sagar";
rest2.id = 246;
rest2.address = "RajajiNagar";
rest2.contactNumber = 9908876654L;
rest2.ownerName = "Shanthi";
	System.out.println("Restaurant Name :"+rest2.name);
	System.out.println("Restaurant ID :"+rest2.id);
	System.out.println("Address :"+rest2.address);
	System.out.println("Contact No :"+rest2.contactNumber);
	System.out.println("Owner Name :"+rest2.ownerName + "\n");
	
Restaurant rest3 = new Restaurant();
rest3.name = "Kadamba";
rest3.id = 443;
rest3.address = "Navarang";
rest3.contactNumber = 9908873325L;
rest3.ownerName = "Vishwas Kadamba";
	System.out.println("Restaurant Name :"+rest3.name);
	System.out.println("Restaurant ID :"+rest3.id);
	System.out.println("Address :"+rest3.address);
	System.out.println("Contact No :"+ rest3.contactNumber);
	System.out.println("Owner Name :"+rest3.ownerName+ "\n" );
	
Restaurant rest4 = new Restaurant();
rest4.name = "Agarwal";
rest4.id = 886;
rest4.address = "Dasarahalli";
rest4.contactNumber = 9976643310L;
rest4.ownerName = "Dhathri Agarwal";
	System.out.println("Restaurant Name :"+rest4.name);
	System.out.println("Restaurant ID :"+rest4.id);
	System.out.println("Address    :"+rest4.address);
	System.out.println("Contact No :"+rest4.contactNumber);
	System.out.println("Owner Name :"+rest4.ownerName);
	
}

}