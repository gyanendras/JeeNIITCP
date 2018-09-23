package com.mysystems.concurrent;

public class DaemonPOC implements Runnable {
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
				System.out.println("In daemon thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Thread t = new Thread(new DaemonPOC());
		//t.setDaemon(true);
		t.start();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Entering user Thread");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Exiting user Thread");
				
			}
		
		});
		t1.start();
	}

}
