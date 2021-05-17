package com.qa.helloworld1;

public class BlackJack {
	
	public static int play(int num1, int num2) {
		if(num1 > 0 || num2 > 0) {
			int total = num1 + num2;
			if(total > 21) {
				return 0;
			}else {
				return total;
			}
		}else {
			return 0;
		}
	}
}
