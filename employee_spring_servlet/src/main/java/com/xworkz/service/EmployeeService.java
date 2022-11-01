package com.xworkz.service;

import java.util.Random;

import com.xworkz.dao.EmployeeDao;
import com.xworkz.dto.EmployeeDto;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDao();
	
	public Boolean saveEmployee(EmployeeDto dto) {
		System.out.println("---------service class-----------");
		
		//write bussiness logic to generate id
		Random random = new Random();
		int idNo = random.nextInt()+2;
		//setting random id to employee id
		
		dto.setId(idNo);
		//passing dto class to dao class.
		Boolean result = dao.saveEmployee(dto);
		
		System.out.println("------return to controller-------");
		return result;
		
	}
	

}
