class LifeInsuranceTester{


public static void main(String a[]){

LIC lic =  new LIC();

lic.ageLimit = "0-90yrs";
lic.types = "Accidental deaths are covered";
lic.isTransferAllowed = "No";
lic.isNomineeAllowed = "Yes";

lic.toGetInsured();

System.out.println("Age Limit :"+lic.ageLimit+" "+"Types Covered :"+lic.types+" "+"Transferable :"+lic.isTransferAllowed+" "+"Nominee allowed :"+lic.isNomineeAllowed+"\n" );

/*
String ageLimit;
String deathCover;
String types;
String isTransferAllowed;
*/

}

}