class SuperMarket1{

// Array Concept with for loop{declaration & initialization, condition , increment } outside main method &{method concept}

// added select one specific data from array, changing void-String, include if in for loop;
static String biscuits[] = {"Parle-G","MarieLight","Bourbon","MOM'sMagic","MilkBikis","Unibic","Hide&Seek"};
static String vegetables[] = {"Tomato", "Onion", "Carrot", "Potato","Garlic","Ginger","Cabbage"};
static String sportsProducts[] ={"Helmet","Bat","Ball","HockeyBat","TennisBall", "ShuttleRacket","Gripper"};
static String groceries[] ={"Rice","ToorDal","Jeera","TurmericPowder","Atta","Oil","Mustard"};
static String soaps[] ={"LUX","Lifebuoy","Dove","Pears","Santoor","Dettol","Medimix"};
static String detergents[] ={"wheel","Tide","Rin","SurfExcel","Ariel","Mr White","Ghadi"};
static String coolDrinks[] = {"Coke","Sprite","ThumsUp","Limca","PaperBoat","Pepsi","Sting"};
static String deos[] = {"Axe","ParkAvenue","KS","Nivea","Denver","Yardley","SetWet"};
static String homeAppliances[] = {"Cooker","GasStove","Kettle","Lighter","Knife","VaccuumCleaner","HandMixer"};
static String snacks[]={"Potato Chips","Banana Chips","namkeen","Makhana","Chakali","RoastedGN","SoyaSticks"};
static String fruits[]={"Mango","Apple","Grapes","Papaya","Pomogranate","Orange","Strawberry"};
static String giftItems[]={"Chains","Bangles","Idols","Chocolates","Cards","PhotoFrames","Miniatures"};
static String chocolates[]={"DiaryMilk","Perk","Munch","MilkyBar","GoneMad","Hershey'sKisses","LuVIt"};

public static void main(String args[]){

String result = getBiscuit("MilkBikis");
System.out.println("I will Pick "+ result);

String result1 = getVegetable("Onion");
System.out.println("I will Pick "+ result1);

String result2= getSportsProduct("TennisBall");
System.out.println("I Will pick "+ result2);

String result3 = getGrocery("TurmericPowder");
System.out.println("I will Pick "+result3);

String result4 = getSoap("Dove");
System.out.println("I Will pick "+result4);

String result5=getDetergent("Wheel");
System.out.println("I will pick "+result5);

String result6 = getCoolDrink("Coke");
System.out.println("I Will pick "+result6);

String result7=getDeo("KS");
System.out.println("I Will pick "+result7);

String result8=getHomeAppliance("Lighter");
System.out.println("I Will pick "+result8);

String result9 = getSnack("Banana Chips");
System.out.println("I Will pick "+result9);

String result10 = getFruit("Mango");
System.out.println("I will Pick "+result10);

String result11=getGiftItem("Cards");
System.out.println("I will pick "+result11);

String result12=getChocolate("LuVIt");
System.out.println("I will pick "+ result12);

}
 public static String getBiscuit(String bis){
String biscuitName=null;

for (int i=0;i<biscuits.length;i++){
if(biscuits[i]==bis){
	biscuitName=biscuits[i];
}
}
return biscuitName;
}

public static String getVegetable(String veg){
String vegetableName=null;
for (int i=0;i<vegetables.length;i++){
	if(vegetables[i]==veg){
		vegetableName=vegetables[i];
}
}
return vegetableName;
}

public static String getSportsProduct(String sport){
	String product=null;
	
	for(int i=0;i<sportsProducts.length;i++){
     if(sportsProducts[i]==sport){
		 product=sportsProducts[i];
}
}
 return product;
}
public static String getGrocery(String grocery){
String groceryName=null;
 for(int i=0; i<groceries.length;i++){
  if(groceries[i]==grocery){
	  groceryName=groceries[i];
  }
  }
  return groceryName;
}
public static String getSoap(String soap){
String soapName=null;
for(int i=0; i<soaps.length;i++){
if(soaps[i]==soap){
soapName=soaps[i];
}
}
	return soapName;
}

public static String getDetergent(String detergent){
String detergentName=null;
	for(int i=0; i<detergents.length;i++){
		if(detergents[i]==detergent){
			detergentName=detergents[i];
		}
	}
return detergentName;
		
}
 public static String getCoolDrink(String drink){
String drinkName=null;
for(int i=0; i<coolDrinks.length;i++){
	if(coolDrinks[i]==drink){
		drinkName=coolDrinks[i];
	}
}	 
	 return drinkName;
 }
 
 public static String getDeo(String deo){
	 String deoName=null;
	 for(int i=0;i<deos.length;i++){
		 if(deos[i]==deo){
			 deoName=deos[i];
		 }
	 }
	 return deoName;
 }

public static String getHomeAppliance(String appliance){
	String applianceName=null;
	for(int i=0;i<homeAppliances.length;i++){
		if(homeAppliances[i]==appliance){
			applianceName=homeAppliances[i];
		}
	}
	return applianceName;
} 

public static String getSnack(String snack){
	String snackName=null;
	for(int i=0; i<snacks.length;i++){
		if(snacks[i]==snack){
			snackName=snacks[i];
		}
	}
	return snackName;
}

public static String getFruit(String fruit){
	String fruitName=null;
	for(int i=0;i<fruits.length;i++){
		if(fruits[i]==fruit){
			fruitName=fruits[i];
		}
	}
	return fruitName;
}
 
public static String getGiftItem(String gift){
	String giftName=null;
	for(int i=0;i<giftItems.length;i++){
		if(giftItems[i]==gift){
			giftName=giftItems[i];
		}
	}
	return giftName;
}
 
public static String getChocolate(String chocolate){
	String chocolateName=null;
	for(int i=0;i<chocolates.length;i++){
		if(chocolates[i]==chocolate){
			chocolateName=chocolates[i];
}
}
	return chocolateName;
} 
}