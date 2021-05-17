package com.qa.helloworld1;

// CTRL shift f 
// to auto format
public class Runner {

	// Member - attributes
	public static int result;
	public static String msg = "Hello World";

	public static void main(String[] args) {
		Results.passMark();
		FlowCharts.exerciseTwo(540);
		System.out.println(BlackJack.play(12, 10));
		System.out.println("unique sum " + UniqueSum.Input(1, 1, 2));
		
		System.out.println("Tax: " +  Tax.getTax(254));
		
		int[] arr;
		arr = new int[4];
		arr[0] = 1;
		int[] arr2 = {1,2,3};
		
		
	}
}
