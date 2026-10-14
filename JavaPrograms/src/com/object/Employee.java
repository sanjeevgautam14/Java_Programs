package com.object;

public class Employee {
	String EmpName;
	int EmpID;
	String Designation;
	double salary;
	
	
	Employee(String Empname,int EmpID,String Designation,double salary ){
		this.EmpName=Empname;
		this.EmpID=EmpID;
		this.Designation=Designation;
		this.salary=salary;
		
	}
	
	Employee   (String Empname,int EmpID,String Designation){
		this.EmpName=Empname;
		this.EmpID=EmpID;
		this.Designation=Designation;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
		Employee ref = new Employee("Sanjeev",101,"Software Developer",200000);
		System.out.println(ref.EmpName);
		System.out.println(ref.EmpID);
		System.out.println(ref.Designation);
		System.out.println(ref.salary);

	}

}
