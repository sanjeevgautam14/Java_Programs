package com.generate.otp;

public class MobileDriver {

	public static void main(String[] args) {
		System.out.println("Execution Start");
		UpdateMobileNo num=new UpdateMobileNo();
		int systemGeneratedOtp=num.generateOtp();
		System.out.println("systemGeneratedOtp : "+systemGeneratedOtp);
		System.out.println("Enter the OTP");
		num.setMobileNumber(12345);

	}

}
