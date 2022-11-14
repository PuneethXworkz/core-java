package com.online.bank.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.online.bank.dto.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	public CustomerDaoImpl() {
		System.out.println("-----CustomerDaoImpl created-----");
	}
	
	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager = null;

	@Override
	public Customer saveCustomer(Customer customer) {
		boolean isCustomerSaved=false;
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();		
		System.out.println("------Employee Saved------");
		isCustomerSaved =true;
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
//			factory.close();
		}		
		//validation
		return isCustomerSaved ? customer : null;
	}

	@Override
	public List<Customer> findByCustomerName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
