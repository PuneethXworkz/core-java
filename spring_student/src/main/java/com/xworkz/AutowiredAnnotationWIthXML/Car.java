package com.xworkz.AutowiredAnnotationWIthXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//example for @AutoWired with xml annotations

public class Car {
	
	@Autowired
	@Qualifier("bmw")
	private Engine e;
	
	public void carInformation() {
		
		System.out.println("---Car Info---"+e.toString());
	}

}
