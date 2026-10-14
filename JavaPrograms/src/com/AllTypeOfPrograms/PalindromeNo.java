package com.AllTypeOfPrograms;

import java.util.Scanner;

// PalindromeNo : reverse the number and check if it is equal to the original number or not eg :121=121

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int originalNum=num;
		int reverseNum=0;
		
		while(num>0) {
			int lastDigit=num%10;
			reverseNum=reverseNum*10+lastDigit;
			num=num/10;
		}
		if(originalNum==reverseNum) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}

	}

}
