package com.array;

import java.util.Scanner;

public class Search {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls enter the size of an array:");
		int size=sc.nextInt();
		
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Pls enter the value: "+i+" index");
			a[i]=sc.nextInt();
		}
		boolean res=false;
		System.out.println("Sir can pls enter the searching element: ");
		int key=sc.nextInt();
	
	
		for(int i=0;i<a.length;i++) {			
			if(a[i]==key) {
				
				res=true;
			}	
	}
		if(res) {
			System.out.println(res);
			return;
		}
		else
		{
			System.out.println(res);
			System.out.println("one more chance: ");
			System.out.println("pls enter key: ");
			int key1=sc.nextInt();
			for(int i=0;i<a.length;i++) {			
				if(a[i]==key1) {
					
					res=true;
					
					}
			}
		}
		System.out.println(res);
	}
}
