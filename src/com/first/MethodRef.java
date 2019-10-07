package com.first;

public class MethodRef {
	public int k;

	static int multiply(int i, int j) {
		return i * j;

	}
	
	MethodRef(){
		k=10;
	}

	MethodRef(int i, int j) {
		k = i * j;
	}

	
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}