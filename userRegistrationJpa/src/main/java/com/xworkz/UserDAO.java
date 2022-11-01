package com.xworkz;

//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.service.UserImpl;

public class UserDAO {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		User user = new User();		
		user.setName("Pakru");
		user.setEmail("Pakru@gmail.com");
		user.setAge(26);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dob;
		try {
			dob = dateFormat.parse("1993-03-03");
			user.setDateOfBirth(dob);		//yyy/mm/dd
			
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		user.setPassword(encoder.encode("pakru@12345"));
		
		UserImpl userImpl = new UserImpl();
		//userImpl.createUser(user);
		
//		User userEmail=userImpl.findByUserEmail("raji143@gmail.com");
//		System.out.println("After fetching the data "+userEmail.toString());
		
		
		//User userId= userImpl.findUserById(3);
		//System.out.println("Find user By id :"+userId);
		
		
		userImpl.deleteUserById(3);
	
		
		System.out.println("Main method ended");
	}

}
