class ElectronicDeviceTester{

public static void main(String a[]){

TubeLight tube = new TubeLight();
tube.price = 95;
tube.capacity = "10W";
tube.type = "LED";
tube.giveLight();

System.out.println("Tube Light Price :"+tube.price+"Rs"+"\n"+"Capacity :"+tube.capacity+"\n"+"Type :"+tube.type+"\n");

}
}