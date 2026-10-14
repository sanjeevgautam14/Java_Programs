package com.object;

public class ConstructorCall {
	
static int a=10;
int b=20;

public  static void m1() {
	System.out.println(a);
}
public void m2() {
	
	System.out.println(b);
}

	public static void main(String[] args) {
		ConstructorCall call = new ConstructorCall();
		m1();
		call.m2();

	}

}
