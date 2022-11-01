package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="college_table")
@Data
public class CollegeDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_Id;
	private String c_Name;
	private String c_Address;
	private int c_NoOfFaculties;
}
