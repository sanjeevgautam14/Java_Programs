package com.practice;
import java.util.Scanner;
public class Percentage_Grade {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the percentage");
	double percentage=sc.nextInt();
	if(percentage>=91 && percentage<=100) {
		System.out.println("Grade: A+");
		}
	else if(percentage>=81 && percentage<=90) {
		System.out.println("Grade: A");
		}
	else if(percentage>=71 && percentage<=80) {
		System.out.println("Grade: B+");
		}
	else if(percentage>=61 && percentage<=70) {
		System.out.println("Grade: B");
		}
	else if(percentage>=51 && percentage<=60) {
		System.out.println("Grade: C+");
		}
	else if(percentage>=41 && percentage<=50) {
		System.out.println("Grade: C");
		}
	else if(percentage<40) {
		System.out.println("Grade: Fail");
		}
	else {
		System.out.println("Invalid percentage");
	}
}
}
