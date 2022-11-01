package com.xworkz;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {
		
		CollegeDTO college = new CollegeDTO();
		
		//clg.setC_id(1);
		college.setC_name("JIT");
		college.setC_address("JnanaNagar");
		
		StudentDTO st = new StudentDTO();
		st.setS_name("banu");
		st.setS_address("bangalore");
		
		List<StudentDTO> student = new ArrayList<StudentDTO>();
		
		student.add(st);
		
		college.setListOfStudent(student);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		
		manager.persist(college);
		
		transcation.commit();
		manager.close();
		factory.close();
			
		
	}

}
