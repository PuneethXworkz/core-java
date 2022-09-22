package com.xworkz.user.dto;

import java.util.Date;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user")

@NamedQueries(value = { @NamedQuery(name="findByEmail",query="select u from User u where u.email =:email"), 
						@NamedQuery(name="findById",  query="select i from User i where i.id=:id")
						//@NamedQuery(name="updateById",query="update d from User d set age =:age where i.id=:id"),
						//@NamedQuery(name="deleteById",query="delete e from User e where e.id=:id")

})
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL", unique=true, nullable=false,length=100)
	private String email;
	@Column(name="AGE")
	private int age;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "DOB")
	private Date  dateOfBirth;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", password=" + password
				+ ", datOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	
}