class MusicPlayerTester {
	
	public static void main(String args[]){
		
		MusicPlayer music = new MusicPlayer();
		music.setBrand("Boat");
		music.setPrice(4999.99);
		music.setConnectionType("Bluetooth/USB");
		music.setChargingType("USB");
		music.setBluetoothRange("2mts");
		
		System.out.println(music.getBrand()+" "+music.getPrice()+" "+ music.getConnectionType()+" "+music.getChargingType()+" "+music.getBluetoothRange() );
	}
	
}