package com.xworkz;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "college")
@Data
public class CollegeDTO {

	@Id
	@GeneratedValue
	private int c_id;
	private String c_name;
	private String c_address;
	@OneToMany(cascade = CascadeType.ALL)
	private List<StudentDTO> listOfStudent;
	
	
}
