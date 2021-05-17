package com.qa.helloworld1;

public class FizzBuzz {

	public static void getFizzBuzz(int num) {
		if(num % 3 == 0 & num % 5 == 0) {
			System.out.println("Fizz Buzz");
		}else if(num % 3 == 0) {
			System.out.println("Fizz");
		}else if(num % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(num);
		}
	}
}
