package com.xworkz.ipl.dto;

public class IplDTO {

	public IplDTO() {

		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private String format;
	private int noOfTeams;
	private String firstSeason;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getNoOfTeams() {
		return noOfTeams;
	}
	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}
	public String getFirstSeason() {
		return firstSeason;
	}
	public void setFirstSeason(String firstSeason) {
		this.firstSeason = firstSeason;
	}
	
	@Override
	public String toString() {
		return "IplDTO [id=" + id + ", name=" + name + ", format=" + format + ", noOfTeams=" + noOfTeams
				+ ", firstSeason=" + firstSeason + "]";
	}
	
	

	
}
