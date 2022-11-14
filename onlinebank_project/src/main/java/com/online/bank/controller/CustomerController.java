package com.online.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.online.bank.dto.Customer;
import com.online.bank.service.CustomerService;

@Controller
public class CustomerController {

	public CustomerController() {
		System.out.println("------CustomerController created------");
	}
	@Autowired
	CustomerService customerService;
	
@RequestMapping(value ="customersave", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		
		Customer customerResponse= customerService.saveCustomer(customer);
		System.out.println("Customer saved---"+customerResponse.getUserName());
		
		return new ModelAndView("customersaved");
	}

@RequestMapping(value = "findcustomer", method = RequestMethod.GET)
public ModelAndView findCustomerByName(@ModelAttribute String customerName) {
	System.out.println("----findCustomerByName---controller---");
	List<Customer> listCustomer= customerService.findByCustomerName(customerName);
	return new ModelAndView("customerfound","customers",listCustomer);
}
	
}
