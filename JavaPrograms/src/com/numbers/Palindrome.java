package com.numbers;

//A palindrome is a word, number, or string that reads the same forward and backward.
//Ex: madam ✅, level ✅, 121 ✅, 1331 ✅

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }

	}

}
