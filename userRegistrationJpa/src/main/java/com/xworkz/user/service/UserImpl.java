package com.xworkz.user.service;


import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.util.EntityManagerUtil;

public class UserImpl implements UserInf{
	
EntityManagerUtil managerUtil = new EntityManagerUtil();

	@Override
	public void createUser(User user) {
	
		EntityTransaction transaction = managerUtil.getEntityManager().getTransaction();
		transaction.begin();
		managerUtil.getEntityManager().getTransaction();
		managerUtil.getEntityManager().persist(user);
		
		managerUtil.getEntityManager().getTransaction().commit();		
		managerUtil.getEntityManager().close();
				
	}

	@Override
	public User findUserById(int userId) {
		Query query =managerUtil.getEntityManager().createNamedQuery("findById");
		query.setParameter("id", userId);
		
		List<User> listUser = query.getResultList();
		User returnUserId=null;
		
		for (User user : listUser) {
			returnUserId = user;
			
		}
		
		return returnUserId;
	}

	@Override
	public User updateUserAgeById(int age,int id) {
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		
		managerUtil.getEntityManager().getTransaction().begin();
		managerUtil.getEntityManager().remove(userId);
		managerUtil.getEntityManager().getTransaction().commit();
		
	}

	@Override
	public User loginUser(String email, String password) {
		return null;
	}
	
	@Override
	public User findByUserEmail(String email) {
	//select * from User where email =? and password =?		
	Query query = managerUtil.getEntityManager().createNamedQuery("findByEmail");
	
	//for setting parameter for JPQL Query
	query.setParameter("email", email);
	
	//for encrypt password
	//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	//query.setParameter("password", encoder.encode(password));
		
	List<User> listUser = query.getResultList();
	System.out.println("List of user :"+listUser.size());
	User retUser=null;
	for (User user : listUser) {
		
		 retUser = user;
	}
	
	return retUser;
	}

}