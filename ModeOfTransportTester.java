class ModeOfTransportTester{

public static void main(String a[]){
	
	Bus bus = new Bus();
	bus.noOfBuses = 1970;
	bus.dailyPassPrice = 170;
	bus.operatingTimings = "4.30AM to 11.00PM";
	bus.transportationMode = "local";
	bus.transport();
	
	System.out.println("No of Buses :"+bus.noOfBuses+"\n"+"Daily Bus Pass Price :"+bus.dailyPassPrice+"\n"
	+"Operating Timings :"+bus.operatingTimings+"\n"+"Mode :"+bus.transportationMode+"\n");
	
	
	/*String noOfBuses;
int dailyPassPrice;
String operatingTimings;
String transportationMode;
*/
}


}