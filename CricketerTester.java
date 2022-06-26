class CricketerTester{

public static void main(String a[])	{
	
	Dhoni dhoni = new Dhoni();
dhoni.spouse = "Sakshi";
dhoni.represents = "Indian National team";
dhoni.roleInTeam = "Captain";
dhoni.hobbies = "Playing Football, Riding Bike";
dhoni.occupation = "Lieutenant Colonel In Indian Army";

dhoni.playingCricket();
System.out.println("Spouse :"+dhoni.spouse+"\n"+"Dhoni Represents :"+dhoni.represents+"\n"+"Role In Team :"+dhoni.roleInTeam+"\n"+"Hobbies :"+dhoni.hobbies+"\n"+"Occupation :"+dhoni.occupation);
	
	}
}