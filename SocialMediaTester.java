class SocialMediaTester{

public static void main(String a[]){
	
	Instagram insta = new Instagram();
	insta.version = "Beta Version";
	insta.multipleLogin = "Upto 3 Logins";
	insta.security = "contact No/Gmail Needed.";
	insta.isInternetNeeded = "Yes";
	
insta.onlinePlatform();
System.out.println(insta.version+" "+insta.multipleLogin+" "+insta.security+" "+insta.isInternetNeeded);
	
	
	
	/*
	String mode;
String multipleLogin;
String security;
String isInternetNeeded;
	*/
	
}

}