package com.AllTypeOfPrograms;

import java.util.Scanner;

public class CheckEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println(num+" is an Even number");
		}
		else {
			System.out.println(num+" is an Odd number");
		}

	}

}
