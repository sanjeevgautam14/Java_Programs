package com.allprograms;

import java.util.Scanner;

public class ReadStringValueAndDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.nextLine();
		System.out.println("Display String Value: "+value);
	}

}
