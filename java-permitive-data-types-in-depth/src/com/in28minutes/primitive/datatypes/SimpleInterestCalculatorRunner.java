package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = 
				new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue =
				calculator.calcilateTotalValue(5);//5years
		//6187.50000
		System.out.println(totalValue);

	}

}
