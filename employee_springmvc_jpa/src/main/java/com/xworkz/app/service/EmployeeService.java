package com.xworkz.app.service;

import com.xworkz.app.dto.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto save(EmployeeDto employeeDto);
	public EmployeeDto searchByEmployeeFirstName(String firstName);
	
}
