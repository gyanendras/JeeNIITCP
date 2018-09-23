package com.mysystems.concurrent;

import java.util.ArrayList;

public class MySyncPOC2 implements Runnable{
 static Object obj = new Object();
 static ArrayList ar = new ArrayList();
	
	@Override
	public void run() {
		method1() ;
		method2() ;
		method3() ;
		
		
	}
	
	synchronized void method1() {
		 
			 String tname = Thread.currentThread().getName();
			 if(tname.equals("C1")) {
				 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 ar.add(tname+"m11"); 
		System.out.println(tname+" entering method 1");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tname+" exiting method 1");
		ar.add(tname+"m12");
		 
		
	}
	
	synchronized void method2() {
		
			String tname = Thread.currentThread().getName();
			ar.add(tname+"m21");
		System.out.println(tname+ " entering method 2");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tname +" exiting method 2");
		ar.add(tname+"m22");
		}
		
	
	
	synchronized void method3() {
		
			String tname = Thread.currentThread().getName();
			ar.add(tname+"m31");
		System.out.println(tname+ " entering method 3");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tname +" exiting method 3");
		ar.add(tname+"m32");
		
	}
	
	static public void printList() {
		System.out.println(ar);
	}

}
