package com.verify.password;

import java.util.Scanner;

public class VerifyPasswordStrength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String s=sc.nextLine();
		char ch;
		boolean upperCase=false;
		boolean lowerCase=false;
		boolean digit= false;
		if(s.length()>=6 && s.length()>=20) {
			for(int i=0;i<s.length();i++) {
				ch=s.charAt(i);
				
				if(Character.isUpperCase(ch)){
					upperCase=true;	
				}
				if(Character.isLowerCase(ch)){
					lowerCase=true;	
				}
				if(Character.isDigit(ch))
					digit=true;
			}
			if(upperCase && lowerCase && digit) {
				System.out.println("Strong Password");
				System.out.println("Length "+s.length());
				
			}else {
				System.out.println("Not a strong Password");
			}
			
		}else {
			System.out.println("Invalid input--- Pease enter min 6 and max 20 char");
		}
			

	}

}
