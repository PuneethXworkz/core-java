package com.xworkz.user.service;

import com.xworkz.user.dto.User;

public interface UserInf {
	
	
	public void createUser(User user);
	public User findUserById(int userId);
	public User updateUserAgeById(int age,int id);
	public void deleteUserById(int userId);
	public User loginUser(String email, String password);
	public User findByUserEmail(String email);
	
	
	
}