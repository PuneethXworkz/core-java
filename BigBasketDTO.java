class BigBasketDTO {
	public BigBasketDTO(){
		System.out.println("BigBasket() created ");
	}
	
	private String ownedBy;
	private String typeOfService;
	private String origin;
	private String ambassador;
	
	public String getOwnedBy(){
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy){
		this.ownedBy = ownedBy;
	}
	
	public String getTypeOfService(){
		return typeOfService;
	}
	public void setTypeOfService(String typeOfService){
		this.typeOfService = typeOfService;
	}
	
	public String getOrigin(){
		return origin;
	}
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	public String getAmbassador(){
		return ambassador;
	}
	public void setAmbassador(String ambassador){
		this.ambassador = ambassador;
	}

}