package com.interview;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		 String arr1[] = {"red", "blue", "green"};
	        String arr2[] = {"green", "yellow", "violet"};

	        // Use a Set to automatically handle duplicates
	        Set<String> uniqueColors = new LinkedHashSet<>();

	        // Add elements from both arrays
	        Collections.addAll(uniqueColors, arr1);
	        Collections.addAll(uniqueColors, arr2);

	        // Print the result
	        System.out.println("Unique colors:");
	        for (String color : uniqueColors) {
	            System.out.println(color);
	        }
		
				}
				
				
}
		
		



