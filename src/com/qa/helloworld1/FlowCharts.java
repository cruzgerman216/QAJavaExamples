package com.qa.helloworld1;

public class FlowCharts {
	public static void main(String[] args) {
		myFloatchartIterator(100);
		TenTimesEach();
	}
	
	public static void myFloatchartIterator(int A) {
		while(A < 200) {
			System.out.println("print" + A);
			A++;
		}
	}
	
	public static void myFloatchartIterator2(int A) {
		while(A <= 200) {
			if(A%2 == 0) {
				System.out.println("-");
			}else {
				System.out.println("*");
			}
			A++;
		}
	}
	
	public static void TenTimesEach() {
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.println(i);
			}
		}
	}
	public static int myMethod(int num1, int num2, boolean flag) {
		if(flag) {
			return num1 + num2;
		}else {
			return num1 * num2;
		}
	}
	
	public static void exerciseTwo(int A) {
		if (A > 2000) {
			System.out.println("A");
			if(A > 6000) {
				System.out.println("C");
				
			}else {
				System.out.println("B");
				if(A > 4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
			}
		}else {
			System.out.println("1");
			if(A > 100) {
				System.out.println("3");
				if(A > 600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if(A > 500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			}else {
				System.out.println("2");
			}
		}
	}
}
