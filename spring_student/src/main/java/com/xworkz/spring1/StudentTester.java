package com.xworkz.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {
	
	public static void main(String[] args) {
		
		/*Application context is a sub interface of Bean factory
		it creates object by reading spring bean xml(studentbean.xml) file
		ap will load the xml file and perform pre-instantiation
		
		spring will create singleton object
		*/		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("studentbean.xml");
		
		/* getbean will return object(java.lang.Object) created by spring
		 we need to downcast to pojo class type
		 */		
	Student st = (Student)app.getBean("s");
	
	
	System.out.println("Id :"+st.getId());
	System.out.println("Name :"+st.getName());
	System.out.println("RollNo :"+st.getRollNo());
	}

}

/*
assgn - create a person object---
id int
name String
list of cars--->car obj  List<Car>

Car
id
name
model
price


*/