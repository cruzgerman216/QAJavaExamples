package com.qa.helloworld1;

public class Number {

	public static void main(String[] args) {
		System.out.println(add(81));
		
		System.out.println(IntegerToString(439));
	}

	public static int add(int num) {
		if (num >= 10 && num <= 99) {
			return (num / 10) + (num % 10);
		}
		return 0;
	}

	public static String IntegerToString(int num) {
		String str = "";
		if(getIntegerString(num) == "") {
			if(num <=99) {
				str += getIntegerString((num/10)*10) + "-";
				str += getIntegerString(num %10); 
			}else if(num >= 100 & num <= 999) {
				str += getIntegerString(num/100) + " hundred ";
				str += getIntegerString(((num/10) % 10) * 10) + "-";
				str += getIntegerString(num %10); 
			}

		}else {
			str = getIntegerString(num);
		}
		
		return str;
	}

	public static String getIntegerString(int num) {
		if (num == 0) {
			return "";
		} else if (num == 1) {
			return "one";
		} else if (num == 2) {
			return "two";
		} else if (num == 3) {
			return "three";
		} else if (num == 4) {
			return "four";
		} else if (num == 5) {
			return "five";
		} else if (num == 6) {
			return "six";
		} else if (num == 7) {
			return "seven";
		} else if (num == 8) {
			return "eight";
		} else if (num == 9) {
			return "nine";
		} else if (num == 10) {
			return "ten";
		} else if (num == 11) {
			return "eleven";
		} else if (num == 12) {
			return "twelve";
		} else if (num == 13) {
			return "Thirteen";
		} else if (num == 14) {
			return "fourteen";
		}else if(num == 15) {
			return "fifteen";
		}else if(num == 16) {
			return "sixteen";
		}else if(num == 17) {
			return "seventeen";
		}else if (num == 18) {
			return "eighteen";
		}else if(num == 19) {
			return "nineteen";
		}else if(num == 20) {
			return "twenty";
		}else if(num == 30) {
			return "thirty";
		}else if(num == 40) {
			return "forty";
		}else if(num == 50) {
			return "fifty";
		}else if(num == 60) {
			return "sixty";
		}else if(num == 70) {
			return "seventy";
		}else if(num == 80) {
			return "eighty";
		}else if(num == 90) {
			return "ninety";
		}
		return "";
	}
}
