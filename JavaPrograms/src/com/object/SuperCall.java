package com.object;

public class SuperCall {
	SuperCall()
	{
		System.out.println("Hello");
			
		}
}
	
class B extends SuperCall{
	
B()
{
		super();
	}
	
}
        class SuperMainClass {
		public static void main(String[] args) {
			System.out.println("Execution start");
			B ref=new B();
			System.out.println("Execution stop");

		}

}
