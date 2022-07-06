class Orthopedics {
	
	public Orthopedics (){
		System.out.println("Orthopedics() created");
	}
	
	private String doctor;
	private String type;
	private String timings;
	private int fees;
	
	public String getDoctor(){
		return doctor;
	}
	public void setDoctor(String doctor){
		this.doctor = doctor;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public String getTimings(){
		return timings;
	}
	public void setTimings(String timings){
		this.timings = timings;
	}
	
	public int getFees(){
		return fees;
	}
	public void setFees(int fees){
		this.fees = fees;
	}
}