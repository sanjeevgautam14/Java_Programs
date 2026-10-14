package com.object;

public class ConstructorOverloading {
	int length;
	int width;
	double area;
	

	ConstructorOverloading()
	{
		System.out.println("No Argument Constructor");
		
		
	}
	 ConstructorOverloading(int length)
	    {
		    this();
			this.length=length;
			System.out.println("Length initialized");
		}
	
    ConstructorOverloading(int length,int width)
    {
    	this(length);
		//this.length=length;
		this.width=width;
		System.out.println("width initialized");
	}

    ConstructorOverloading(int length,int width,double area)
    {
    	this(length,width);
    	//this.length=length;
		//this.width=width;
		this.area=area;
		System.out.println("area initialized");
	
}
	public static void main(String[] args) {
		int l=2;
		int w=4;
		ConstructorOverloading ref = new ConstructorOverloading(l,w,l*w);
		System.out.println(ref.length);
		System.out.println(ref.width);
		System.out.println(ref.area);
        System.out.println("Stop Execution");
	}

}
