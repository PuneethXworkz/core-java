class SoftwareCompanyTester{

public static void main(String a[]){
	
	Infosys infy = new Infosys();
infy.founder = "Mr.Narayana Murthy";
infy.headQuarters = "Bangalore";
infy.noOfBranches = 50;
infy.noOfEmployees =276320 ;
infy.type = "Service Based IT Sector";

infy.toSupportClients();
System.out.println("Infosys Founder : "+infy.founder+"\n"+"Head Quarters : "+infy.headQuarters+"\n"+"No of Branches : "+infy.noOfBranches+"\n"+"No of Employees : "+infy.noOfEmployees+"\n"+"Type : "+infy.type);	
}

}