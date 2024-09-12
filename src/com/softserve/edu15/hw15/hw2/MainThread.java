package com.softserve.edu15.hw15.hw2;

public class MainThread {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        ThreadA threadA = new ThreadA(lockA, lockB);
        threadA.start();

        ThreadB threadB = new ThreadB(lockA, lockB);
        threadB.start();

        synchronized (lockA) {
            try {
                lockA.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (lockB) {
            try {
                lockB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Both threads have finished. Main thread exiting.");
    }
}
