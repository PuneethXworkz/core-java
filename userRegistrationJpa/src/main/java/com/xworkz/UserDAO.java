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
		
		User raja = new User();		
		//raja.setId(12);
		raja.setName("Pakru");
		raja.setEmail("Pakru@gmail.com");
		raja.setAge(26);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dob;
		try {
			dob = dateFormat.parse("1993-03-03");
			raja.setDateOfBirth(dob);		//yyy/mm/dd
			
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		raja.setPassword(encoder.encode("Raji@12345"));
		
		UserImpl userImpl = new UserImpl();
		//userImpl.createUser(raja);
		
//		User userEmail=userImpl.findByUserEmail("raji143@gmail.com");
//		System.out.println("After fetching the data "+userEmail.toString());
		
		
		//userImpl.findUserById(3);
		//User userId= userImpl.findUserById(5);
		//System.out.println("Find user By id :"+userId.toString());
		
		
		userImpl.deleteUserById(4);
	
		
		System.out.println("Main method ended");
	}

}