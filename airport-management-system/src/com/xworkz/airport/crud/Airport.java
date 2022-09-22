package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalsDTO;

public interface Airport {

	public boolean createTerminals(TerminalsDTO dto);
	public void getTerminalDetails();
	public boolean updateTypeById(int id,String type);
	public boolean updateTypeByName(String name, String type);
	public boolean updateNameById(String name, int id);
	public TerminalsDTO getTerminalDetailsById(int id);
	public boolean deleteTerminalsById(int id);
	public boolean deleteTerminalsByName(String name);
}