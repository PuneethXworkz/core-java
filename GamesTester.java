class GamesTester {
	
	public static void main(String args[]){

		Games games = new Games();
		games.setName("PubG");
		games.setOwnedBy("Krafton Technologies");
		games.setIsAvailableIn("PlayStore & Official WebSite");
		games.setCanBePlayedBy("18+ age");
		games.setType("Free Battle Royale Shooter game");
		
		System.out.println(games.getName()+" "+games.getOwnedBy()+" "+games.getIsAvailableIn()+" "+games.getCanBePlayedBy()+" "+games.getType() );
		
	}
}