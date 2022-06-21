class ShowRoom1{

static String  name = "WoodLands"; // Static variable, class class variable;
static int noOfBranches=44;
 int showRoomId;// instance variable, object variable
 long contactNo;
 String location;
 
 public ShowRoom1(int showRoomId, long contactNo, String location){
	 this.showRoomId = showRoomId;
	 this.contactNo = contactNo;
	 this.location = location;
 }

public static void main(String a[]){

	ShowRoom1 show = new ShowRoom1(1, 9876543789L, "Margosa Road");
System.out.println("ShowRoom Name :"+ShowRoom1.name);
System.out.println("No of Branches :"+ShowRoom1.noOfBranches);
System.out.println("ShowRoom Id :"+show.showRoomId+ "\n"+ "Contact No :"+show.contactNo +"\n"+"Location :" +show.location+"\n");

	ShowRoom1 show1 = new ShowRoom1(2, 87654367898L, "Athri Road");
System.out.println("ShowRoom Name :"+ShowRoom1.name);
System.out.println("No of Branches :"+ShowRoom1.noOfBranches);
System.out.println("2nd ShowRoom ID :" + show1.showRoomId + "\n"+ "ShowRoom Contact No :"+ show1.contactNo+ "\n" +"ShowRoom Location :" +show1.location+"\n");

	ShowRoom1 show2 = new ShowRoom1(3, 8761230984L,"BM road");
System.out.println("ShowRoom Name :"+ ShowRoom1.name);
System.out.println("No of Branches :"+ShowRoom1.noOfBranches);
System.out.println("3rd ShowRoom ID :"+show2.showRoomId+ "\n"+"ShowRoom Contact No :"+show2.contactNo+"\n"+"ShowRoom Location :"+show2.location+"\n");

	ShowRoom1 show3 = new ShowRoom1(4, 7654897610L, "KHB Colony");
System.out.println("ShowRoom Name :" + ShowRoom1.name);
System.out.println("no of Branches :"+ ShowRoom1.noOfBranches);
System.out.println("ShowRoom ID :"+show3.showRoomId+"\n"+"ShowRoom Contact No :"+show3.contactNo+"\n"+"ShowRoom Location :"+ show3.location);

}


}