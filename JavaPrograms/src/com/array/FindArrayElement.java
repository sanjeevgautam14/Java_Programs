package com.array;

import java.util.Scanner;

public class FindArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		int[] arr= new int[size];
		//add the element of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element on "+i+" index");
			arr[i]=sc.nextInt();
		}
		
			System.out.println("Verify the element---Please enter the no :");
			int n=sc.nextInt();
			boolean res=false;
			for(int i=0;i<arr.length;i++) {
				res =true;
			}
			
				System.out.println(res);
			
		}
		
}
