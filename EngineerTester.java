class EngineerTester{


public static void main(String a[]){
	
	Engineer engg = new Engineer();
engg.duration = "4Years";
engg.collegename = "BIT";
engg.university = "VTU";

engg.toSolveProblem();
System.out.println("Engineering College :"+engg.collegename+"\n"+"Engineering Course is for "+engg.duration+"\n");

MechEngineer mech = new MechEngineer();
mech.solvingMechanicalProblems();

CivilEngineer civil = new CivilEngineer();
civil.solvingCivilProblems();

EcEngineer ec = new EcEngineer();
ec.solveHardwareProblems();

AeroNauticalEngineer an = new AeroNauticalEngineer();
an.solveAirCratftProblems();

SoftwareEngineer soft = new SoftwareEngineer();
soft.solveSoftwareProblems();

AutoMobileEngineer auto = new AutoMobileEngineer();
auto.solveAutoMobileProblems();

ChemicalEngineer chem = new ChemicalEngineer();
chem.solveNanoTechProblems();

RoboticsEngineer robo = new RoboticsEngineer();
robo.solveRoboticProblems();
	
TeleCommunication tele = new TeleCommunication();
tele.solveTeleCommunicationProblem();
}

}