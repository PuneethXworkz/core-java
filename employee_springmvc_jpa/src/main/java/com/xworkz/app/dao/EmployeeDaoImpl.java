package com.xworkz.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.app.dto.EmployeeDto;

@Repository
public class EmployeeDaoImpl implements EmployeeDao  {

	public EmployeeDaoImpl() {
		System.out.println("-----EmployeeDaoImpl------");
	}

	@Autowired
	private EntityManagerFactory factory;
	
	private EntityManager manager=null;
	
	@Override
	public EmployeeDto save(EmployeeDto employeeDto) {
		
		boolean isEmployeeSaved=false;
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employeeDto);
		transaction.commit();		
		System.out.println("------Employee Saved------");
		isEmployeeSaved =true;
		manager.close();
		factory.close();

		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			
		}		
		//validation
		return isEmployeeSaved ? employeeDto : null;
	}

	@Override
	public EmployeeDto searchByEmployeeFirstName(String firstName) {
		
		
		return null;
	}

}
