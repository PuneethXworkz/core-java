package com.xworkz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.CollegeDTO;
import com.xworkz.dto.StudentDTO;


public class Tester {

	public static void main(String[] args) {
		

		CollegeDTO clg = new CollegeDTO();
		clg.setC_Name("MandyaGovtPoly");
		clg.setC_Address("Mandya");
		clg.setC_NoOfFaculties(16);
		
		StudentDTO st = new StudentDTO();
		st.setS_Name("Bharu");
		st.setS_Age(23);
		st.setS_Address("Mysore");		
		st.setS_College(clg);
		
		Configuration cfg = new Configuration().configure();		
		SessionFactory factory = cfg.buildSessionFactory();		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(st);
		
		trans.commit();
		factory.close();
		session.close();		
	}

}
