package com.xworkz.collections.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class PatientDTO implements Comparable<PatientDTO> {	//as comparable is interface in java

	//Comparable is used to sort the data in list,
	private int patientId;
	private String name;
	private long contactNo;
	private String gender;
	
	@Override
	public int compareTo(PatientDTO o) { 	//parameter must be of implementation class
	
		return this.patientId - o.patientId;
	}
	
	
}


/*
 Comparable is used to sort oly default values only i.e id
 */
 