class Transportation{

String name;
int noOfBuses;
String type;
String modeOfTicket;
String ticketBooking;

public Transportation(String name, int noOfBuses, String type, String modeOfTicket, String ticketBooking){
	
	this.name = name;
	this.noOfBuses = noOfBuses;
	this.type = type;
	this.modeOfTicket = modeOfTicket;
	this.ticketBooking = ticketBooking;
}

public static void main(String a[]){
	
Transportation trans = new Transportation("BMTC", 1680, "Intra City", "Offline","No");
System.out.println("Name of Transport :"+trans.name +"\n"+"No of Buses :"+trans.noOfBuses+"\n"+"Type of Transport :"+trans.type+"\n"+"Mode Of Ticket :"+trans.modeOfTicket+"\n"+"Ticket Booking :"+trans.ticketBooking+"\n");

Transportation trans2 = new Transportation("KSRTC", 1290, "Inter City","Online/Offline","Yes");
System.out.println("Name of the Transport :"+trans2.name+"\n"+"No of Buses :"+trans2.noOfBuses+"\n"+"Type of Transport :"+trans2.type+"\n"+"Mode of Ticket :"+trans2.modeOfTicket+"\n"+"Ticket Booking :"+trans2.ticketBooking+"\n");	

Transportation trans3 = new Transportation("VRL", 6875, "Inter State","Online" ,"Yes");
System.out.println("Name of the Transport :"+trans3.name+"\n"+"No of Buses :"+trans3.noOfBuses+"\n"+"Type of Transport :"+trans3.type+"\n"+"Mode of Ticket :"+trans3.modeOfTicket+"\n"+"Ticket Booking :"+trans3.ticketBooking+"\n");	

Transportation trans4 = new Transportation("Janani", 2890, "Inter State","Online/Offline","Yes");
System.out.println("Name of the Transport :"+trans4.name+"\n"+"No of Buses :"+trans4.noOfBuses+"\n"+"Type of Transport :"+trans4.type+"\n"+"Mode of Ticket :"+trans4.modeOfTicket+"\n"+"Ticket Booking :"+trans4.ticketBooking+"\n");

Transportation trans5 = new Transportation("Spoorthi", 650, "Inter State","Offline","No");
System.out.println("Name of the Transport :"+trans5.name+"\n"+"No of Buses :"+trans5.noOfBuses+"\n"+"Type of Transport :"+trans5.type+"\n"+"Mode of Ticket :"+trans5.modeOfTicket+"\n"+"Ticket Booking :"+trans5.ticketBooking+"\n");	


	}

}