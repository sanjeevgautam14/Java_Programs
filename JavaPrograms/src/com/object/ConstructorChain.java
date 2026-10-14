package com.object;

public class ConstructorChain {
	String EmpName;
	int EmpID;
	String Designation;
	double salary;
	
	
	ConstructorChain(String Empname,int EmpID,String Designation,double salary ){
		this("Ravi",102,"Software Consultant");
		
		  System.out.println("Constructor 2");
		
		  //this.EmpName=Empname;
		  //this.EmpID=EmpID;
		  //this.Designation=Designation;
		  //this.salary=salary;
	}
	
	ConstructorChain(String Empname,int EmpID,String Designation){
		this.EmpName=Empname;
		this.EmpID=EmpID;
		this.Designation=Designation;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
		ConstructorChain ref = new ConstructorChain("Sanjeev",101,"Software Developer",200000);
		
		System.out.println(ref.EmpName);
		System.out.println(ref.EmpID);
		System.out.println(ref.Designation);
		System.out.println(ref.salary);

	}

}
