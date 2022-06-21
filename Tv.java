class Tv{
static String brand = "Onida";
static double price = 9999.99d;
static String color = "Red";
static boolean isConnected;
static int minVolume;
static int currentVolume;
static int maxVolume =8;
	
public static void main(String a[]){
		System.out.println("Main method started");
		System.out.println("Tv Brand :"+ brand);
		System.out.println("Tv Price :"+ price);
		System.out.println("Tv Color :"+ color);
		
		onOrOff();
		///increaseVolume();
		//increaseVolume();
		//increaseVolume();
		//decreaseVolume();
		//increaseVolume();
		//decreaseVolume();
		//increaseVolume();
		//decreaseVolume();
		//onOrOff();
		System.out.println("End of Main method");
}
public static void onOrOff(){
	System.out.println("Invoked onOrOff()");
	if(isConnected==false){
		isConnected = true;
	System.out.println("System is turned on");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("System is turned off");
	}
	System.out.println("End of onOrOff()");
}

public static void increaseVolume(){
	System.out.println("Invoked increaseVolume() ");
	if(isConnected=true){
		System.out.println("System is turned on");
	if(currentVolume < maxVolume){
		currentVolume=currentVolume+1;
	System.out.println("Current Volume is :"+currentVolume);
	}
	else{
		System.out.println("Max Volume reached");
	}
	}
	else {
		System.out.println("Turn on the Tv");
	}
	System.out.println("End od increaseVolume()");
}

public static void decreaseVolume(){
	System.out.println("Invoked decreaseVolume() ");
	if(isConnected=true){
		System.out.println("Tv is turned on");
	if(currentVolume > minVolume){
		currentVolume = currentVolume-1;
		System.out.println("currentVolume is :"+currentVolume);
	}
	else{
		System.out.println("Min Volume Reached");
	}
	}
	else{
		System.out.println("Turn on the Tv");
	}
	System.out.println("End of decreaseVolume()");
}
	
}