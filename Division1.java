class Division1{

public static void main(String a[]){
	
int finalDivValue = division(20, 4);
System.out.println("Div of Two numbers is "+ finalDivValue);

int finalDivValue1 = division(300,2,2)	;
System.out.println("Div of three numbers are "+finalDivValue1);
}

public static int division(int a, int b){
		return a/b;
}
public static int division(int a, int b, int c){
	return a/b/c;
}
}