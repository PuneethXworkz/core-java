package com.xworkz.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//class will be consider for jpa CRUD operations
@Table(name = "studentInfo")
//it will create tableNamee in data base

public class Student {

	@Id
	//below int id will be consider as primary key
	private int id;
	private String name;
	private int age;
	private String hometown;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", hometown=" + hometown + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
