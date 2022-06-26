class ChipManufacturingCompanyTester{

public static void main(String a[]){
	
TSM tsm = new TSM();
	
	tsm.founder = "Morris Chang";
	tsm.founded = "21st Feb 1987";
	tsm.headQuarters = "Hsinchu Taiwan";
	tsm.noOfEmployees = 65_152;
	tsm.ceo = "C.C.Wei";
	
	tsm.toManufactureChip();
	System.out.println("Founder :"+tsm.founder+"\n"+"Founded :"+tsm.founded+"\n"+"Head Quarters :"+tsm.headQuarters+"\n"+"No of Employees :"+tsm.noOfEmployees+"\n"+"Ceo :"+tsm.ceo+"\n");
}

}