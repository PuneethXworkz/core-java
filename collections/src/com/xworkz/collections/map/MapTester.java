package com.xworkz.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.xworkz.collections.comparable.PatientDTO;
import com.xworkz.collections.comparable.comparatorPatient.ContactNoComparator;
import com.xworkz.collections.comparable.comparatorPatient.GenderComparator;
import com.xworkz.collections.comparable.comparatorPatient.NameComparator;

public class MapTester {
	
	public static void main(String[] args) {
		
		//generics, meta data
	Map<Integer, PatientDTO> map = new ConcurrentHashMap<Integer, PatientDTO>();
		map.put(1,new PatientDTO(3,"mani", 874878798L,"male"));
		map.put(2,new PatientDTO(1,"Navi", 567898365L,"female")); 	//Directly creating object in add method.
		map.put(4,new PatientDTO(2,"Kali", 978756743L,"male"));
		map.put(5,new PatientDTO(6,"Zabi", 767664771L,"male"));
		map.put(3,new PatientDTO(8,"aabi", 766687644L,"female"));
	
		//fetching the value using key.
		//get method accept key to give out put of value
		System.out.println("fetch Map Value by key");
		//System.out.println(map.get(2));
		//System.out.println(map.get(3));//last null value will be printed
		
		//conversion of map to set & resolve the value based on for each using.
		Set setOfKeys = map.keySet();
		
		System.out.println("Fetch map Value by keyset");
		for (Object object : setOfKeys) {	
			map.putIfAbsent(5,new PatientDTO(10,"Maabi", 766687649L,"male"));//to add the data while fetching the data
			//
			System.out.println(map.get(object));
		}
		
		//another way to fetch both key and value pair		//Combination of key and value
		System.out.println("Fetch Map value by Entry Set");
		Set<Entry<Integer, PatientDTO>> entries = map.entrySet();
		for (Entry<Integer, PatientDTO> entry : entries) {
			
			System.out.println(entry.getValue());
			
			//can be this also
			//System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
	//use one technique called sorting technique,
	//sort is a method available in collection(Class), to sort the data.
		//value can be duplicates, but key should not be duplicates.
	
	}

}


/*
 How to convert set to map
 ConcurrentMap-
 */
