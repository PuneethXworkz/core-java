package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
	System.out.println("main method started");
	
	User user=new User();
	user.setUserName("Janavi"); 

	Address address=new Address();
	address.setArea("jesmeir");
	address.setCity("Jharkhand");

	//setting address to user object(which map OneToOne)
	user.setAddress(address);	
	
	Configuration cfg=new Configuration();
			cfg.configure();
	SessionFactory factory	=cfg.buildSessionFactory();	
	//Session is equal to EntityManager in JPA
	Session session=factory.openSession();	
	//transaction is equal to EntityTransaction in JPA
	Transaction transaction=session.beginTransaction();

	//session.getTransaction();
//	to save the data	
	session.save(user);		//save method is equal to persist method.
	//session.save(address);
	
	
//	to fetch the data
	//User userId = session.find(User.class, 1);
	//System.out.println(userId);
	
//	to update the data using id.
	//User update = session.find(User.class, 3);
	//update.setUserName("Ramana");
	
//	to delete the data
	//Address delete = session.find(Address.class, 6);
	//session.delete(delete);
	//System.out.println("delete user-----"+delete);
	
	
	
		transaction.commit();

	session.close();
	factory.close();
	
	
	System.out.println("main method ended");
}
}
