class MicroWave{
static String brand = "Samsung";
static double price = 4999.99d;
static String color = "Black";
static boolean isConnected;
static int minSpeed;
static int currentSpeed;
static int maxSpeed=4;

public static void main(String a[]){
	 System.out.println("Main Method started");
System.out.println("Brand :"+brand);
System.out.println("Price "+price);
System.out.println("Color "+ color);
decreaseSpeed();
onOrOff();
increaseSpeed();
decreaseSpeed();
increaseSpeed();
decreaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
decreaseSpeed();
onOrOff();
System.out.println("Main Method ended");
}

public static void onOrOff(){
	System.out.println("Invoked onOrOff()");
if(isConnected==false){
	isConnected=true;
	System.out.println("MicroWave is turned on...");
}
	else if(isConnected==true){
		isConnected=false;
System.out.println("MicroWave is turned off...");
System.out.println("onOrOff() ended");
}
}

public static void increaseSpeed(){
System.out.println("Invoked increaseSpeed()");
if(isConnected==true){
	System.out.println("MicroWave is on");
if(currentSpeed < maxSpeed){
	currentSpeed=currentSpeed+1;
	System.out.println("Current speed is"+currentSpeed);
}
else{
	System.out.println("MicroWave has Reached Max Speed");
}
}
else{
	System.out.println("MicroWave turn on madu");
}
}

public static void decreaseSpeed(){
System.out.println("Invoked decreaseSpeed()");
	if(isConnected==true){
		System.out.println("MicroWave is On");
		
		if(currentSpeed > minSpeed){
			currentSpeed=currentSpeed-1;
		System.out.println("Current speed is "+currentSpeed);
}
else{
	System.out.println("Reached Min volume ");
}
	}
else{
	System.out.println("MicroWave on madu");
}
System.out.println("decreaseSpeed() ended");
}
}