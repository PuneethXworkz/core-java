class OrderDTO {
	
	public OrderDTO(){
		System.out.println("OrderDTO() created");
	}
	
	private String orderName;
	private int id;
	private int price;
	private String orderDate;
	private String deliveryDate;
	
	public String getOrderName(){
		return orderName;
	}
	public void setOrderName(String orderName){
		this.orderName = orderName;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getOrderDate(){
		return orderDate;
	}
	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}
	public String getDeliveryDate(){
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate){
		this.deliveryDate = deliveryDate;
	}
	
}