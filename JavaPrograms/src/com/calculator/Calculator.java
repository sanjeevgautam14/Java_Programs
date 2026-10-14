package com.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Perform Addition--------");
		System.out.println("Enter the value of 1st no :");
		int a = sc.nextInt();
		System.out.println("Enter the value of 2nd no :");
		int b = sc.nextInt();
		System.out.println("Addition of two no : "+a+ "+" +b+ " = "+(a+b));
		System.out.println();
		System.out.println("------Please compile again to perform another action-----");
	}
	
public static void sub() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Perform Substraction--------");
		System.out.println("Enter the value of 1st no :");
		int a = sc.nextInt();
		System.out.println("Enter the value of 2nd no :");
		int b = sc.nextInt();
		System.out.println("Substraction of two no : " +a+ "-" +b+ " = "+(a-b));
		System.out.println();
		System.out.println("------Please compile again to perform another action-----");
	}

public static void mul() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("-------Perform Multiplication--------");
	System.out.println("Enter the value of 1st no :");
	int a = sc.nextInt();
	System.out.println("Enter the value of 2nd no :");
	int b = sc.nextInt();
	System.out.println("Multiplication of two no : "+a+ "*" +b+ " = "+(a*b));
	System.out.println();
	System.out.println("------Please compile again to perform another action-----");
}

public static void div() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("-------Perform Division--------");
	System.out.println("Enter the value of 1st no :");
	float a = sc.nextFloat();
	System.out.println("Enter the value of 2nd no :");
	float b = sc.nextFloat();
	System.out.println("Division of two no : "+a+ "/" +b+ " = "+(a/b));
	System.out.println();
	System.out.println("------Please compile again to perform another action-----");
}


	public static void main(String[] args) {
		
		Scanner scMain = new Scanner(System.in);
		System.out.println("Enter the input value for Addition=1, Substraction=2, Multiplication=3, Division=4 : ");
		int number = scMain.nextInt();
		
		if(number==1) {
			add();
		}
		else if(number==2) {
			sub();
			
		}
		else if(number==3) {
			mul();
		}
		else if(number==4) {
			div();
		}
		
		else {
			System.out.println("Invalid Input---- Please compile and enter the value again for Addition=1, Substraction=2, Multiplication=3, Division=4");
		}

	}

}
