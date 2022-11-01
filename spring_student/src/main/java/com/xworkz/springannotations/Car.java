package com.xworkz.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

//example for @AutoWired with xml annotations
@Data
public class Car {
	
	@Value("KIA")
	private String name;
	@Value("230990.99")
	private double price;
	
	@Autowired
	@Qualifier("kiaEngine")
	private Engine e;
	
	public void carInformation() {
		System.out.println("---Car Info---"+e.toString());
	}
	
	
}
