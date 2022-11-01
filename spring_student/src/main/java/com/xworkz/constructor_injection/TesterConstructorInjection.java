package com.xworkz.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterConstructorInjection {
	
	public static void main(String[] args) {
	
		ApplicationContext app = new ClassPathXmlApplicationContext("constructorinjection.xml");
		
		Person per= app.getBean("puni",Person.class);
		per.displayPerson();
		
		
		
		 Car hyundai = app.getBean("hyundai",Car.class); hyundai.displayCar();
		 
		 Car kia = (Car)app.getBean("kia"); kia.displayCar();
		
		
	}
}
