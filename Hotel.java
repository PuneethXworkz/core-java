class Hotel {
	
	//Hotel has many FoodItemsDTO(Arrays) to pick single item.
	FoodItemsDTO dtos[];
	
	//instance variable
	int index;
	
	public Hotel(int size){
		System.out.println("Hotel () created");
		dtos = new FoodItemsDTO[size];
	}
	
	public boolean addingFoodItems(FoodItemsDTO dto){
		System.out.println("addingFoodItems() created");
		boolean isAdded = false;		
		if(dtos!=null && dto.getName()!= null ){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Food Items Added succesfully");
		}
		else{
			System.out.println("Food Items not found");
		}
		return isAdded;
	}
	
	public void getFoodItems(){
		System.out.println("Food Items to be ordered are :");
		
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i].getName()+" "+dtos[i].getId()+" "+dtos[i].getPrice()+" "+dtos[i].getType() );
		}
	}
	
}