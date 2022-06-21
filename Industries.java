class Industries{

String name;
int id;
String location;
String type;

public Industries(String name, int id,String location, String type){
	this.name = name;
	this.id = id;
	this.location = location;
	this.type = type;	
}
public static void main(String a[]){
	
	Industries ind = new Industries("Morgan",9928,"Kaka Palya","Large Scale");
System.out.println("1st Industry :"+ind.name+"\n"+"ID :"+ind.id+"\n"+"Location :"+ind.location+"\n"+"Industry Type :"+ind.type+"\n");

	Industries ind1 = new Industries("Vinumac",1630,"JoValli","Medium Scale");
System.out.println("1st Industry :"+ind1.name+"\n"+"ID :"+ind1.id+"\n"+"Location :"+ind1.location+"\n"+"Industry Type :"+ind1.type+"\n");

	Industries ind2 = new Industries("SunRise",3091,"kalas Palya","Start Up");
System.out.println("1st Industry :"+ind2.name+"\n"+"ID :"+ind2.id+"\n"+"Location :"+ind2.location+"\n"+"Industry Type :"+ind2.type+"\n");

	Industries ind3 = new Industries("Bubbaq",3299,"Bubas Nagar ","Small Scale");
System.out.println("4th Industry :"+ind3.name+"\n"+"ID :"+ind3.id+"\n"+"Location :"+ind3.location+"\n"+"Industry Type :"+ind3.type+"\n");

}



}