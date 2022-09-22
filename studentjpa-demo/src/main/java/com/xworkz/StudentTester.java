package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTester {

	public static void main(String[] args) {
		
		//step 1 : create entity object
		Student st = new Student();
		st.setId(111);
		st.setName("Rahi");
		st.setAge(17);
		st.setHometown("Rona");
		
		//step 2:
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student_xworkz");
		
		//step 3:
		EntityManager em = emf.createEntityManager();
		
		//step 4:
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		//step 5:
		em.persist(st); // persist method inserts record into table
		et.commit();
		em.close();
		emf.close();
		
		
		
		
	}

}
