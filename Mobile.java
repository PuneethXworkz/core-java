class Mobile{
	
String brand;
int id;
String modelNo;
String color;
int price;
String processorName;

public static void main (String anj[]){
	
	Mobile mob = new Mobile();
mob.brand = "Poco F1";
mob.id = 9910;
mob.modelNo = "PF1MA19";
mob.color = "Black";
mob.price = 23999;
mob.processorName = "Snap Dragon";
System.out.println("Brand : "+mob.brand);
System.out.println("Mobile ID :"+mob.id);
System.out.println("Model No :"+mob.modelNo);
System.out.println("Color :"+mob.color);
System.out.println("Price :"+mob.price);
System.out.println("Processor Name :"+mob.processorName+ "\n");


	Mobile mob1 = new Mobile();
mob1.brand = "One +";
mob1.id = 1086;
mob1.modelNo = "OPFE20";
mob1.color = "Blue";
mob1.price = 33999;
mob1.processorName = "Octa Core";
	System.out.println("Brand : "+mob1.brand);
	System.out.println("Mobile ID :"+mob1.id);
	System.out.println("Model No :"+mob1.modelNo);
	System.out.println("Color :"+mob1.color);
	System.out.println("Price :"+mob1.price);
	System.out.println("Processor Name :"+mob1.processorName+ "\n");

	Mobile mob2 = new Mobile();
mob2.brand = "Vivo";
mob2.id = 2200;
mob2.modelNo = "VIOC21";
mob2.color = "Silver";
mob2.price = 22799;
mob2.processorName = "Jelly Bean";
	System.out.println("Brand : "+mob2.brand);
	System.out.println("Mobile ID :"+mob2.id);
	System.out.println("Model No :"+mob2.modelNo);
	System.out.println("Color :"+mob2.color);
	System.out.println("Price :"+mob2.price);
	System.out.println("Processor Name :"+mob2.processorName+ "\n");
	
	Mobile mob3 = new Mobile();
mob3.brand = "Nokia";
mob3.id = 4099;
mob3.modelNo = "NONO18";
mob3.color = "Grey";
mob3.price = 12499;
mob3.processorName = "Snap Dragon 6.0";
	System.out.println("Brand : "+mob3.brand);
	System.out.println("Mobile ID :"+mob3.id);
	System.out.println("Model No :"+mob3.modelNo);
	System.out.println("Color :"+mob3.color);
	System.out.println("Price :"+mob3.price);
	System.out.println("Processor Name :"+mob3.processorName+ "\n");

	Mobile mob4 = new Mobile();
mob4.brand = "Samsung";
mob4.id = 2887;
mob4.modelNo = "SADE17";
mob4.color = "Black/Silver";
mob4.price = 19999;
mob4.processorName = "Robo 8.0";
	System.out.println("Brand : "+mob4.brand);
	System.out.println("Mobile ID :"+mob4.id);
	System.out.println("Model No :"+mob4.modelNo);
	System.out.println("Color :"+mob4.color);
	System.out.println("Price :"+mob4.price);
	System.out.println("Processor Name :"+mob4.processorName+ "\n");
	
}


}