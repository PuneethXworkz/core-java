package com.xworkz.relationship.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private EntityManager entityManager;
	
	public EntityManagerUtil() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("team");
		entityManager = factory.createEntityManager();
	}
	
	public EntityManager getEntityManager() {
		
		return entityManager;
	}
	
	
}