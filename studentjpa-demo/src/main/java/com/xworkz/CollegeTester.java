package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeTester {

	public static void main(String[] args) {
		
		College col = new College();
		
		col.setC_id(21);
		col.setC_Name("RDBMS");
		col.setC_Type("Co-Head");
		col.setC_address("PrakashNagar");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student_xworkz");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(col);
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
