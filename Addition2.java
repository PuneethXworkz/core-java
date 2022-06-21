class Addition2{
	
public static void main(String a[]){

int additionWithTwoNumbers = add (33,44);
System.out.println(additionWithTwoNumbers);

int additionWithThreeNumbers = add(55,66,77);
System.out.println(additionWithThreeNumbers);

}

public static int add(int a, int b){
	return a+b;	
}
public static int add(int a, int b, int c){
	return a+b+c;
}

}