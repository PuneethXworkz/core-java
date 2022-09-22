package com.xworkz.helper;

public class MaruthiSwift implements Car {

	@Override
	public void drive() {
		System.out.println("Maruthi Swift is 2Wheel Drive mechanized"+" "+this.getClass().getSimpleName());		
	}
	
	@Override
	public void running() {
		System.out.println("Maruthi Swift Engine wil Run Smoothly"+" "+this.getClass().getSimpleName());
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping from 80kmph to 0kmph it takes 6secs in Maruthi"+" "+this.getClass().getSimpleName());
	}
}
