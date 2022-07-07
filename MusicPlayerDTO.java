class MusicPlayerDTO {
	
	public MusicPlayerDTO(){
		System.out.println("MusicPlayer() created");
	}
	
	private String brand;
	private double price;
	private String connectionType;
	private String chargingType;
	private String bluetoothrange;
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getConnectionType(){
		return connectionType;
	}
	public void setConnectionType(String connectionType){
		this.connectionType = connectionType;
	}
	
	public String getChargingType(){
		return chargingType;
	}
	public void setChargingType(String chargingType){
		this.chargingType = chargingType;
	}
	
	public String getBluetoothRange(){
		return bluetoothrange;
	}
	public void setBluetoothRange(String bluetoothrange){
		this.bluetoothrange = bluetoothrange;
	}
}