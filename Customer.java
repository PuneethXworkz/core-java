class Customer {
	
	//Customer has many orders
	OrderDTO dtos[];
	
	//instance variable
	int index;
	
	public Customer(int size){
		System.out.println("Customer() created ");
		dtos = new OrderDTO[size];
	}
	
	public boolean orderPlaced(OrderDTO dto){
		System.out.println("orderToBePlaced() invoked");
		boolean order = false;		
		if(dto!=null){
			this.dtos[index++]=dto;
			order = true;
			System.out.println("Order details found");
		}
		else{
			System.out.println("Order details not matching");
		}
		
	return order;
	}
	
	public void getOrderDetails(){
		System.out.println("getOrderDetails() invoked ");
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i].getOrderName()+" "+ dtos[i].getId()+" "+dtos[i].getPrice()+" "+
			dtos[i].getOrderDate()+" "+dtos[i].getDeliveryDate()+" " );
		}
	}
}