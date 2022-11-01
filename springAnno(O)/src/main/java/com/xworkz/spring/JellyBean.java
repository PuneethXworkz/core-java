package com.xworkz.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class JellyBean implements MobileProcessor {

	public void process() {
		
		System.out.println("World's mostly used processor");
	}

}
