package com.online.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bank.dao.BankDao;
import com.online.bank.dto.Bank;
@Service
public class BankServiceImpl implements BankService {
	
	public BankServiceImpl() {
		System.out.println("----BankServiceImpl------");
	}
	
	@Autowired
	private BankDao bankDao;
	
	@Override
	public Bank saveBank(Bank bank) {
		System.out.println("-----saveBank---EmployeeService----");
		return bankDao.saveBank(bank);
	}

	@Override
	public Bank findByBankName(String bankName) {
		System.out.println("-----findBank----service---");
		return bankDao.findByBankName(bankName);
	}

	@Override
	public Bank updateBankAddressByName(String bankName,String address) {
		System.out.println("------updateBankAddressByName---Service----");
		return bankDao.updateBankAddressByName(bankName, address);
	}

	@Override
	public void deleteBankDetailsByBankName(String bankName) {
		bankDao.deleteBankDetailsByBankName(bankName);	
	}

}
