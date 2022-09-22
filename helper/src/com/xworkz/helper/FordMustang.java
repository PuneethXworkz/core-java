package com.xworkz.helper;

public class FordMustang implements Car{
	
	@Override
	public void drive() {
		System.out.println("Mustang is 4-Wheel Drive mechanized"+" "+this.getClass().getSimpleName());		
	}
	
	@Override
	public void running() {
		System.out.println("Mustang Engine wil Run Smoothly"+" "+this.getClass().getSimpleName());
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping from 80kmph to 0kmph it takes 3.5secs in Mustang"+" "+this.getClass().getSimpleName());
	}

}
