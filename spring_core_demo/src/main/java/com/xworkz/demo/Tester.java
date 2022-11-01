package com.xworkz.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("demo.xml");
		
		
		
		/*
		getBean method will take argument as bean id and 
		return object created by ApplicationContext.Always getBean will return Object Class
		we need to downCast as per pojo class
		 */	
		
		Demo d  = (Demo) ap.getBean("d");		//pass the id from the xml file
		
		System.out.println("----Message------"+d.getMessage());
		
		
		//creating two reference to check  Spring  is singleton 
//		Demo d2  = (Demo) ap.getBean("d");		//pass the id from the xml file
//		
//System.out.println("d-----"+d.hashCode());
//System.out.println("d2-----"+d2.hashCode());
	}
	
	/*
	 Application context is a sub  interface of Bean factory which creates the object by reading 
	 Spring bean xml file(demo.xml).
	 
	 ApplicationContext loads the xml file and will perform pre-instantiation
	 
	 Bean always create Singleton Object.
	 
	 */

}
