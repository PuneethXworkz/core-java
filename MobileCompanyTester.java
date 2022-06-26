class MobileCompanyTester{

public static void main(String a[]){

/*
String priceRange;
String modelNo;
String releaseDate;
String madeIn;
double price;
*/

PocoF poco = new PocoF();
poco.priceRange = "19999 - 39499";
poco.modelNo = "MIUI Global 12.0.3.stable";
poco.releaseDate = "21/9/2019";
poco.madeIn = "India";
poco.price = 23499.09875;


poco.toConnectPeople();
System.out.println("Price Range :"+poco.priceRange+"\n"+"Model No :"+poco.modelNo+"\n"+"Release Date :"+poco.releaseDate+"\n"+"Made In :"+poco.madeIn+"\n"+"Price :"+poco.price+"\n");

}

}