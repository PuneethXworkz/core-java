package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student")
@Data
public class StudentDTO {
	
	@Id
	@GeneratedValue
	private int s_id;
	private String s_name;
	private String s_address;
		
	

}
