package com.stringn;

public class ReverseString {

	public static void main(String[] args) {
		String str="Sanjeev";
		String nstr="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Original String : "+str);
		System.out.println("After reverse : "+nstr);
	}

}
