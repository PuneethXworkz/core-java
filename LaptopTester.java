class LaptopTester{

public static void main(String a[]){

Lenovo lap = new Lenovo();
lap.price = 25999.0d;
lap.ram ="6Gb";
lap.os = "Windows 10";
lap.color = "Black" ;
lap.playingGames();

System.out.println("Laptop Price :"+lap.price+"\n"+"Ram size :"+lap.ram+"\n"+"Operating System :"+lap.os+"\n"+"Laptop color :"+lap.color+"\n");



}

}