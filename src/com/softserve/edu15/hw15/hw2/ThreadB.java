package com.softserve.edu15.hw15.hw2;

public class ThreadB extends Thread {
    private Object lockA;
    private Object lockB;

    public ThreadB(Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    public void run() {
        synchronized (lockB) {
            System.out.println("Thread B acquired lockB");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lockA) {
                System.out.println("Thread B acquired lockA");
            }
        }

        synchronized (lockB) {
            lockB.notify();
        }
    }
}
