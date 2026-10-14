package com.stringn;

public class StringWithByteData {

	public static void main(String[] args) {
		byte[] b= {65,66,67,68};
		String s=new String(b);
		//Here array value act as ASCII value of character
		System.out.println(s);
		System.out.println(s.toString());

	}

}
