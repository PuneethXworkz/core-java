class Hospital{

String name;
int id;
String location;
int noOfDoctors;
int noOfSurgeons;
String type;

public static void main(String a[]){
	
System.out.println("Hospital's which are affordable ");

	Hospital hos = new Hospital();
hos.name = "Ananya Hospital";
hos.id = 98857;
hos.location = "Navarang";
hos.noOfDoctors = 12;
hos.noOfSurgeons = 3;
hos.type = "Multi Speciality";
	System.out.println("1st Hospital Name :"+hos.name);
	System.out.println("Hospital ID :"+hos.id);
	System.out.println("Hospital Location :"+hos.location);
	System.out.println("No of Doctors :"+hos.noOfDoctors);
	System.out.println("No of Surgeon's :"+hos.noOfSurgeons);	
	System.out.println("Hospital Type :"+hos.type+ "\n");

	Hospital hos1 = new Hospital();
hos1.name = "Kanva Sri Sai";
hos1.id = 19652;
hos1.location = "Rajiv Gandhi Nagar";
hos1.noOfDoctors = 6;
hos1.noOfSurgeons = 2;
hos1.type = "Multi Speciality";
	System.out.println("2nd Hospital Name :"+hos1.name);
	System.out.println("Hospital ID :"+hos1.id);
	System.out.println("Hospital Location :"+hos1.location);
	System.out.println("No of Doctors :"+hos1.noOfDoctors);
	System.out.println("No of Surgeon's :"+hos1.noOfSurgeons);	
	System.out.println("Hospital Type :"+hos1.type+ "\n");
	
	Hospital hos2 = new Hospital();
hos2.name = "Srinivasa Nursing home";
hos2.id = 86691;
hos2.location = "Peenya 3rd Phase";
hos2.noOfDoctors = 4;
hos2.noOfSurgeons = 1;
hos2.type = "Emergency Care";
	System.out.println("3rd Hospital Name :"+hos2.name);
	System.out.println("Hospital ID :"+hos2.id);
	System.out.println("Hospital Location :"+hos2.location);
	System.out.println("No of Doctors :"+hos2.noOfDoctors);
	System.out.println("No of Surgeon's :"+hos2.noOfSurgeons);	
	System.out.println("Hospital Type :"+hos2.type+ "\n");
	
	Hospital hos3 = new Hospital();
hos3.name = "Chord Road Hospital";
hos3.id = 67753;
hos3.location = "West of Chord Road";
hos3.noOfDoctors = 18;
hos3.noOfSurgeons = 7;
hos3.type = "Super Speciality";
	System.out.println("4th Hospital Name :"+hos3.name);
	System.out.println("Hospital ID :"+hos3.id);
	System.out.println("Hospital Location :"+hos3.location);
	System.out.println("No of Doctors :"+hos3.noOfDoctors);
	System.out.println("No of Surgeon's :"+hos3.noOfSurgeons);	
	System.out.println("Hospital Type :"+hos3.type+ "\n");

	Hospital hos4 = new Hospital();
hos4.name = "Brinda Hospital";
hos4.id = 56679;
hos4.location = "Nagarbhavi";
hos4.noOfDoctors = 8;
hos4.noOfSurgeons = 5;
hos4.type = "Multi Speciality Hospital";
	System.out.println("5th Hospital Name :"+hos4.name);
	System.out.println("Hospital ID :"+hos4.id);
	System.out.println("Hospital Location :"+hos4.location);
	System.out.println("No of Doctors :"+hos4.noOfDoctors);
	System.out.println("No of Surgeon's :"+hos4.noOfSurgeons);	
	System.out.println("Hospital Type :"+hos4.type+ "\n");
	
}

}