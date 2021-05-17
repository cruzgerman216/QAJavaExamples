package com.qa.helloworld1;

public class Tax {
	
	public static double getPercentage(double salary) {
		if(salary >= 0 & salary <= 14999) {
			return 0;
		}else if(salary >= 15000 & salary <= 19999) {
			return .10;
		}else if(salary >= 20000 & salary <= 29999) {
			return .15;
		}else if(salary >= 30000 & salary <= 44999) {
			return .20;
		}else if(salary >= 4500) {
			return .25;
		}
		return 0;
	}
	
	public static double getTax(double salary) {
		
		return salary - (salary * getPercentage(salary)) ;
	}
}
