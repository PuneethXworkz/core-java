class NovelDTO{
	public NovelDTO(){
	System.out.println("Novel() created");
}
	
	private String name;
	private int yearOfRealease;
	private String author;
	private int noOfCopies;
	private int noOfPages;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getYearOfRelease(){
		return yearOfRealease;
	}
	public void setYearOfRelease(int yearOfRealease){
		this.yearOfRealease = yearOfRealease;
	}
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	
	public int getNoOfCopies(){
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	public int getNoOfPages(){
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages){
		this.noOfPages = noOfPages;
	}
	
}