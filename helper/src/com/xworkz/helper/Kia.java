package com.xworkz.helper;

public  class Kia implements Car{
	
	@Override
	public void drive() {
		System.out.println("Kia is 2Wheel Drive mechanized "+this.getClass().getSimpleName());		
	}
	
	@Override
	public void running() {
		System.out.println("Kia Engine wil Run Smoothly "+" "+this.getClass().getSimpleName());
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping from 80kmph to 0kmph it takes 4secs in Kia "+ " "+this.getClass().getSimpleName());
		
	}	
}
