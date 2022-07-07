class NewsPaperTester {
	
	public static void main(String args[]){
		
		NewsPaperDTO news = new NewsPaperDTO();
		news.setName("Vijay Karnataka");
		news.setType("Daily");
		news.setNoOfSheets(12);
		news.setOwner("Vijay Lankeshwar");
		news.setPrice(4);
		
		System.out.println(news.getName()+" "+news.getType()+" "+news.getNoOfSheets()+" "+news.getOwner()+" "+news.getPrice() );
		
	}
	
} 