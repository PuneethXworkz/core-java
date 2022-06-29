class BankTester {


public static void main(String a[]){
	
	
	Bank axis = new AxisBank();
	axis.rateOfInterest(5.0);
	
	Bank baroda = new BankOfBaroda();
	baroda.rateOfInterest(5.0);
	
	Bank canara = new Canara();
	canara.rateOfInterest(5.0);
	
	Bank dbs = new DBS();
	dbs.rateOfInterest(5.0);
	
	Bank equitas = new Equitas();
	equitas.rateOfInterest(5.0);
	
	Bank fed = new Federal();
	fed.rateOfInterest(5.0);
	
	Bank gram = new Gramin();
	gram.rateOfInterest(5.0);
	
	Bank hdfc = new Hdfc();
	hdfc.rateOfInterest(5.0);
	
	Bank idfc = new Idfc();
	idfc.rateOfInterest(5.0);
	
	Bank jan = new JanDhan();
	jan.rateOfInterest(5.0);
	

}


}