package com.first;

public class A {

	public static int j;
	
	static {
		System.out.println("In A static");
	}
	
	{
		System.out.println("In A instance block");
	}
	
	A(){
		System.out.println("In A default Const");
	}

}
