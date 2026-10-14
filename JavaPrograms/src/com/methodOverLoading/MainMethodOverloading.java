package com.methodOverLoading;

public class MainMethodOverloading {
	
	public static void main(String a) {
		System.out.println(a);
		
	}
	
public static void main(String b, String c) {
	System.out.println(b+"  "+c);
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method execution started");
		main("1st main");
		main("2nd main","3rd main");

	}

}
