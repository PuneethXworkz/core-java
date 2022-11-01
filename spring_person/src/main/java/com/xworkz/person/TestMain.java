package com.xworkz.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext app =  new ClassPathXmlApplicationContext("person.xml");	
		Person per = (Person)app.getBean("person");	
		System.out.println("Id :"+per.getId());
		System.out.println("Name :"+per.getName());
		System.out.println("Address :"+per.getAddress());
		System.out.println("List Of Cars :"+per.getListOfCars());
	
	}

}
