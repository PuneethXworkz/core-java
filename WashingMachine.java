class WashingMachine{

static String brand = "LG";
static double price = 9999.99d;
static String color = "White";
static String type = "Front load";
static boolean isConnected;
static int minSpeed;
static int currentSpeed;
static int maxSpeed=3;

public static void main(String args[]){
System.out.println("Brand :"+brand);
System.out.println("Price :"+price);
System.out.println("Color :"+color);
System.out.println("Type :"+type);

System.out.println("Main method started");
onOrOff();
increaseSpeed();
increaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
onOrOff();
System.out.println("Main Method ended");

}

public static void onOrOff(){
	System.out.println("Invoked onOrOff()");
	if(isConnected==false){
		isConnected=true;
		System.out.println("WashingMachine is On,....");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("WashingMachine is off...");
	}
System.out.println("onOrOff() ended");
	}
public static void increaseSpeed(){
		System.out.println("Invoked increaseSpeed()");
		if(isConnected==true){
			System.out.println("WashingMachine is on");
		if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed+1;
			System.out.println("Current Speed is"+currentSpeed);
		}
		else{
			System.out.println("Min Speed has reached");
		}
		}
		else{
			System.out.println("WashingMachine on madu....");
		}
		System.out.println("increaseSpeed() ended");
	}
	
public static void decreaseSpeed(){
		System.out.println("Invoked decreaseSpeed()");
		if(isConnected==true){
			System.out.println("WashingMachine is on");
		if(currentSpeed > minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("Current Speed is "+currentSpeed);
		}
		else {
			System.out.println("Min Speed Reached");
			}
			}
		else{
			System.out.println("WashingMachine on madu...");
		}
	System.out.println("decreaseSpeed() ended");	
	}
}
