class Ac{

static String brand = "Samsung";
static double price = 350000;
static String color = "Black";
static boolean isConnected;
static int minTemp=8;
static int currentTemp=8;
static int maxTemp=12;

public static void main (String args[]){
	System.out.println("Ac Brand :"+ brand);
	System.out.println("Price :"+price);
	System.out.println("Color :"+color);
	
onOrOff();
increaseTemp();
increaseTemp();
decreaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
decreaseTemp();
increaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
onOrOff();

System.out.println("End of main method");
}

public static void onOrOff(){
System.out.println("Invoking onOrOff method");
	if (isConnected==false){
		isConnected=true;
		System.out.println("Ac is turned on...");
	}
	
	else if (isConnected==true){
		isConnected=false;
		System.out.println("Ac is turned off...");
	}
	System.out.println("End of onOrOff()");
}

public static void increaseTemp(){
	System.out.println("increaseTemp() started");
	if(isConnected==true){
		System.out.println("Ac is turned on");
		if(currentTemp < maxTemp){
			currentTemp=currentTemp+1;
			System.out.println("Current Temp is" + currentTemp);
		}
		else{
			System.out.println("Max Temp Reached");
		}
	}
	else {
		System.out.println("Swtich on the Ac");
	}
}

public static void decreaseTemp(){
	System.out.println("DecreaseTemp() started");
	if(isConnected==true){
		System.out.println("Ac is turned on");
		if(currentTemp > minTemp){
			currentTemp = currentTemp-1;
			System.out.println("Current Temp is" + currentTemp);
		}
		else{
			System.out.println("Minimum Temp reached");
		}
	}
	else{
		System.out.println("Turn On the Ac");
	}
	
}

}