package com.qa.helloworld1;

public class Results {
	static double physics = 59,
	chemistry = 43, 
	biology = 150;
	static double total = physics + chemistry + biology;
	static double percentage = (total / 450) * 100;
	
	public static void main(String[] args) {
		physics = 67;
		chemistry = 75;
		biology = 74;
		total = physics + chemistry + biology;
		printResults(physics, chemistry, biology, total);
		System.out.println("Percentage: %" + findPercentage());
	}

	public static void printResults(double physics, double chemistry, double biology, double total) {
		System.out.println("physics marks: " + physics);
		System.out.println("chemistry marks: " + chemistry);
		System.out.println("biology marks: " + biology);
		System.out.println("total marks: " + total);
	}

	public static double findPercentage() {
		return percentage; 
	}
	
	public static void passMark() {
		int subjectsFailed = 0;
		if(physics < 60) {
			subjectsFailed++;
		}
		if(chemistry < 60) {
			subjectsFailed++;
		}
		if(biology < 60) {
			subjectsFailed++;
		}
		if(percentage > 60) {

			if(physics < 60 || chemistry < 60 || biology < 60) {
				System.out.println("Because you failed one or more exams, you failed " + subjectsFailed + " subjects");
			}else {
				System.out.println("You passed!"  + percentage + "%");
			}
		}else {
			System.out.println("Unfortunately, you did not pass: " + percentage + "%"+ ", you failed " + subjectsFailed + " subjects");
		}
	}

}
