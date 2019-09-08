package com.mysys;

import java.util.ArrayList;

import com.mysystems.MyJDBC;

 class HelloWorld {
	private int i;
	char c='a';
	byte s1= 120;
	boolean b = true;
	
	protected ArrayList l =new ArrayList();
	final static String ab= new String("foo");
	String cd = "crow";
	
	
	final static protected  MyJDBC  mymethod(String s,Integer x){
		String ab= "foo";
		System.out.println("Hi\\####");
		ab=new HelloWorld().cd;
		new HelloWorld().b=false;
		int j= 5<<4;
		return new MyJDBC();
	
}
	
	public static void main(String args[]) {
		HelloWorld hw = new HelloWorld();
		hw.mymethod("Hello",1);
	
		System.out.println("HelloWorld");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
