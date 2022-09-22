package com.xworkz.helper;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
	
	public static Car  createCar(String carName) {
	
		if(carName=="MaruthiSwift") {
			return new MaruthiSwift();
		}
		else if (carName == "FordMustang") {
			return new FordMustang();
		}
		else if(carName == "Kia") {
			return new Kia();
		}
		else {
			return null;
		}
	
	}

}
