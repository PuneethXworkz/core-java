class Garden{

String name;
int id;
String location;
String timings;	
	
public Garden(String name, int id, String location, String timings){
	this.name = name;
	this.id = id;
	this.location = location;
	this.timings = timings;
	}	
public static void main(String a[]){
		
	Garden gar = new Garden("Monkey Park",2022,"Basaveshwara","6AM-8PM");
System.out.println("Garden Name :"+gar.name+"\n"+"Id :"+gar.id+"\n"+"Location :"+gar.location+"\n"+"Garden Timings :"+gar.timings+"\n");

	Garden gar1 = new Garden("Kasturi",1983,"Kalyan Nagar","7AM-6PM");
System.out.println("Garden Name :"+gar1.name+"\n"+"Id :"+gar1.id+"\n"+"Location :"+gar1.location+"\n"+"Garden Timings :"+gar1.timings+"\n");

	Garden gar2 = new Garden("JP Park",2016,"Mathikere","5.30AM-9PM");
System.out.println("Garden Name :"+gar2.name+"\n"+"Id :"+gar2.id+"\n"+"Location :"+gar2.location+"\n"+"Garden Timings :"+gar2.timings+"\n");
	
	Garden gar3 = new Garden("Lalbagh",1922,"V.V.Puram","5.30AM-7PM");
System.out.println("Garden Name :"+gar3.name+"\n"+"Id :"+gar3.id+"\n"+"Location :"+gar3.location+"\n"+"Garden Timings :"+gar3.timings+"\n");
	
	}
}