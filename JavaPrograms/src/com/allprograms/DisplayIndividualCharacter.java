package com.allprograms;

import java.util.Scanner;

public class DisplayIndividualCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.nextLine();
		for (int i = 0; i < value.length(); i++) {
			System.out.println(value.charAt(i));
			
		}

	}

}
