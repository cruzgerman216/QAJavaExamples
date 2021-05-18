package com.qa.helloworld1;

// CTRL shift f 
// to auto format
public class Runner {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[4];
		arr[3] = 1;

		int[] arr2 = { 3, 2, 4, 5, 6, 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 10;
			System.out.println(arr[i]);
		}

		String[] strArray = { "test", "testing 2", "another test" };
		for (String str : strArray) {
			System.out.println(str);
		}

		int[] arrlist;
		arrlist = new int[20];
		for (int i = 0; i < arrlist.length; i++) {
			arrlist[i] = i;
		}
		for(int num: arrlist) {
			if(getFlag(num)) {
				System.out.println(num * num * num);
			}else {
				System.out.println(num * num);
			}
		}
	}
	
	public static boolean getFlag(int num) {
		boolean flag = false;
		if(num % 2 == 0) {
			flag = true;
		}
		return flag;
	}
}
