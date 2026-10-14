package com.stringn;

public class CodePointAt_Method {

	public static void main(String[] args) {
		String s="Sanjeev";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			//It will print the ASCII value of character
			System.out.println(ch+"-> ASCII Value :"+s.codePointAt(i));
		}

	}

}
