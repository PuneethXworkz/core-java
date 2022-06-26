class DeveloperTester{

public static void main(String a[]){
	
	Dev dev = new Dev();
	dev.toolUsed = "Java";
	dev.otherActivities = "Trainer";
	dev.expertizeIn = "FrameWorks";
	dev.softwaresKnown = "Java, Frame Works, SQL,Java Script";
	dev.developingSoftware();

System.out.println("Softwares Used for Developing : "+dev.toolUsed+"\n"+"Other Activities : "+dev.otherActivities+"\n"+"Expertize in : "+dev.expertizeIn+"\n"+"Software Known : "+dev.softwaresKnown+"\n");
	
	/*
	String toolUsed;
String otherActivities;
String expertizeIn;
String softwaresKnown;
	*/
}

}