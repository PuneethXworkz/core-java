package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {

	User user=new User();
	user.setUserName("shashira sir");


	Address address=new Address();
	address.setArea("btm");
	address.setCity("btm");

	//setting address to user object(which map OneToOne)
	user.setAddress(address);	
	
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory factory	=configuration.buildSessionFactory();
	
	//Session is equal to EntityManager in JPA
	Session session=factory.openSession();
	
	//transaction is equal to EntityTransaction in JPA
	Transaction transaction=session.beginTransaction();
	
	session.save(user);		//save method is equal to persist method.
	session.save(address);
	
	
	
	transaction.commit();
	session.close();
	
	
	
	
	
	

	
	
	
	
	
}
}