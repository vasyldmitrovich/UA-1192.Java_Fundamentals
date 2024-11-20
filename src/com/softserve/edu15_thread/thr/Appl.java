package com.softserve.edu15_thread.thr;

public class Appl {
	//public volatile static int sum = 0;
	public static int sum = 0;
	public static Object monitor = new Object();
	//public static Object monitor2 = new Object();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new Run1p();
		Thread t1 = new Thread(r1);
		t1.setPriority(Thread.MIN_PRIORITY);
		Runnable r2 = new Run1m();
		Thread t2 = new Thread(r2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		//
		//t1.join();
		t2.join();
		//
		//t1.start(); // Thread t1 Dead
//        for (int i = 0; i < 10000; i++) {
//        	Thread.yield();
//        }
		// System.out.print("Main Thread ID = " + Thread.currentThread().getId());
		System.out.println(" Main DONE, sum=" + sum);

	}
}
