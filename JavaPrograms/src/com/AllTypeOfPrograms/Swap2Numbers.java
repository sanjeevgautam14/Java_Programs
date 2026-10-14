package com.AllTypeOfPrograms;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int b = sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap a = "+a+ ", b ="+b);
		
	}

}
