package com.stringn;

public class CompareWithEqualOperatorAndMethod {

	public static void main(String[] args) {
		String s1="AB";
		String s2="AB";
		String s3="ab";
		// (==) compare the reference address
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		// (equals method) compare the states/content
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		// (out method) compare the states/content
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

	}

}
