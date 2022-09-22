package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collegeDetails")
public class College {

	@Id
	private int c_id;
	private String c_Name;
	private String c_address ;
	private String c_Type;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
	public String getC_Type() {
		return c_Type;
	}
	public void setC_Type(String c_Type) {
		this.c_Type = c_Type;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_Name=" + c_Name + ", c_address=" + c_address + ", c_Type=" + c_Type + "]";
	}

	
	
}
