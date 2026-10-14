package com.stringn;

public class CompareTo_Method {

	public static void main(String[] args) {
		String s1 = "AB"; // ASCII value of A = 65
		String s2 = "AB"; // ASCII value of A = 65
		// First Character ASCII value and other char increase by +1
		//AB=65+1, ABC=65+1+1, ABCD=65+1+1+1
//s1= AB (65+1) =66, s2= AB (65+1) =66, s1>s2 s1-s2 (66-66) = 0	
		System.out.println(s1.compareTo(s2));

		String s3 = "A"; // ASCII value of A = 65
		String s4 = "C"; // ASCII value of A = 67
//s3= A=65, s2=C=67, s1>s2 s1-s2 (65-67) = -2	
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));

		String s5 = "D"; // ASCII value of A = 68
		String s6 = "A"; // ASCII value of A = 65
//s5= D=68, s6=A=65, s1>s2 s1-s2 (68-65) = 3	
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareToIgnoreCase(s6));

	}

}
