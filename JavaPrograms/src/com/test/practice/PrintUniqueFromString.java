package com.test.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintUniqueFromString {

	public static void main(String[] args) {
		String text = "abc123xyz456abc123def789";

        // Use regex to find numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        // Use a Set to store unique numbers
        Set<String> uniqueNumbers = new HashSet<>();

        while (matcher.find()) {
            uniqueNumbers.add(matcher.group());

	}
        System.out.println("Unique numbers:");
        for (String number : uniqueNumbers) {
            System.out.println(number);

}
	}
}
