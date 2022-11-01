package com.xworkz;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	
	public DispatcherInitializer() {
	System.out.println("------------DispatcherInitializer constructor----------");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {		
		System.out.println("------------ getRootConfig Classes----------");
		return new Class[] {MvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("--------------- getServletMappings----------");
		
		return new String[] {"/"};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
