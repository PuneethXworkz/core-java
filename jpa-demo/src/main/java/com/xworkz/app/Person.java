package com.xworkz.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//entity is(create dto/pojo class) used for jpa/hibernate crud operations
@Table(name = "personInfo")
//@Table used to define the table name and schema name.
public class Person {
	
	//@Id column for the primary key of the entity, note id should be integer or long.
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
}
