package com.mysystems.concurrent;

public class MyThreadRun {

	public static void main(String[] args) {
		testRun();

	}

	static void testRun() {
		Runnable r = new MySyncPOC();
		Thread t1 = new Thread(r);
		t1.setName("A1");

		Thread t2 = new Thread(new MySyncPOC());
		t2.setName("B1");

		Thread t3 = new Thread(new MySyncPOC());
		t3.setName("C1");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			MySyncPOC.printList();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
