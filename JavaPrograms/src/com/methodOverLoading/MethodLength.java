package com.methodOverLoading;

public class MethodLength {
	
	public static void m1(int a) {
		System.out.println(a);
		
	}
	public static void m1(int a, int b) {
		System.out.println(a+b);
		
	}
	public static void m1(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		m1(2);
		m1(2,3);
		m1(2,3,4);
	}

}
