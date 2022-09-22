package com.xworkz.collections.comparable.comparatorPatient;

import java.util.Comparator;

import com.xworkz.collections.comparable.PatientDTO;

public class ContactNoComparator implements Comparator<PatientDTO>{

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		
		return (int) (o1.getContactNo()- (int)o2.getContactNo());
	}
	
	/*
	Compare the values using ContactNo
	*/

}
