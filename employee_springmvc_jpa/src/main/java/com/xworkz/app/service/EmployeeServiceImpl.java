package com.xworkz.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.app.dao.EmployeeDao;
import com.xworkz.app.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	public EmployeeServiceImpl() {
		System.out.println("-----EmployeeServiceImpl------");
	}
	
	@Autowired		//it'll not create a object it'll wire the object.
	private EmployeeDao employeeDao;
	
	@Override
	public EmployeeDto save(EmployeeDto employeeDto) {
		System.out.println("------save()---EmployeeService-----");
		return employeeDao.save(employeeDto);
	}

	@Override
	public EmployeeDto searchByEmployeeFirstName(String firstName) {
		System.out.println("------search()---EmployeeService------");
		return employeeDao.searchByEmployeeFirstName(firstName);
	}

}
