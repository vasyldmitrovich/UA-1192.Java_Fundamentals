package com.softserve.edu15.hw;

public class Task2 {
    public static void main(String[] args) {
        final Object resource1 = "Resource 1";
        final Object resource2 = "Resource 2";

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println("Thread 1 was interrupted");
                }

                System.out.println("Thread 1: waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println("Thread 2 was interrupted");
                }

                System.out.println("Thread 2: waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted");
        }

        System.out.println("End of main method");
    }
}
