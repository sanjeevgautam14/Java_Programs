package com.logical.program;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCD";
		String finalStr="";
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
//		for(int i=0;i<=str.length();i++) {
//			char ch=str.charAt(i);
//			finalStr=ch+finalStr;
//		}
//		System.out.println(finalStr);
}

}
