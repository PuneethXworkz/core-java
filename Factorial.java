class Factorial{

public static void main(String a[]){

long factValue = fact(10);
System.out.println("The Factorial is "+factValue);
}

public static long fact(int factNumber){
	System.out.println("invoked fact()");
int f=1;

for(int i=1; i<=factNumber; i++){
	f = f * i;
}
System.out.println("end of fact()");
return f;
}
}