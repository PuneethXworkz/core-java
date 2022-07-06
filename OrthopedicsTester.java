class OrthopedicsTester {
	
	
	public static void main(String args[]){
		
		Orthopedics ortho = new Orthopedics();
		
		ortho.setDoctor("Dr.Kiran");
		ortho.setType("Surgeon");
		ortho.setTimings("10AM to 1PM & 5PM to 8PM");
		ortho.setFees(550);
		
		System.out.println(ortho.getDoctor()+" "+ortho.getType()+" "+ortho.getTimings()+" "+ortho.getFees() );
	 }
}