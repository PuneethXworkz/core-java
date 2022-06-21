class ShowRooms{
	
String name;
String address;
String type;
int shopNumber;
String[] showRoomItems = {"T-Shirts","Shirts","Jeans","Trousers","Shorts"};
String[] showRoomItems1 = {"Shoes", "Sandals", "Kids shoes","Flipflops"};
String[] showRoomItems2 = {"Cooker","Stove","Mixer Grinder","Oven","Chimney"};
String[] showRoomItems3 = {"Titan","Sonata","G Shock","Timex","Titan duos"};
String[] showRoomItems4 = {"Mankuthimmana Kagga","The Novels","The Future Past","Forget the Past","Future days"};

public static void main(String a[]){

ShowRooms showRoom = new ShowRooms();

showRoom.name = "Nithya Garments";
showRoom.address = "Navrang";
showRoom.type = "Clothes & Apparels";
showRoom.shopNumber = 43;
System.out.println("ShowRoom name :"+showRoom.name);
System.out.println("ShowRoom address :"+showRoom.address);
System.out.println("ShowRoom type :"+showRoom.type);
System.out.println("ShowRoom No :"+showRoom.shopNumber );
System.out.println("Items Available in Nithya Garments :");
showRoom.getshowRoomItems();


ShowRooms showRoom1 = new ShowRooms();
showRoom1.name = "My 9";
showRoom1.address ="Modi Hospital, Navarng";
showRoom1.type = "Shoes and Slippers";
showRoom1.shopNumber = 87;
System.out.println("ShowRoom name :"+showRoom1.name);
System.out.println("Address of My 9 :"+showRoom1.address);
System.out.println("ShowRoom type :"+showRoom1.type);
System.out.println("ShowRoom No :"+showRoom1.shopNumber);
System.out.println("Items Available in My 9 :");
showRoom1.getshowRoomItems1();


ShowRooms showRoom2 = new ShowRooms();
showRoom2.name = "Prestige";
showRoom2.address = "1st block Rajajinagar";
showRoom2.type = "Kitchen Accessories ";
showRoom2.shopNumber = 34;
System.out.println("ShowRoom name :"+showRoom2.name);
System.out.println("Address of Prestige Shoroom :"+showRoom2.address);
System.out.println("ShowRoom type :"+ showRoom2.type);
System.out.println("ShowRoom No "+showRoom2.shopNumber);
System.out.println("Items Availble in Prestige :");
showRoom2.getshowRoomItems2();

ShowRooms showRoom3 = new ShowRooms();
showRoom3.name = "My Watches";
showRoom3.address = "Malleshwaram";
showRoom3.type = "watches";
showRoom3.shopNumber = 78;
System.out.println("ShowRoom Name :"+showRoom3.name);
System.out.println("Address of My Watches :"+showRoom3.address);
System.out.println("ShowRoom Type :"+showRoom3.type);
System.out.println("ShowRoom No :"+showRoom3.shopNumber);
System.out.println("Items Available in My Watches :");
showRoom3.getshowRoomItems3();

ShowRooms showRoom4 = new ShowRooms();
showRoom4.name = "Book World";
showRoom4.address = "Rajajinagar 5th Block";
showRoom4.type = "Books";
showRoom4.shopNumber = 007;
System.out.println("ShowRoom Name :"+showRoom4.name);
System.out.println("Address of Book World :"+showRoom4.address);
System.out.println("ShowRoom Type "+showRoom4.type);
System.out.println("ShowRoom No :"+showRoom4.shopNumber);
System.out.println("Items Available in Book World :");
showRoom4.getshowRoomItems4();

}
public void getshowRoomItems(){
	for (int a=0;a<showRoomItems.length;a++){
		System.out.println(showRoomItems[a]);
	}
}
public void getshowRoomItems1(){
	for(int b=0;b<showRoomItems1.length;b++){
		System.out.println(showRoomItems1[b]);
	}
}

public void getshowRoomItems2(){
	for(int c=0;c<showRoomItems2.length;c++){
		System.out.println(showRoomItems2[c]);
	}
}
public void getshowRoomItems3(){
	for(int d=0;d<showRoomItems3.length;d++){
		System.out.println(showRoomItems3[d]);
	}
}
public void getshowRoomItems4(){
	for(int e=0;e<showRoomItems4.length;e++){
		System.out.println(showRoomItems4[e]);
	}
}
}