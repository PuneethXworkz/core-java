package com.xworkz.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class PersonTester {

	public static void main(String[] args) {
		
		//step 1: create entity object and set the value
		
		Person per = new Person();
		per.setId(1);
		per.setFirstName( "Raju");
		per.setLastName("Jingade");
		
		per.setId(13);
		per.setFirstName("Ramya");
		per.setLastName("Kantare");
	
		//step 2: used to create entity manager by reading persistence.xml and 
		//it will load all db and hibernate properties to entityManager object
		
		//entityManagerFactory is an interface for each DB, only one EntityManager for each DB.
		EntityManagerFactory factoryManager = Persistence.createEntityManagerFactory("person_xworkz");
		
		//step 3: used to perform crud operations,	EntityManager is an interface
		EntityManager entityManager = factoryManager.createEntityManager();
		
		//step 4:EntityTransaction used to perform transaction management for save or update.
		//EntityTransaction  should be used only when we are saving or updating object
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		//step 5:
		entityManager.persist(per);	//persist method inserts record in table
		
		//entityManager.merge(Student.class);
		//entityManager.remove(per);
		transaction.commit();	//commit method will flush out all the data into db
		entityManager.close();
		factoryManager.close();
		
	/*
	create two project
	student-jpa to persist
	college-jpa to persist
	*/	
	}

}
