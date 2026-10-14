package com.methodOverLoading;

public class MethodOrder {
	public static void m1(byte b, int a) {
		System.out.println(b+a);
		
	}
	public static void m1(int a, byte b) {
		System.out.println("2nd m1 : "+(a+b));
		System.out.println("b : "+b);
	}

	public static void main(String[] args) {
		m1((byte)1,2);
		m1(3,(byte)2);

	}

}
