package com.xworkz.airport.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class TerminalsDTO {

	/*public TerminalsDTO() {
		// TODO Auto-generated constructor stub
	}*/
	
	private String name;
	private int id;
	private String type;
	private int noOfGates;
	
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfGates() {
		return noOfGates;
	}
	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	
	@Override
	public String toString() {
		return "TerminalDTO [name=" + name + ", id=" + id + ", type=" + type + ", noOfGates=" + noOfGates + "]";
	}*/
		
}
