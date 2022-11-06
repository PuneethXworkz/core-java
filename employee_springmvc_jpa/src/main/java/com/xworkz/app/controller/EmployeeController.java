package com.xworkz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.dto.EmployeeDto;
import com.xworkz.app.service.EmployeeService;

@Controller				//only jsp,css, html.
//@RestController			//it'll return jason, rest api-
//soap
public class EmployeeController {
	
	public EmployeeController() {
		System.out.println("----EmployeeConstructor----");	
		}
	@Autowired
	 EmployeeService employeeService;	
	
	@RequestMapping(value ="save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute EmployeeDto employeeDto) {
		
		System.out.println("-----saveEmployee------"+this.getClass());
		
		EmployeeDto employeedto = employeeService.save(employeeDto);
		System.out.println("-------save employee----"+employeeDto.getFirstName());

		return new ModelAndView("welcome");
	}

	
	
}

/*
@ResuestingMapping will get the action name(url from UI Page)
RequestMethod POST post type request,
@ModelAndView  will bind 
*/
