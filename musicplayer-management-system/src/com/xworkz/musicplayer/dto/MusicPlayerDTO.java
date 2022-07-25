package com.xworkz.musicplayer.dto;

public class MusicPlayerDTO {

	public MusicPlayerDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private double price;
	private String chargingType;
	private String bluetoothRange;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getChargingType() {
		return chargingType;
	}
	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}
	public String getBluetoothRange() {
		return bluetoothRange;
	}
	public void setBluetoothRange(String bluetoothRange) {
		this.bluetoothRange = bluetoothRange;
	}
	
	@Override
	public String toString() {
		return "MusicPlayerDTO [id=" + id + ", name=" + name + ", price=" + price + ", chargingType=" + chargingType
				+ ", bluetoothRange=" + bluetoothRange + "]";
	}	
}
