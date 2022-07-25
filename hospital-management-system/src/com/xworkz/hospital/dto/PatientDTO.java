package com.xworkz.hospital.dto;
import com.xworkz.hospital.constant.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PatientDTO {
	
	private String name;
	private  int id;
	private long contactNo;
	private Gender gender;
	private String address;
	
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
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ", id=" + id + ", contactNo=" + contactNo + ", gender=" + gender
				+ ", address=" + address + "]";
	}	
	*/
	//go through packages shortcuts
}
