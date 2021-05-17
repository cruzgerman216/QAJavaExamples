package com.qa.helloworld1;

public class Calculataor {

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}

	public static double division(double num1, double num2) {
		if(num1 < num2) {
			return num1 / num2;
		}
		System.out.println("The division cannot be perform");
		return 0;
		
	}
}
