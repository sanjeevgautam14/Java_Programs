package com.AllTypeOfPrograms;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2=sc.nextInt();
		sc.close();
		int sum=num1+num2;
		System.out.println("The sum of "+num1+" + "+num2+" = "+sum);
	}

}
