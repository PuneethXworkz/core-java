package com.xworkz.app.dao;

import com.xworkz.app.dto.EmployeeDto;

public interface EmployeeDao {
	
	public EmployeeDto save(EmployeeDto employeeDto);
	public EmployeeDto searchByEmployeeFirstName(String firstName);
	
	
}
