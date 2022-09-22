package com.xworkz.block;

public class Block {
	
	public Block() {		
		System.out.println(this.getClass().getSimpleName()+"Object is created");
		
	}
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("static block");
	}
	
	public void m() {
		System.out.println("method block");
	}
	public static void main(String[] args) {
		System.out.println("main method block");
	}

}

/*	static blocks are executed with static methods first static blocks then instance blocks in a method
init of static and instance variable
instance block take both static and instance variable
static block take only instance variable  
go through get_class and getSimpleNme()
stack and heap*/
