package com.online.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bank.dao.CustomerDao;
import com.online.bank.dto.Bank;
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
			customer.setBank((Bank) bankService.findByBankName(customer.getBankName()));
			customer.setAccountNumber(getAccNo());
			customer.setCustomerId(getCusId());
			
		return customerDao.saveCustomer(customer);
	}

	@Override
	public List<Customer> findByCustomerName(String firstName) {
		System.out.println("----findCustomerByName----service---");
		return customerDao.findByCustomerName(firstName);
	}
	
	public int getAccNo() {
		return GenerateAccountNo.generateAccNo();
	}
	
	public int getCusId() {
		return GenerateCustomerId.generateCustomerId();
	}

	@Override
	public Customer updateCustomerAddressByName(String firstName, String address) {
		System.out.println("---updateCustomerAddressByName---service---");
		return customerDao.updateCustomerAddressByName(firstName, address);
	}

	@Override
	public void deleteCustomerDetailsByName(String firstName) {
		customerDao.deleteCustomerDetailsByName(firstName);	
	}	
}
