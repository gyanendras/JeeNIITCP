package com.first;

// Java program to demonstrate lambda expressions 
// to implement a user defined functional interface. 

// An interface with 
// only one abstract method declaration.
interface MyFunctionalInterface {
	// An abstract function
	int myLambda(int x, int y);

	// boolean myLambda2(int x, int y);
	static int sum(int i, int j) {
		return i + j;
	}

	default int subtract(int i, int j) {
		return i - j;
	}

	default int divide(int i, int j) {
		return i / j;
	}

}

interface MyFunctionalIntf2 {
	MethodRef lamda(int i, int j);
}

public class LambdaPOC1 {
	public static void main(String args[]) {
		// lambda expression to implement above
		// functional interface.
		MyFunctionalInterface fobj = (int x, int y) -> {
			return x ^ y;
		};

		// This calls above lambda expression and prints true.
		System.out.println(fobj.myLambda(6, 4));

		// lambda passed as inline code with parameters and function body
		canInjectStrategies((int x, int y) -> x + y, 6, 7);

		// lambda passed as method reference of static method
		canInjectStrategies(MyFunctionalInterface::sum, 6, 6);

		// lambda passed as method reference of instance method
		canInjectStrategies(fobj::myLambda, 7, 8);

		// lambda passed as method reference of default method
		canInjectStrategies(fobj::subtract, 6, 7);

		// lambda passed as method reference of
		// method with similar signature from different class
		canInjectStrategies(MethodRef::multiply, 6, 7);
		
		//lambda passed as constructor ref
		constRef(MethodRef::new,6,7,9);
		

	}

	// method that has a functional interface as argument
	static void canInjectStrategies(MyFunctionalInterface fj, int j, int i) {
		System.out.println(fj.myLambda(j, i));

	}

	static void constRef(MyFunctionalIntf2 mf, int i, int j, int k) {
			MethodRef mrf =mf.lamda(i, j);
			System.out.println(mrf.k);
	}

}
