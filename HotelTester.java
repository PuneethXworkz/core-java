import java.util.Scanner;

class HotelTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Foods :");
		int size = sc.nextInt();
		
		Hotel hot = new Hotel(size);
		
		for(int i=0; i<size;i++){
		
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter id :");		
		int id = sc.nextInt();
		System.out.print("Enter Price :");
		int price = sc.nextInt();
		System.out.print("Enter type :");
		String type = sc.next();
		
		FoodItemsDTO dto = new FoodItemsDTO();
		dto.setName(name);
		dto.setId(id);
		dto.setPrice(price);
		dto.setType(type);
		
		hot.addingFoodItems(dto);
		}
	
		hot.getFoodItems();
	}
	
}