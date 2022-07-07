class TvChannelsTester {
	
	public static void main(String args[]){
		
		TvChannelsDTO tv = new TvChannelsDTO();
		tv.setName("Suvarna");
		tv.setOwnedBy("Asianet");
		tv.setPrice(30.00);
		tv.setSubChannels(17);
		
		System.out.println(tv.getName()+" "+tv.getOwnedBy() +" "+tv.getPrice() +" "+ tv.getSubChannels() );
	}
	
}