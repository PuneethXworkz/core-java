class InstituteTester{

public static void main (String a[]){

Xworkz course = new Xworkz();
	course.founder = "Omkar";
	course.noOfEmployees = 25;
	course.location = "BTM Layout, Rajajinagar";
	course.typeOfInstitute = "Java Development Centre";

	course.toTrain();

System.out.println(course.founder+" "+course.noOfEmployees+" "+course.location+" "+course.typeOfInstitute);
	
	/*
	String founder;
int noOfEmployees;
String location;
String typeOfInstitute;
	
	*/
	
}

}