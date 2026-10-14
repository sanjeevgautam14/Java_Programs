package com.test.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromAnArray {

	public static void main(String[] args) {
		int[] originalArray = {4, 5, 6, 4, 2, 5, 7, 8, 2};
		
		// Step 1: Convert array to set to remove duplicates
		Set<Integer> set=new LinkedHashSet<>();
		for(int num:originalArray) {
			set.add(num);
		}
		// Step 2: Convert set back to array
		int[] resultArray=new int[set.size()];
		int i=0;
		for(int num:set) {
			resultArray[i++] = num;
		}
		
		// Print the result
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
		

	}

}
