class HistoricalPlaces{

String name;
int id;
String location;
int entryFee;
String isPetsAllowed;

public HistoricalPlaces(String name, int id, String location, int entryFee, String isPetsAllowed){
	this.name = name;
	this.id = id;
	this.location = location;
	this.entryFee = entryFee;
	this.isPetsAllowed = isPetsAllowed;
}
public static void main(String a[]){
	
HistoricalPlaces hist = new HistoricalPlaces("Mysore Palace",1111,"Mysore",100,"No");
System.out.println("1st HistoricalPlace :"+hist.name+"\n"+"Id :"+hist.id+"\n"+"Location :"+hist.location+"\n"+"Entry Fee :"+hist.entryFee+"\n"+"Is Pet Allowed :"+hist.isPetsAllowed+"\n");

HistoricalPlaces hist1 = new HistoricalPlaces("Bangalore Fort",2222,"Bengaluru",150,"No");
System.out.println("2nd HistoricalPlace :"+hist1.name+"\n"+"Id :"+hist1.id+"\n"+"Location :"+hist1.location+"\n"+"Entry Fee :"+hist1.entryFee+"\n"+"Is Pet Allowed :"+hist1.isPetsAllowed+"\n");

HistoricalPlaces hist2 = new HistoricalPlaces("Chitra Durga Fort",4543,"Chitra Durga",120,"yes");
System.out.println("3rd HistoricalPlace :"+hist2.name+"\n"+"Id :"+hist2.id+"\n"+"Location :"+hist2.location+"\n"+"Entry Fee :"+hist2.entryFee+"\n"+"Is Pet Allowed :"+hist2.isPetsAllowed+"\n");

HistoricalPlaces hist3 = new HistoricalPlaces("Keladi",7716,"Keladi Sagara",0,"yes");
System.out.println("4th HistoricalPlace :"+hist3.name+"\n"+"Id :"+hist3.id+"\n"+"Location :"+hist3.location+"\n"+"Entry Fee :"+hist3.entryFee+"\n"+"Is Pet Allowed :"+hist3.isPetsAllowed+"\n");

	
}



}