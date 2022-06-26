class TestingToolTester{

public static void main(String a[]){
	
Selenium selenium = new Selenium();
	selenium.operatingSystem = "Cross-Platform";
	selenium.type = "Software testing FrameWork for web applications";
	selenium.license = "Apache License 2.0";
	selenium.website = "selenium.dev";
	selenium.stableRelease = "4.0.0/October 13 2021"; 
	selenium.toTest();
System.out.println("Operating System :"+selenium.operatingSystem+"\n"+"Type :"+selenium.type+"\n"+"License :"+selenium.license+"\n"+"Website :"+selenium.website+"\n"+"Stable Release :"+selenium.stableRelease);

}


}