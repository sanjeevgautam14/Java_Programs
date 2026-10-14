package com.generate.otp;

import java.util.Scanner;

public class UpdateMobileNo {
	String name="iPhone";
	private long mobileNumber=1234;
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the old mobile number");
		long oldNumber=sc.nextLong();
		if(this.mobileNumber==oldNumber) {
			System.out.println("Entered no matched with old mobile no");
			
			
		}
		else {
			System.out.println("Entered not matched with old mobile no");
		}
	}

	    //Generate OTP
        public int generateOtp() {
		
		return (int)(9999*Math.random()+9999);
	}


}
