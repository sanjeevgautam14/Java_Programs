package com.AllTypeOfPrograms;

import java.util.Scanner;

public class CountEachCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count the occurance :");
		String str = sc.nextLine();
		sc.close();
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(str.indexOf(ch)==i) {
				int count =0;
				
				for(int j=0; j<str.length();j++) {
					
					if(str.charAt(j)==ch) {
						count++;
					}
					
				}
				System.out.println(ch + " = " + count);
			}
			
		}

	}

}
