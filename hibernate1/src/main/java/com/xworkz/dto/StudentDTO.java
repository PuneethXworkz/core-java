package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student_table")
@Data
public class StudentDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_Id;
	private String s_Name;	
	@ManyToOne
	private CollegeDTO s_College;
	private int s_Age;
	private String s_Address;

}
