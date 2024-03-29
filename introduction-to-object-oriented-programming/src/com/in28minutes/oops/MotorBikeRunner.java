package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());
		
		ducati.start(); //Bike Started
		honda.start(); //Bike Started
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(20);
		honda.decreaseSpeed(40);
		
		int ducatiSpeed = ducati.getSpeed();//get ducati speed
		ducatiSpeed = ducatiSpeed + 100;//increase it by 100
		ducati.setSpeed(ducatiSpeed);//set it to ducati
		
		int hondaSpeed = honda.getSpeed();//get honda speed
		hondaSpeed = hondaSpeed + 100;//increase it by 100
		honda.setSpeed(hondaSpeed);//set it to honda
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
