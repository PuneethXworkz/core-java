class  Factory{

String name;
int id;
String address;
String product;
int noOfEmployees;

public static void main(String kus[]){
	
	Factory fact = new Factory();
fact.name = "Precision Technolgies";
fact.id = 2223;
fact.address = "Peenya 3rd phase" ;
fact.product = "CNC Milling products";
fact.noOfEmployees = 18;
	System.out.println("Factory Name :"+fact.name);
	System.out.println("Factory ID :"+fact.id);
	System.out.println("Factory Address :"+fact.address);
	System.out.println("Factory Product :"+fact.product);
	System.out.println("No of Employees :"+fact.noOfEmployees + "\n" );

	Factory fact1 = new Factory();
fact1.name = "ThermoTech Technologies";
fact1.id = 3335;
fact1.address = "Peenya 2rd phase" ;
fact1.product = "Thermal Scanning Devices";
fact1.noOfEmployees = 62;
	System.out.println("Factory Name :"+fact1.name);
	System.out.println("Factory ID :"+fact1.id);
	System.out.println("Factory Address :"+fact1.address);
	System.out.println("Factory Product :"+fact1.product);
	System.out.println("No of Employees :"+fact1.noOfEmployees + "\n");
	
	Factory fact2 = new Factory();
fact2.name = "Hi-Tech CNC";
fact2.id = 9975;
fact2.address = "Peenya" ;
fact2.product = "CNC Turning products";
fact2.noOfEmployees = 6;
	System.out.println("Factory Name :"+fact2.name);
	System.out.println("Factory ID :"+fact2.id);
	System.out.println("Factory Address :"+fact2.address);
	System.out.println("Factory Product :"+fact2.product);
	System.out.println("No of Employees :"+fact2.noOfEmployees + "\n");

	Factory fact3 = new Factory();
fact3.name = "Ace Technologies";
fact3.id = 2221;
fact3.address = "Jalahalli" ;
fact3.product = "Product Designing";
fact3.noOfEmployees = 35;
	System.out.println("Factory Name :"+fact3.name);
	System.out.println("Factory ID :"+fact3.id);
	System.out.println("Factory Address :"+fact3.address);
	System.out.println("Factory Product :"+fact3.product);
	System.out.println("No of Employees :"+fact3.noOfEmployees + "\n");
	
	Factory fact4 = new Factory();
fact4.name = "A1 Precision";
fact4.id = 1126;
fact4.address = "Rajajinagar Indl Estate" ;
fact4.product = "Welding products";
fact4.noOfEmployees = 64;
	System.out.println("Factory Name :"+fact4.name);
	System.out.println("Factory ID :"+fact4.id);
	System.out.println("Factory Address :"+fact4.address);
	System.out.println("Factory Product :"+fact4.product);
	System.out.println("No of Employees :"+fact4.noOfEmployees + "\n");
	
	}

}