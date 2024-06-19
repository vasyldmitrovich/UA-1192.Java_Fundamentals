package com.softserve.edu15.pt;

public class Task2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted");
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

        System.out.println("My name is ...");
    }
}
