package com.qa.helloworld1;

public class UniqueSum {
	public static int Input(int num1, int num2, int num3) {
		int total = 0;
		if(num1 != num2 && num1 != num3) {
			total += num1;
		}
		if(num2 != num3 && num2 != num1) {
			total += num2;
		}
		if(num3 != num2 && num3 != num1) {
			total += num3;
		}
		return total;
	}
}
