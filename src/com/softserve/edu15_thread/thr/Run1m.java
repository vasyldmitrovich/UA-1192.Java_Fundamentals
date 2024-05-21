package com.softserve.edu15_thread.thr;

public class Run1m implements Runnable {

	public void run() {
		boolean isWait = true;
		int k;
		System.out.println("- Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {
			// Appl.go(Thread.currentThread().getId());


			k = Appl.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Appl.sum = k - 1;
			System.out.print("-");


			// synchronized (Appl.class) {
//			synchronized (Appl.monitor) {
//				k = Appl.sum;
//				try {
//					if ((k < 0) && isWait) {
//						System.out.print("WAIT");
//						Appl.monitor.wait();
//						System.out.print("RUN");
//						k = Appl.sum;
//						// Appl.monitor.notifyAll();
//						isWait = false;
//					}
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				Appl.sum = k - 1;
//				System.out.print("-");
//				// Appl.monitor.notifyAll();
//			}

		}
		System.out.println(" DONE-, sum=" + Appl.sum);
	}
}
