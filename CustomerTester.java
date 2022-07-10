import java.util.Scanner;

class CustomerTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No of Orders :");
		int size = sc.nextInt();
		
		Customer cus = new Customer(size);
		
			for(int i=0;i<size;i++){
		System.out.print("Enter Order Name :");
		String orderName = sc.next();
		System.out.print("Enter id :");
		int id = sc.nextInt();
		System.out.print("Enter Price :");
		int price = sc.nextInt();
		System.out.print("Enter Order Date :");
		String orderDate = sc.next();
		System.out.print("Enter Delivery Date :");
		String deliveryDate = sc.next();
					
		OrderDTO dto = new OrderDTO();
		dto.setOrderName(orderName);
		dto.setId(id);
		dto.setPrice(price);
		dto.setOrderDate(orderDate);
		dto.setDeliveryDate(deliveryDate);
		
		cus.orderPlaced(dto);
		
		}
		cus.getOrderDetails();
	}
	
}