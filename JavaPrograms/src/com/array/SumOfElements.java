package com.array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Create size of an array
		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		//Create an array
		int[] a=new int[size];
		//create a variable to store the updated value
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element on "+i+" index");
			a[i]=sc.nextInt();	
		}
		for (int i = 0; i < a.length; i++) {
			//System.out.println("Print index value: "+a[i]);
			sum=a[i]+sum;
			
		}
		System.out.println(sum);

	}

}
