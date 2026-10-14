package com.test.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrences {

	public static void main(String[] args) {
		// Step 1: Define the string
		String str="ABBCCCDDDDEEEEE";
   
           // Step 2: Initialize the map to store character counts
            Map<Character, Integer> charCountMap = new HashMap<>();
            
            // Step 3: Iterate through the string
            for (char ch : str.toCharArray()) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
            
            // Step 4: Display the character counts
            System.out.println("Character occurrences:");
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

	}
