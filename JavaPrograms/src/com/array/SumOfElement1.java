package com.array;

public class SumOfElement1 {

	public static void main(String[] args) {
	 int sum=0;
     int arr[]= {-1,-2,3,2,-5,10,3};
     
     for (int i = 0; i < arr.length; i++) {
    	 //System.out.println(arr[i]);
    	 
    	 if(arr[i]<0) {
    		 sum=-1*arr[i]+sum;
    	 }else {
    		 sum=sum+arr[i];
    	 }
     }
     System.out.println("Addition of all index value : "+sum);
	}

}
