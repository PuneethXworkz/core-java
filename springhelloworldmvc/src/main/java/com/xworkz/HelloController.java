package com.xworkz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	public HelloController() {
	System.out.println("-----HelloController()------");
	}
	
	//anyone one @annotation can be used.
	@RequestMapping(value = "/helloworld", method = RequestMethod.POST)
	public String handler(@ModelAttribute HelloWorld hello,Model model) {
		
		System.out.println("----handler-------"+hello.getMessage());
		
		ModelAndView mv = new ModelAndView("success");
		
		model.addAttribute("message", hello.getMessage());
		
		return "success";
	}
	
//	@RequestMapping(value = "")
//	public ModelAndView m1() {
//		
//		//String msg = hello.getMessage()+"to xworkz";
//		
//		ModelAndView mv = new ModelAndView("success");
//		mv.addObject("message","hello welcome to xworkz" );
//		//ModelAndView holds information of view and data
//		//1st parameter is viewname
//		//2nd parameter is modelname which wwe have defined in jsp file with dollar symbol{}
//		//3rd parameter actual value or object
//		
//		return  mv;
//		
//	} 
	
	
}
