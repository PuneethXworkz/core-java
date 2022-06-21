class Speaker{

static String brand = "Lenovo";
static double price = 2000.00; 
static boolean isConnected;
static int minVolume;
static int currentVolume;
static int maxVolume=5;

public static void main(String args[]){
	System.out.println("Brand :" + brand);
	System.out.println("Price of Speaker :" + price);
	System.out.println("Type : On/Off");


increaseVolume();
onOrOff();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
onOrOff();

}

public static void onOrOff(){

if(isConnected ==false){
System.out.println("Invoking onOrOff ()");
isConnected=true; 
System.out.println("Speaker is turned on..Available for connection");
}

else if(isConnected == true){
isConnected = false;
System.out.println("Speaker is turned off...");
}
System.out.println("End of onOrOff");
}

public static void increaseVolume(){
	System.out.println("increaseVolume() started");
	if(isConnected == true){
		System.out.println("Speaker is turned on");
		
		if(currentVolume < maxVolume){
		currentVolume = currentVolume + 1;
		System.out.println("The Current Volume is"+currentVolume);
	}
	else{
		System.out.println("Max Volume Reached");
	}
	}
	else{
		System.out.println("Switch On the Speaker");
		}
		System.out.println("increaseVolume() ended");
}

public static void decreaseVolume(){
	System.out.println("decreaseVolume() started");
	if(isConnected=true){
		System.out.println("Speaker is turned on");
		
		if(currentVolume>minVolume){
			currentVolume = currentVolume-1;
			System.out.println("Current Volume is"+currentVolume);
		}
		else{
			System.out.println("Min Volume Reached");
		}
	}
		else {
			System.out.println("Turn on the Speaker");
		}

	
}
}