package com.xworkz.collections.comparable.comparatorPatient;

import java.util.Comparator;

import com.xworkz.collections.comparable.PatientDTO;

public class NameComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		return o1.getName().compareTo(o2.getName());
		
		//This compareTo of String class.
		
		//customized sorting technique can be done using comparator
	}

}
