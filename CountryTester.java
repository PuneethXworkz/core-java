class CountryTester{

public static void main(String a[]){
	
	India india = new India();
india.religion = "Hindu";	
india.languageUsed = "Multiple";
india.nationalBird = "Peacock";
india.nationalAnthem = "Jana Gana mana";
india.nationalCurrency = "Indian Rupees";
india.noOfStates = 28;

india.diversified();
System.out.println("Religion : "+india.religion+"\n"+"Language : "+india.languageUsed+"\n"+"National Bird : "+india.nationalBird+"\n"+"National Anthem : "+india.nationalAnthem+"\n"+"National Currency : "+india.nationalCurrency+"\n"+"No of States : "+india.noOfStates+"\n");
	
	/*
	String religion;
String languageUsed;
String nationalAnthem;
String nationalBird;
String currency;
int noOfStates;
	*/
	
	
}

}