package com.adam.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="address_table")
public class Address {
	@Id
	@GenericGenerator(name="ref" , strategy = "increment")
	@GeneratedValue(generator =  "ref")
	@Column(name="address_id")// to give user defined column name
	private int addressId;
	@Column(name="area_name")
	private String area;
	@Column(name="city_name")
	private String city;
	 
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", area=" + area + ", city=" + city + "]";
	}
	
	
	
}
