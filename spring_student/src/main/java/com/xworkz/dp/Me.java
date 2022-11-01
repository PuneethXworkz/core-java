package com.xworkz.dp;

import java.util.List;

import lombok.Data;

@Data
public class Me {
	
	
	public Me() {
		System.out.println("Me constructor created");		
	}
	//setter injection
	private int id;
	private String name;
	private Job j;
	private List<Ids> listOfIds;

}
