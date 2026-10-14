package com.AllTypeOfPrograms;

public class FindDuplicatesCharInArray {

	public static void main(String[] args) {
		String str = "sanjeev";
		char arr[]= str.toCharArray();
		//char arr[] = { 's', 'a', 'n', 'j', 'e', 'e', 'v};
		System.out.println("Duplicate characters:");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			
			// Check whether character was already counted 
			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			//Count duplicate characters
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + " = " + count + " times");
			}
		}
	}
}