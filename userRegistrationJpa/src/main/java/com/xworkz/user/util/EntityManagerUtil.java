package com.xworkz.user.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private  EntityManager entityManager;
	
	public EntityManagerUtil() {
		//manager =Persistence.createEntityManagerFactory("user").createEntityManager();
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");
	entityManager = factory.createEntityManager();
	
	}
	
	public  EntityManager getEntityManager() {
		return entityManager;
	}

}