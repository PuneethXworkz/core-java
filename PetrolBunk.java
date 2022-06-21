class PetrolBunk{

String name;
int id;
int noOfBranches;
String location;
String gstNo;

public PetrolBunk(String name,int id,int noOfBranches,String location,String gstNo){
	this.name = name;
	this.id = id;
	this.noOfBranches = noOfBranches;
	this.location = location;
	this.gstNo = gstNo;
	}
public static void main(String a[]){
	
PetrolBunk petrol = new PetrolBunk("DeveGowda Petrol Bunk",1228,12,"Banashankari 3rd stage","GST95DXZWT");
System.out.println("1st Bunk Name :"+petrol.name+"\n"+"Bunk Id :"+petrol.id+"\n"+"No of branches :"+petrol.noOfBranches+"\n"+"Location :"+ petrol.location+"\n"+"GST No :"+petrol.gstNo+"\n");

PetrolBunk petrol1 = new PetrolBunk("Udayagiri Petrol Bunk",2286,1,"Peenya indstl estate","GST99UDSIJ");
System.out.println("2nd Bunk Name :"+petrol1.name+"\n"+"Bunk Id :"+petrol1.id+"\n"+"No of branches :"+petrol1.noOfBranches+"\n"+"Location :"+ petrol1.location+"\n"+"GST No :"+petrol1.gstNo+"\n");

PetrolBunk petrol2 = new PetrolBunk("HP Bunk",8733,30,"Rajajinagar","GST90HPXD");
System.out.println("3rd Bunk Name :"+petrol2.name+"\n"+"Bunk Id :"+petrol2.id+"\n"+"No of branches :"+petrol2.noOfBranches+"\n"+"Location :"+ petrol2.location+"\n"+"GST No :"+petrol2.gstNo+"\n");
	
PetrolBunk petrol3 = new PetrolBunk("Essar",2635,18,"Mahalakshmi Layout","GST05EXZWT");
System.out.println("4th Bunk Name :"+petrol3.name+"\n"+"Bunk Id :"+petrol3.id+"\n"+"No of branches :"+petrol3.noOfBranches+"\n"+"Location :"+ petrol3.location+"\n"+"GST No :"+petrol3.gstNo+"\n");

}

}