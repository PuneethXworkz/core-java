class TvChannelsDTO {
	
	public TvChannelsDTO(){
		System.out.println("TvChannels() created ");
	}
	
	private String name;
	private String ownedBy;
	private double price;
	private int subChannels;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getOwnedBy(){
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy){
		this.ownedBy = ownedBy;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
	this.price = price;	
	}
	public int getSubChannels(){
		return subChannels;
	}
	public void setSubChannels(int subChannels){
		this.subChannels = subChannels;
	}
}