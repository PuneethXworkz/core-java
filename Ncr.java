class Ncr{

public static void main(String a[]){

long ncr = fact(5)/(fact(2)*fact(5-2));
System.out.println(ncr);
}
public static long fact(int factNumber){
	int f=1;
	
	for(int i=1; i<=factNumber;i++){
		f = f * i;
		
	}
	return f;
}
}