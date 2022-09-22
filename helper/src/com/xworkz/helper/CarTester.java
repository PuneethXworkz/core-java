package com.xworkz.helper;

public class CarTester {

	public static void main(String[] args) {

		
		//CarFactory cf = new CarFactory();
		
		Car kia = CarFactory.createCar("Kia");
		kia.drive();
		kia.running();
		kia.stop();
		
		Car maruthi = CarFactory.createCar("MaruthiSwift");
		maruthi.drive();
		maruthi.running();
		maruthi.stop();
		
		Car ford = CarFactory.createCar("FordMustang");
		ford.drive();
		ford.running();
		ford.stop();
	}

}
