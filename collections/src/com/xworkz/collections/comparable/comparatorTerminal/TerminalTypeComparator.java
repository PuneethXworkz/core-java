package com.xworkz.collections.comparable.comparatorTerminal;

import java.util.Comparator;

import com.xworkz.collections.comparable.TerminalsDTO;

public class TerminalTypeComparator implements Comparator<TerminalsDTO> {

	@Override
	public int compare(TerminalsDTO o1, TerminalsDTO o2) {
		return o1.getType().compareTo(o2.getType());
	}

}
