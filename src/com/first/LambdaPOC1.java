package com.first;

	// Java program to demonstrate lambda expressions 
	// to implement a user defined functional interface. 

	// A sample functional interface (An interface with 
	// single abstract method 
	interface FuncInterface 
	{ 
		// An abstract function 
		boolean abstractFun(int x, int y); 

		 
	} 

	public class LambdaPOC1 
	{ 
		public static void main(String args[]) 
		{ 
			// lambda expression to implement above 
			// functional interface. This interface 
			// by default implements abstractFun() 
			FuncInterface fobj = (int x,int y)->x>y; 

			// This calls above lambda expression and prints 10. 
			fobj.abstractFun(6,4); 
			manyTimes((int x,int y)->x>y,7,6);
		} 
		
		static void manyTimes(FuncInterface fj, int j, int i){
			System.out.println(fj.abstractFun(j,i));
			
		}
	} 


