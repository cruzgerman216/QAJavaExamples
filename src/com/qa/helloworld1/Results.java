package com.qa.helloworld1;

public class Results {
	static int physics, chemistry, biology, total, percentage;

	public static void main(String[] args) {
		physics = 67;
		chemistry = 75;
		biology = 74;
		total = physics + chemistry + biology;
		printResults(physics, chemistry, biology, total);
		System.out.println("Percentage: %" + findPercentage(total));
	}

	public static void printResults(int physics, int chemistry, int biology, int total) {
		System.out.println("physics marks: " + physics);
		System.out.println("chemistry marks: " + chemistry);
		System.out.println("biology marks: " + biology);
		System.out.println("total marks: " + total);
	}

	public static double findPercentage(double total) {
		return (total / 450) * 100;
	}

}
