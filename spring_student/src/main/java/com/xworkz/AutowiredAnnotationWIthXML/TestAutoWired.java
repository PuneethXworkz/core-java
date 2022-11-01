package com.xworkz.AutowiredAnnotationWIthXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWired {
	
	public static void main(String[] args) {
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("autowiredAnnotationwithXML.xml");
		
		Car car = app.getBean("c", Car.class);
		car.carInformation();
	}

}
