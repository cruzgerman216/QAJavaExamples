package com.qa.helloworld1;

// CTRL shift f 
// to auto format
public class Runner {

	// Member - attributes
	public static int result;
	public static String msg = "Hello World";

	public static void main(String[] args) {
		// variables
		// strings
		// char, booleans, int, short, long, float, double, byte
		String myStr = "test";
		int myInt = 1232;
		char myChar = 'a';
		short myShort = 1;
		long myLong = 232342344;
		float myFloat = 2.3f;
		double myDouble = 0.4433;
		byte myByte = 120;

		System.out.println(myStr);
		System.out.println(myInt);
		System.out.println(myChar);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myByte);

		welcomeMsg("test");
		System.out.println(msg);

		int num1 = 5;
		int num2 = 7;
		System.out.println(add(num1, num2));

		// Operators
		// + - addition
		// - - subtraction
		// * - multiplication
		// / - divide
		// % - modulus

		result = (3 / 3) - 1 + add(5, 6);
		result = 3 / (3 + 8) - 2 * 4;
		System.out.println(result);
	}

	public static void welcomeMsg(String msg) {
		System.out.println(msg);
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
