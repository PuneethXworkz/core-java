package com.xworkz.collections.comparable.comparatorPatient;

import java.util.Comparator;

import com.xworkz.collections.comparable.PatientDTO;

public class GenderComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {

		return o1.getGender().compareTo(o2.getGender());
	}

}
