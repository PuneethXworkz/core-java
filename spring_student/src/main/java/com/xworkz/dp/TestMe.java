package com.xworkz.dp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMe {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("setterinjection.xml");
	
		Me me = app.getBean("me",Me.class);
		
		
		System.out.println("Id :"+me.getId());
		System.out.println("Name :"+me.getName());
		System.out.println("Job :"+me.getJ().getDesignation());
		System.out.println("List Of Id :"+me.getListOfIds());
		
	}

}
