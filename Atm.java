class Atm{

String branch;
int id;
String type;
String noOfMachines;
int noOfCameras;


public static void main (String fam[]){
	
	Atm atm = new Atm();
atm.branch = "Bellandur";
atm.id = 222;
atm.type = "Deposit/Withdraw";
atm.noOfMachines = "3/2";
atm.noOfCameras = 4;
	System.out.println("ATM Branch :"+atm.branch);
	System.out.println("ATM ID :"+atm.id);
	System.out.println("ATM Type :"+atm.type);
	System.out.println("No Of Machines :"+atm.noOfMachines);
	System.out.println("No of Camera's :"+atm.noOfCameras + "\n");

	Atm atm1 = new Atm();
atm1.branch = "Electronic City";
atm1.id = 333;
atm1.type = "Deposit";
atm1.noOfMachines = "3";
atm1.noOfCameras =0;
	System.out.println("ATM Branch :"+atm1.branch);
	System.out.println("ATM ID :"+atm1.id);
	System.out.println("ATM Type :"+atm1.type);
	System.out.println("No Of Machines :"+atm1.noOfMachines);
	System.out.println("No of Camera's :"+atm1.noOfCameras+ "\n");

	Atm atm2 = new Atm();
atm2.branch = "Mahadevpura";
atm2.id = 555;
atm2.type = "Withdraw";
atm2.noOfMachines = "4";
atm2.noOfCameras =3;
	System.out.println("ATM Branch :"+atm2.branch);
	System.out.println("ATM ID :"+atm2.id);
	System.out.println("ATM Type :"+atm2.type);
	System.out.println("No Of Machines :"+atm2.noOfMachines);
	System.out.println("No of Camera's :"+atm2.noOfCameras+ "\n");
	
Atm atm3 = new Atm();
atm3.branch = "Peenya";
atm3.id =666;
atm3.type = "Deposit/Withdraw";
atm3.noOfMachines = "3/1";
atm3.noOfCameras =2;
	System.out.println("ATM Branch :"+atm3.branch);
	System.out.println("ATM ID :"+atm3.id);
	System.out.println("ATM Type :"+atm3.type);
	System.out.println("No Of Machines :"+atm3.noOfMachines);
	System.out.println("No of Camera's :"+atm3.noOfCameras+ "\n");
	
Atm atm4 = new Atm();
atm4.branch = "Yeshwanthpur";
atm4.id = 999;
atm4.type = "Withdraw";
atm4.noOfMachines = "3";
atm4.noOfCameras =6;
	System.out.println("ATM Branch :"+atm4.branch);
	System.out.println("ATM ID :"+atm4.id);
	System.out.println("ATM Type :"+atm4.type);
	System.out.println("No Of Machines :"+atm4.noOfMachines);
	System.out.println("No of Camera's :"+atm4.noOfCameras+ "\n");
	
}

}