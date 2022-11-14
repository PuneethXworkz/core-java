package com.online.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bank.dao.CustomerDao;
import com.online.bank.dto.Customer;
import com.online.bank.util.GenerateAccountNo;
import com.online.bank.util.GenerateCustomerId;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	public CustomerServiceImpl() {
	System.out.println("-----CustomerServiceImpl created------");	
	}
	

	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private BankService bankService;
	
	@Override
	public Customer saveCustomer(Customer customer) {
			System.out.println("----saveCustomer---service---");
			customer.setBank(bankService.findByBankName(customer.getBankName()));
			customer.setAccountNumber(getAccNo());
			customer.setCustomerId(getAccNo());
			
		return customerDao.saveCustomer(customer);
	}

	@Override
	public List<Customer> findByCustomerName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getAccNo() {
		return GenerateAccountNo.generateAccNo();
	}
	
	public long getCusId() {
		return GenerateCustomerId.generateCustomerId();
	}
	
	
	
	
}
