package com.methodOverLoading;

public class MethodType {

	public static void m1(int a) {
		System.out.println(a);
		
	}
	public static void m1(int a, byte b) {
		System.out.println(a+b);
		
	}
	public static void m1(int a, float b, String c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		m1(2);
		m1(2,(byte)3);
		m1(2,3.3f," Hello");	}

}

