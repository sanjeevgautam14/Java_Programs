package com.AllTypeOfPrograms;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number :");
		int c = sc.nextInt();
		
		int largest=a;
		if(b>largest) largest=b;
		if(c>largest) largest=c;
		System.out.println("Largest number : "+largest);
		
		/*
		 * if(a>b) { System.out.println("Largest Number : "+a); }else if(b>c){
		 * System.out.println("Largest Number : "+b); }else {
		 * System.out.println("Largest Number : "+c); }
		 */
	}

}
