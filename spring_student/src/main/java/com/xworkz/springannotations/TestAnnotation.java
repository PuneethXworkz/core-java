package com.xworkz.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(TestConfig.class);
		
		
		Car car = app.getBean(Car.class);
		System.out.println(car);
		//car.carInformation();
	}
}
