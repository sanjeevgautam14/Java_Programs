package com.AllTypeOfPrograms;

import java.util.Scanner;

public class Divide2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1=sc.nextDouble();
		System.out.println("Enter the 2nd number: ");
		double num2=sc.nextDouble();
		sc.close();
		double difference=num1/num2;
		System.out.println("The Division of "+num1+" / "+num2+" = "+difference);

	}

}
