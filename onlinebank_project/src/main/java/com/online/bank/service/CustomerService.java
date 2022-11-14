package com.online.bank.service;

import java.util.List;

import com.online.bank.dto.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public List<Customer> findByCustomerName(String firstName);
	
}
