import java.util.Scanner;

class AirportTester {
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter No of Terminals to be added : ");
	int size = sc.nextInt();
	
	Airport air = new Airport(size);
	
	for(int i=0; i<size;i++){
		
		System.out.print("Enter Name  : ");
		String name =sc.next();
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		System.out.print("Enter Type : ");
		String type = sc.next();
		System.out.print("Enter No of Gates : ");
		int noOfGates = sc.nextInt();
	
	TerminalsDTO dto = new TerminalsDTO();
	dto.setName(name);
	dto.setId(id);
	dto.setType(type);
	dto.setNoOfGates(noOfGates);
	
	air.createTerminals(dto);
	}
	air.getTerminalDetails();
}

}