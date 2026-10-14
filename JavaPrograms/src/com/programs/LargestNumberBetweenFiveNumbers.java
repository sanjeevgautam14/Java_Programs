package com.programs;

public class LargestNumberBetweenFiveNumbers {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int c =30;
		int d =40;
		int e =50;
		int result = (((a>b)&&(a>c)&&(a>d)&&(a>e))?a:((b>c)&&(b>d)&&(b>e))?b:((c>d)&&(c>e)?c:((d>e)?d:e)));
		System.out.println(result);

	}

}
