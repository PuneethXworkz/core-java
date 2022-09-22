package com.xworkz.block;

public class Exception {
	
	public static void main(String[] args) {
		System.out.println("main methdo started");
		
		//for array(getting out of bound exception... is handled by try  catch block method.
		//try catch block method  is alternate way to handle exception only..n solution)
		try {
		System.out.println("Inside try block");
			
		String str = "Kamlesh";
		System.out.println(str.indexOf("l"));
		
		System.out.println("try block ended");
		}catch(NullPointerException nu){
			System.out.println("cannot access null object");
			nu.printStackTrace();
		}
		
		
		try {System.out.println("Inside another try block");
		int i[]=new int[5];
		i[0]=23;
		i[1]=11;
		i[2]=13;
		i[3]=16;
		i[4]=29;
		i[5]=88;
		
		System.out.println("end of another try block");
		}catch(ArrayIndexOutOfBoundsException ar) {
			
		ar.printStackTrace();
		}
		
		System.out.println("main method ended..");
	}
	
	
	
	
}
