package com.test.practice;

import java.util.HashSet;

public class TotalCountOfOccurance {

	public static void main(String[] args) {
		String str="AABBBC";
		int totalCount=str.length();
		
		 HashSet<Character> counted = new HashSet<>();
		 
		for(int i=0;i<totalCount;i++) {
			char ch=str.charAt(i);
			
			if (!counted.contains(ch)) {
				
		int repeatedCharCount=str.replace(""+ch, "").length();
		int count=totalCount-repeatedCharCount;
		
		System.out.println("Number of occurance for :"+ch+" is " +count);
		
		counted.add(ch);
		
			}
		
		}
		

	}

}
