package com.in28minutes.oops;

public class MotorBike {
	//state
	private int speed; //member variable
	
	MotorBike() {
		this(5);
	}
	
	
	MotorBike(int speed) { //same name as the class (constructor)
		this.speed = speed;
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		  this.speed = speed;
	}
	
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}

}
