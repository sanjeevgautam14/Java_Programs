package com.allprograms;

import java.util.Scanner;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int n,count=0;
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter size of the array : ");
	     n=sc.nextInt();
	 
	    int[] arr = new int[n];
	 
	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<n; i++)
	      {
	       arr[i]=sc.nextInt();
	       }
	     for(int i=0; i<n; i++)
	    {
	        for(int j=i+1; j<n; j++)
	        {
	            if(arr[i] == arr[j])
	            {
	                count++;
	                break;
	            }
	        }
	    }
	 
	    System.out.println("\nTotal number of duplicate elements found in array = "+ count);
	 
	   }

}
