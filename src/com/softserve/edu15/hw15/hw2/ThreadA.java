package com.softserve.edu15.hw15.hw2;

public class ThreadA extends Thread {
    private Object lockA;
    private Object lockB;

    public ThreadA(Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    public void run() {

        synchronized (lockA) {
            System.out.println("Thread A acquired lockA");


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            synchronized (lockB) {
                System.out.println("Thread A acquired lockB");
            }
        }

        synchronized (lockA) {
            lockA.notify();
        }
    }
}
