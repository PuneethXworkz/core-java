class Shoes{
	
String name;
int id;
String brand;
String color;
String price;
String type;

public static void main(String a[]){

Shoes shoe = new Shoes();

shoe.name= "Canvas";
shoe.brand = "Puma";
shoe.id = 1;
shoe.color = "Red,Blue,Grey";
shoe.price = "999-3999";
shoe.type = "Men";
System.out.println("Shoe :"+shoe.name);
System.out.println("Brand :"+shoe.brand);
System.out.println("ID :"+shoe.id);
System.out.println("Color :"+ shoe.color);
System.out.println("Shoe Type :"+shoe.type);


Shoes shoe1 = new Shoes();
shoe1.name = "Sports";
shoe1.brand = "Nike";
shoe1.id =2;
shoe1.color = "Black, Grey, White";
shoe1.price = "899-2999";
shoe1.type = "Unisex";
System.out.println("Shoe:" +shoe1.name);
System.out.println("Brand :"+shoe1.brand);
System.out.println("ID :"+shoe1.id);
System.out.println("Color :"+shoe1.color);
System.out.println("Shoe Price :"+shoe1.price);
System.out.println("Shoe Type :"+shoe1.type);

Shoes shoe2 = new Shoes();
shoe2.name = "Canvas";
shoe2.brand = "Lotto";
shoe2.id = 3;
shoe2.color = "Red, Blue";
shoe2.price = "499-1599";
shoe2.type = "Kids";
System.out.println("Shoe :"+shoe2.name);
System.out.println("Brand :"+shoe2.brand);
System.out.println("ID :"+ shoe2.id);
System.out.println("Color :"+shoe2.color);
System.out.println("Shoe Price :"+shoe2.price);
System.out.println("Shoe Type :"+shoe2.type);


Shoes shoe3 = new Shoes();
shoe3.name = "Casual";
shoe3.brand = "DJ&C";
shoe3.id = 4;
shoe3.color = "Black, Grey";
shoe3.price = "399-2399";
shoe3.type = "Kids";
System.out.println("Shoe :"+shoe3.name);
System.out.println("Brand :"+shoe3.brand);
System.out.println("ID :"+shoe3.id);
System.out.println("Color :"+shoe3.color);
System.out.println("Shoe Price :"+shoe3.price);
System.out.println("Shoe Type :"+shoe3.type);

Shoes shoe4 = new Shoes();
shoe4.name = "Loafers";
shoe4.brand = "Alibaba";
shoe4.id =5;
shoe4.color = "Purple, OliveGreen";
shoe4.price = "299-4999";
shoe4.type = "Men";
System.out.println("Shoe :"+shoe4.name);
System.out.println("Brand :"+shoe4.brand);
System.out.println("ID :"+shoe4.id);
System.out.println("Color :"+shoe4.color);
System.out.println("Shoe Price "+shoe4.price);
System.out.println("Shoe Type :"+shoe4.type);

}
}