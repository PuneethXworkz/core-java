class IPLDTO {
	
	public IPLDTO(){
		System.out.println("IPL () created");
	}
	
	private String name;
	private String format;
	private String origin;
	private int noOfTeams;
	private String firstSeason;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getFormat(){
		return format;
	}
	public void setFormat(String format){
		this.format = format;
	}
	public String getOrigin(){
		return origin;
	}
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	public int getNoOfTeams(){
		return noOfTeams;
	}
	public void setNoOfTeams(int noOfTeams){
		this.noOfTeams = noOfTeams;
	}
	
	public String getFirstSeason(){
		return firstSeason;
	}
	public void setFirstSeason(String firstSeason){
		this.firstSeason = firstSeason;
	}
}