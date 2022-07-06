class Stadium {

public Stadium (){
	System.out.println("Stadium object created");
}

private String name;
private int noOfSeats;
private String location;
private String type;
private String owner;

public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}

public int getNoOfSeats(){
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats){
	this.noOfSeats = noOfSeats;
}
public String getLocation(){
	return location;
}
public void setLocation(String location){
	this.location = location; 
}

public String getType(){
	return type;
}
public void setType(String type){
	this.type = type;
}

public String getOwner(){
	return owner;
}
public void setOwner(String owner){
	this.owner = owner;
}


}