package com.AllTypeOfPrograms;

import java.util.Scanner;

public class Subtract2Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2=sc.nextInt();
		sc.close();
		int difference=num1-num2;
		System.out.println("The subtraction of "+num1+" - "+num2+" = "+difference);

	}

}
