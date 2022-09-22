package com.xworkz.collections.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class TerminalsDTO implements Comparable<TerminalsDTO> {
	
	private int terminalId;
	private String name;
	private int noOfGates;
	private String securityLevel;
	private String type;
	

	@Override
	public int compareTo(TerminalsDTO o) {
		// TODO Auto-generated method stub
		//return this.terminalId - o.terminalId;
	
		
		return this.noOfGates - o.noOfGates;	//sort by noOfGates
	}

}
