package com.logical.program;

public class RemoveSpaceFromString {
	static String str="S a n j e e v";
	static String str1="sanju";
	static String res="";

	public static void main(String[] args) {
		
		System.out.println("String Length : "+(str1.lastIndexOf('u')+1));
		
		for (int i = 0; i <str.length(); i++) {
			char c= str.charAt(i);
			
			if(c!=' ') {
				res=res+c;
			}
			
		}
		System.out.println("Old word : "+str);
		System.out.println("Updated word : "+res);

	}

}
