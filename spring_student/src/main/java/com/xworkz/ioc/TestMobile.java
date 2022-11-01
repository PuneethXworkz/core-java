package com.xworkz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
	
	public static void main(String[] args) {
		
		/*
		 * Sim air = new Airtel(); air.calling(); air.data();
		 */
	
		ApplicationContext app = new ClassPathXmlApplicationContext("simbean2.xml");
		
		
		//Airtel air = (Airtel) app.getBean("sim");
		Sim air = app.getBean("sim",Airtel.class);
		air.calling();
		air.data();
		
	}
}
