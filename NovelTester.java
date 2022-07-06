class NovelTester {
	public static void main(String args[]){
		
		Novel novel = new Novel();
		novel.setName("Manku Thimmana Kagga");
		novel.setYearOfRelease(1943);
		novel.setAuthor("DVG");
		novel.setNoOfCopies(4500);
		novel.setNoOfPages(191);
		
		System.out.println(novel.getName()+" "+novel.getYearOfRelease()+" "+novel.getAuthor()+" "+novel.getNoOfCopies()+" "+novel.getNoOfPages());
		
	}
	
}