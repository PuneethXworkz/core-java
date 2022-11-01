package com.xworkz.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//rather than xml file to configure spring bean we are using TestConfig class to configure spring bean
@Configuration
public class TestConfig {

	@Bean("kiaEngine")
	public Engine getEnginekia() {
		
		Engine kiaeng = new Engine();
		kiaeng.setModel("kia");
		kiaeng.setPower("32909CC");
		return kiaeng;
	}
	@Bean("bmwEngine")
	public Engine getEnginebmw() {
		Engine bmweng = new Engine();
		bmweng.setModel("bmw");
		bmweng.setPower("345990CC");
		
		return  bmweng;
	}
	
	@Bean("kia")
	public Car getCar() {	
		return new Car();
	}
	
	
}
