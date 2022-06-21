class Institutes{
	
String name;
int id;
String owner;
String location;
String type;

public Institutes(String name, int id, String owner, String location, String type){
	this.name = name;
	this.id = id;
	this.owner = owner;
	this.location = location;
	this.type = type;
	}
public static void main(String a[]){
	
Institutes inst = new Institutes("Alvas",1129,"Maharaj Alva","Mudubidre","CO-Head");
System.out.println("1st Institute :"+inst.name+"\n"+"Id :"+inst.id+"\n"+"Owner :"+inst.owner+"\n"+"Location :"+inst.location+"\n"+"Type :"+inst.type+"\n");

Institutes inst1 = new Institutes("BIT",9842,"Gowda","Bengaluru","CO-Head");
System.out.println("2nd Institute :"+inst1.name+"\n"+"Id :"+inst1.id+"\n"+"Owner :"+inst1.owner+"\n"+"Location :"+inst1.location+"\n"+"Type :"+inst1.type+"\n");

Institutes inst2 = new Institutes("Sapthagiri",4432,"Girija Group","hesaraghatta","Boys");
System.out.println("3rd Institute :"+inst2.name+"\n"+"Id :"+inst2.id+"\n"+"Owner :"+inst2.owner+"\n"+"Location :"+inst2.location+"\n"+"Type :"+inst2.type+"\n");
	
Institutes inst3 = new Institutes("Reva",3384,"Revanna","Kengeri","Girls");
System.out.println("1st Institute :"+inst3.name+"\n"+"Id :"+inst3.id+"\n"+"Owner :"+inst3.owner+"\n"+"Location :"+inst3.location+"\n"+"Type :"+inst3.type+"\n");
		
}

}