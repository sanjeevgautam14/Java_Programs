package com.verify.password;

import java.util.Scanner;

public class VerifyPasswordStrength1 {
	static Scanner sc =new Scanner(System.in);
	static int lc=0;
	static int uc=0;
	static int dc=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pls enter the pwd");
		String s=sc.nextLine();
		if(s.length()>=6 && s.length()<=20) {
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch>='a' && ch<='z') {
					lc++;				
				}
				else if(ch>='A' && ch<='Z') {
					uc++;
					
				}
				else if(ch>='0' && ch<='9') {
					dc++;
				}
			}
			
		}
		else {
			System.out.println("invalid ip");
		}
		if(lc>=1 && uc>=1 && dc>=1) {
			System.out.println("it is strong pwd..");
		}
		else
		{
			System.out.println("not a strong pwd");
		}
	}

}
