package com.xworkz.relationship.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String code;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State> listOfState;	//List coz country has many states
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<State> getListOfState() {
		return listOfState;
	}
	public void setListOfState(List<State> listOfState) {
		this.listOfState = listOfState;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + ", code=" + code + ", listOfState=" + listOfState + "]";
	}
	
	

}