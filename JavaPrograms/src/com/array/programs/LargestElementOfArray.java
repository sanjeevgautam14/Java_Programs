package com.array.programs;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int[] arr= {2,4,5,11,15,12};
		int max=arr[0]; //suppose first element is max
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i]; 
			}
		}
		System.out.println("max : "+max);
		
		
	}

}
