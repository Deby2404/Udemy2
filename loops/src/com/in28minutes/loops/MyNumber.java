package com.in28minutes.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		// 2 to number -1
		// how can check if a number is divisable by 2
		
		if (number < 2) {
			return false;
		}
		
		for (int i = 2; i <= number -1; i++) {
			if(number % i == 0)
				 return false;
		}
		
		
		return true;
	}

	public int sumUptoN() {
		//1+2+3...+number
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		//exept 1 and 6
		int sum = 0;
		for(int i = 2; i < number-1; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
			
		}
		return sum;
	}

}
