package com.xworkz.games.dto;

public class GamesDTO {

	public GamesDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private String ownedBy;
	private String availableIn;
	private String canBePlayedBY;
	private String type;
	
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
	public String getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}
	public String getAvailableIn() {
		return availableIn;
	}
	public void setAvailableIn(String availableIn) {
		this.availableIn = availableIn;
	}
	public String getCanBePlayedBY() {
		return canBePlayedBY;
	}
	public void setCanBePlayedBY(String canBePlayedBY) {
		this.canBePlayedBY = canBePlayedBY;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "GamesDTO [id=" + id + ", name=" + name + ", ownedBy=" + ownedBy + ", availableIn=" + availableIn
				+ ", canBePlayedBY=" + canBePlayedBY + ", type=" + type + "]";
	}
	
	
	

	
	
}
