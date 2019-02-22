package com.first;

class A1 {
	  int i, j;

	   A1(int a, int b) {
	    i = a;
	    j = b;
	  }
	  void show() {
	    System.out.println("i and j: " + i + " " + j);
	  }
	}
	class B1 extends A1 {
	  int k;

	  B1(int a, int b, int c) {
	    super(a, b);
	    k = c;
	  }
	  void show(String msg) {
	    System.out.println(msg + k);
	  }
	}
	
	class Override {
	  public static void main(String args[]) {
	    B1 subOb = new B1(3, 5, 7);
	    subOb.show("This is k: "); // this calls show() in B
	    subOb.show(); // this calls show() in A
	  }
	} 
