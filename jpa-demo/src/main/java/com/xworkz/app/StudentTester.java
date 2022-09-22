package com.xworkz.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student = new Student();
		//step 1 : create entity object and set the value
		
		student.setId(110);
		student.setName("Rahi");
		student.setAge(17);
		student.setHometown("Balepet");
		
		//step 2 :
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_xworkz");
		
		//step 3 :
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//step 4:
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		entityManager.persist(student);	//persist method inserts data into table 
		entityTransaction.commit();	//commit method will flush out all the data into db
		entityManager.close();
		entityManagerFactory.close();
			
		
	}

}
