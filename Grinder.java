class Grinder{

static String brand = "Philips";
static double price = 23999;
static String color = "Grey";
static boolean isConnected;
static int minSpeed;
static int currentSpeed;
static int maxSpeed=10;

public static void main(String a[]){
	
	System.out.println("Brand :" +brand);
	System.out.println("Price :"+price);
	System.out.println("Color :"+color);
	
	//onOrOff();
	increaseSpeed();
	onOrOff();
	increaseSpeed();
	increaseSpeed();
	System.out.println("End of Main Method");
}
public static void onOrOff(){
System.out.println("Invoked onOrOff()");

if (isConnected==false){
	isConnected=true;
	System.out.println("Grinder is turned on...");
}
else if(isConnected==true){
isConnected=false;
System.out.println("Grinder is tuned off...");
}
System.out.println("End of onOrOff method");
}

public static void increaseSpeed(){
	System.out.println("increaseSpeed method started");
	if(isConnected==true){
		System.out.println("Grinder is turned on");
		
	if(currentSpeed < maxSpeed){
		currentSpeed = currentSpeed + 1;
		System.out.println("Current Speed is"+ currentSpeed);
	}
	else{
		System.out.println("Max Speed Reached");
	}
	}
	else{
		System.out.println("Turn on the Grinder");
	}
	System.out.println("increaseSpeed() medthod ended");
}

public static void decreaseSpeed(){
	System.out.println("decreaseSpeed() started");
	if(isConnected==true){
		System.out.println("Grinder is on");
	if(currentSpeed > minSpeed){
		currentSpeed=currentSpeed-1;
		System.out.println("Current Speed is"+currentSpeed);
	}
	else{
		System.out.println("Min speed has reached");
	}
	}
	else{
		System.out.println("Grinder on madu");
}
}