package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeTester {

	public static void main(String[] args) {
		
		EmployeeDTO emp = new EmployeeDTO();
		
		//emp.setId(10);
		emp.setName("janav");
		emp.setAge(356);
		emp.setAddress("lahore");
	
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();		//start persistence area
	
//		save the data
		manager.persist(emp);
		
//		emp.setName("Madava");
	//	emp.setName("Chanava");

//		fetch the data
		 //emp = (EmployeeDTO) manager.find(EmployeeDTO.class, 4);	//find method
		
//		find  method will get the record from db where id is equal to 2
//		(internally jpa will generate select query select* from emp where id=2)
//		if id is not present in table  find method will throw null pointer exception
		
		//System.out.println(emp);
		
		//employee.setName("mathura"); 		//to update the address of existing id(first find the record then updated it)
		
//		for deleting the record first find the record using find method by passing primary key
		
		//EmployeeDTO removeEmp = manager.find(EmployeeDTO.class, 2);
		//manager.remove(removeEmp);
		//System.out.println("Employee removed   :"+removeEmp);
		
		//EmployeeDTO employees = manager.find(EmployeeDTO.class, 5);
		//employees.setAge(400);
		//manager.merge(employees);
		//System.out.println(employees);
		
		transaction.commit();	//end persistence area or detached state
		manager.close();
		factory.close();
		
	//	System.out.println("Employee info :"+employee.toString());
		
		//getAllEmployees();
	//	getEmployeeName();
	}
	
	public static void getAllEmployees() {
		//below EntityManagerFactory will read all db and hibernate properties in entitymanager Object.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
	//	EntityTransaction trans = manager.getTransaction();
	//	trans.begin();
		/*Query(it is a interface  javax.persistence)
		 Query object holds the  information which was returned by jpa query
		 Query object is like resultSet in jdbc
		 Query will return class object which was passed in createQuery("-----");
		 while ResultSet will return only data in the table
		 */
		Query query = manager.createQuery("from EmployeeDTO");//inside("it will be always ClassName")
		query.getResultList().forEach(e->{
			System.out.println("emp :"+e.toString());
		});
		
		
	//	trans.commit();
		manager.close();
		factory.close();		
	}
	public static  void getEmployeeName() {
		
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
				EntityManager manager = factory.createEntityManager();
				//EntityTransaction trans = manager.getTransaction();
				//trans.begin();
				
				Query query = manager.createQuery("select a.name from EmployeeDTO a");
				query.getResultList().forEach(e->{System.out.println("employeeName :"+e.toString());
				});
				
				
			//	trans.commit();
				manager.close();
				factory.close();		
	}
	

}