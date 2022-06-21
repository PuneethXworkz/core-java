class UserLogin{

public static void main(String a[]){

String result = login("puneeth.h01@gmail.com");
System.out.println("User Login with email : "+result);

long result2 = login(9986040739L);
System.out.println("User Login with Contact No : "+result2);


}

public static String login(String email){
	return email;
	
}

public static long login(long contactNumber){
	return contactNumber;
}
}