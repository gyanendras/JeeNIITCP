package com.mysystems.concurrent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MultipleConsumers extends Thread {

	static LinkedList<Integer> alist = new LinkedList<Integer>();
	static MultipleConsumers mCon = new MultipleConsumers();
	volatile int size = 0;
	volatile Object myObj = new Object();

	public static void main(String[] args) {
		int i;
		// Random r = new Random();
		for (i = 0; i < 1000; ++i) {
			// Integer rInt = r.nextInt();
			mCon.alist.add(i);
		}

		mCon.setName("A1");
		mCon.setPriority(5);
		mCon.start();
		/*
		 * try { mCon.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		Thread t1 = new MultipleConsumers();
		Thread t2 = new MultipleConsumers();
		t1.setName("B1");
		t2.setName("C1");
		t2.setPriority(5);
		System.out.println(t2.getState());

		t1.start();

		t2.start();
	}
	// System.out.println("In Main");

	@Override
	public void run() {
		System.out.println(this.getState());
		/*
		 * if (this.getName().equals("A1")) { try { sleep(200); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */

		removeList();

	}

	private void removeList() {
		while (alist.size() > 0) {
			// System.out.println(this.getStackTrace());

			synchronized (MultipleConsumers.class) {
				if (alist.size() > 0) {
					System.out.println(
							currentThread().getName() + " Size " + alist.size());
					if (currentThread().getName().equals("C1")) {
						try {
							mCon.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						

						if (currentThread().getName().equals("B1")) {
						
								notifyAll();
							
						}

						Integer i = alist.removeFirst();

						//System.out.println("In the thread " + this.getName() + " removing " + i + " " + alist.size());
						// yield();

					}
				}
			}
		}
	}



