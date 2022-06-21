class Stationary{

String name;
int price;
int model;
String color;
int packSize;

public static void main (String a[]){

System.out.println("Items Available in Stationary are :");

	Stationary stat = new Stationary();
stat.name = "Pen";
stat.price = 7;
stat.model = 234;
stat.color = "Blue/Black/Red";
stat.packSize = 5;
	System.out.println("1st Item Name :"+stat.name);
	System.out.println("Price of "+stat.name +" :" +stat.price);
	System.out.println("Model No :"+stat.model);
	System.out.println("Color :"+stat.color);
	System.out.println("Pack Size :"+stat.packSize+ "\n");
	
	

	Stationary stat1 = new Stationary();
stat1.name = "Pencil";
stat1.price = 5;
stat1.model = 113;
stat1.color = "Black";
stat1.packSize = 10;
	System.out.println("2nd Item Name :"+stat1.name);
	System.out.println("Price of "+stat1.name +" :" +stat.price);
	System.out.println("Model No :"+stat1.model);
	System.out.println("Color :"+stat1.color);
	System.out.println("Pack Size :"+stat1.packSize+ "\n");

		Stationary stat2 = new Stationary();
stat2.name = "Sketch Pen";
stat2.price = 20;
stat2.model = 335;
stat2.color = "Multi Color";
stat2.packSize = 20;
	System.out.println("3rd Item Name :"+stat2.name);
	System.out.println("Price of "+stat2.name +" :" +stat2.price);
	System.out.println("Model No :"+stat2.model);
	System.out.println("Color :"+stat2.color);
	System.out.println("Pack Size :"+stat2.packSize+ "\n");
	
	Stationary stat3 = new Stationary();
stat3.name = "Crayons";
stat3.price = 25;
stat3.model = 198;
stat3.color = "Multi Color";
stat3.packSize = 30;
	System.out.println("4th Item Name :"+stat3.name);
	System.out.println("Price of "+stat3.name +" :" +stat3.price);
	System.out.println("Model No :"+stat3.model);
	System.out.println("Color :"+stat3.color);
	System.out.println("Pack Size :"+stat3.packSize+ "\n");
	
		Stationary stat4 = new Stationary();
stat4.name = "Scale";
stat4.price = 15;
stat4.model = 563;
stat4.color = "Transparent";
stat4.packSize = 20;
	System.out.println("5th Item Name :"+stat4.name);
	System.out.println("Price of "+stat4.name +" :" +stat4.price);
	System.out.println("Model No :"+stat4.model);
	System.out.println("Color :"+stat4.color);
	System.out.println("Pack Size :"+stat4.packSize+ "\n");
}


}