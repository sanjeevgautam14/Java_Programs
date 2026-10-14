package com.logical.program;

		import java.util.ArrayList;
		import java.util.Arrays;

		public class RemoveZeros {
		    public static void main(String[] args) {
		        // Initialize the array and convert it to an ArrayList
		        Integer[] numArray = {2, 0, 4, 0, 5};
		        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numArray));

		        // Print the original ArrayList
		        System.out.println("Original ArrayList: " + numList);

		        // Remove all occurrences of 0
		        numList.removeIf(n -> n == 0);

		        // Print the modified ArrayList
		        System.out.println("ArrayList after removing 0s: " + numList);
		    }



	}
