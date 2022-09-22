package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Day3 {
	
	public static void main(String[] args) {
		
	/*	url to connect to mysql database
		jdbc---> main protocol
		mysql---> sub protocol
		://localhost --->System name
	(if we are connecting remote system then in place of //localhost we need to give 
			ip address of a remote system)
		 3306 --->mysql port number.		 
		  */
		 
		String url="jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "Xworkzodc@123";		//Mysql Password.
		
		//jdbc Step 1: Load a driver and register driver
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2:	Create a connection	
			//Connection is an interface(present in java.sql)
			//DriverManger is a factory class or helper class
			//getConnection overloaded method(is Factory method) which creates a FactoryType Object
			//--factory method() is used to create a object of particular factoryType Object
			/*
			 we have 3 overloaded method.
			 1.getConnection(String fullurl );
			 2.getConnection(String url, String userName, String password);
			 3.getConnection(String url,Property props);
			 */
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println(con.getClass().getSimpleName());
			
			//Step 3: Create statement.
			//statement should be imported from java.sql package
			/*statement is an interfaceis used to create a platform to communicate with a database using sql query 
			 */
					
			Statement st = con.createStatement();
			
			//Step 4: Execute a statement
			/*
			execute just executes the sql query
			execute only dml query
			*/
			st.execute("insert into Xworkz1.employee values(101,'Raju',9988766)");
			
			//step 5 : close a connection | closing should be finally block			
			con.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}

/*
 Assignment-(24/08/2022)
 1. create a Helper()(CreateCar()) method to create a Object of a class called I20(method drive(),running(),stop()) class.
 
 2. Same Create Car method should create another type of car object.
 
 example for java helper method/factory method
 
 Design Pattern is  solution for commonly re-occurring problems in software design.

 Solu: for creating 1 object to share among many users
 
 CReate singleton Class 
 
 Singleton, thread safe, early loading, 
 
 
 Assignment 25-8-2022.
 Write a jdbc program to insert company information(companyId, companyName, Address,contactNo)- this si with statement Object
 
  */
