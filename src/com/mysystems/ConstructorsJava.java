package com.mysystems;

public class ConstructorsJava {
	class A{ 
		
		protected int k;
		A(int j){
		 
		System.out.print("From A1");}}
	class B extends A{ 
		B(int z){
			super(1);
			z=2;}
		
	}



	public static void main(String[] args) {
		
		new ConstructorsJava().new B(3);
		new ConstructorsJava().new A(3).k=20;
	}

}
