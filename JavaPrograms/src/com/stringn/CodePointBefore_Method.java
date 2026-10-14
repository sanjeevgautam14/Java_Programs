package com.stringn;

public class CodePointBefore_Method {

	public static void main(String[] args) {
		String s="Sanjeev";
			//It will print the ASCII value of given (index)-1 character
			System.out.println(s.codePointBefore(2));
			//Typecast to char : It will print the character instead of ASCII value
			System.out.println((char)s.codePointBefore(2));

	}
}
