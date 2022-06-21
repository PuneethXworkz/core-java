class Npr{

public static void main(String args[]){
int npr = fact(5)/fact(5-3);
System.out.println(npr);

}

public static int fact(int factNumber){
	
	System.out.println("invoked fact()");
	
	int f =1;
	
	for(int i=1;i<=factNumber;i++){
		f = f * i;
	}
	System.out.println("end of fact()");
	return f;
}

}