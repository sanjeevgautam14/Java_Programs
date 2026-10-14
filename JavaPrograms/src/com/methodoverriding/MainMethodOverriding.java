package com.methodoverriding;

public class MainMethodOverriding {
	

	public static void main(String[] args) {
		System.out.println("Parent method");

	}

}

class Child extends MainMethodOverriding{
	
	public static void main(String[] args) {
		System.out.println("Child method");

	}
	
	
}