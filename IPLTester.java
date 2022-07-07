class IPLTester {
	
	public static void main(String args[]){
		
		IPLDTO cricket = new IPLDTO();
		cricket.setName("Indian Premier League");
		cricket.setFormat("T20's");
		cricket.setOrigin("India");
		cricket.setNoOfTeams(10);
		cricket.setFirstSeason("2012");
		
	System.out.println(cricket.getName() +" "+cricket.getFormat()+" "+cricket.getOrigin()+" "+cricket.getNoOfTeams()+" "+cricket.getFirstSeason() );
		
	}
	
	
}