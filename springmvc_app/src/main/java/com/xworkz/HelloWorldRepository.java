package com.xworkz;

import org.springframework.data.repository.CrudRepository;

public interface HelloWorldRepository  {
	//extends CrudRepository<HelloWorld, Integer>
	
	boolean save(HelloWorld helloWorld);
	
}
