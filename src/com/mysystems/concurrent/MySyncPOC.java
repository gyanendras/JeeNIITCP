package com.mysystems.concurrent;

import java.util.ArrayList;

public class MySyncPOC implements Runnable {
	static Object obj = new Object();

	static ArrayList ar = new ArrayList();

	@Override
	public void run() {
		method1();
		method2();
		method3();

	}

	void method1() {
		synchronized (obj) {
			String tname = Thread.currentThread().getName();
			ar.add(tname + "m11");
			System.out.println(tname + " entering method 1");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(tname + " exiting method 1");
			ar.add(tname + "m12");
		}

	}

	void method2() {
		synchronized (obj) {
			String tname = Thread.currentThread().getName();
			ar.add(tname + "m21");
			System.out.println(tname + " entering method 2");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(tname + " exiting method 2");
			ar.add(tname + "m22");
		}

	}

	void method3() {
		synchronized (obj) {
			String tname = Thread.currentThread().getName();
			ar.add(tname + "m31");
			System.out.println(tname + " entering method 3");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(tname + " exiting method 3");
			ar.add(tname + "m32");
		}
	}

	static public void printList() {
		System.out.println(ar);
	}

	public static Object getObj() {
		return obj;
	}

	public static void setObj(Object obj) {
		MySyncPOC.obj = obj;
	}
}
