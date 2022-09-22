package dao.hospital_employee;

public class HospitalDTO {
	
	private int patientId;
	private String name;
	private String address;
	private String contactNo;
	private String referredBy;
	private String consulting;
	private String roomNo;
	private String alternateContact;
	private String hospitalName;
	private String hospitalAddress;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	public String getConsulting() {
		return consulting;
	}
	public void setConsulting(String consulting) {
		this.consulting = consulting;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getAlternateContact() {
		return alternateContact;
	}
	public void setAlternateContact(String alternateContact) {
		this.alternateContact = alternateContact;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	//dto-dtat transfer object
	//pojo-plain old java object
	//vo- value object
	/*
	 serializable
	 Json object-Java Script notation
	 
	 */
	@Override
	public String toString() {
		return "HospitalDto [patientId=" + patientId + ", name=" + name + ", address=" + address + ", contactNo="
				+ contactNo + ", referredBy=" + referredBy + ", consulting=" + consulting + ", roomNo=" + roomNo
				+ ", alternateContact=" + alternateContact + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + "]";	
}

	
	
}
