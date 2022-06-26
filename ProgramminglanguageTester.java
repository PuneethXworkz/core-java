class ProgramminglanguageTester{

public static void main(String a[]){
	
	Java java = new Java();
	java.developedBy = "James Gosling & Team";
	java.ownedBy = "Oracle";
	java.developedYear = 1993;
	java.latestRelease = "Java SE18";
	
java.toDevelopApplications();

System.out.println("Java Was Developed by :"+java.developedBy+"\n"+"Owned By :"+java.ownedBy+"\n"+"Developed year :"+java.developedYear+"\n"+"Latest Release :"+java.latestRelease+"\n");
	
	
}

}