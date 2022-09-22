package com.xworkz.collections.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.collections.comparable.comparatorPatient.ContactNoComparator;
import com.xworkz.collections.comparable.comparatorPatient.GenderComparator;
import com.xworkz.collections.comparable.comparatorPatient.NameComparator;

public class ComparableTesterPatientDTO {
	
	public static void main(String[] args) {
		

	List list = new ArrayList();
	list.add(new PatientDTO(3,"mani", 874878798L,"male"));
	list.add(new PatientDTO(1,"Navi", 567898365L,"female")); 		//Directly creating object in add method.
	list.add(new PatientDTO(2,"Kali", 978756743L,"male"));
	list.add(new PatientDTO(6,"Zabi", 767664771L,"male"));
	list.add(new PatientDTO(8,"aabi", 766687644L,"female"));
	
	//use one technique called sorting technique,
	//sort is a method available in collection(Class), to sort the data.
	
	//sorting based on id.
	System.out.println("Sorting by Id");
	Collections.sort(list);
	list.forEach(System.out::println);
	
	//sorting based on name.
	System.out.println("Sorting by Name");
	Collections.sort(list, new NameComparator());
	list.forEach(System.out::println);
	
	System.out.println("Sorting by ContactNo");
	Collections.sort(list, new ContactNoComparator());
	list.forEach(System.out::println);
	
	System.out.println("Sorting by gender");
	Collections.sort(list, new GenderComparator());
	
	/*	we can do the new object in this way aswell
	 
	 	
	 PatientDTO dto = new PatientDTO(3,"mani", 8745678254L);
 	 PatientDTO dto = new PatientDTO(1,"Navi",5678909876L);
  	 PatientDTO dto = new PatientDTO(2,"Kali", 987653457L);
	 	 
	 
	List list = new ArrayList();
	list.add(dto);
	list.add(dto1);
	list.add(dto2);
	
		Collections.sort(list);
	
	list.forEach(System.out::println);
	
	5 DTO's Structure must be same.
	to sort the  number using subtraction
	
		*/	
	}

}
