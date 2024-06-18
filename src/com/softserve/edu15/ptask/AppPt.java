package com.softserve.edu15.ptask;

public class AppPt {
    public static void main(String[] args) {// Ok
        task1();
        task2();
    }

    public static void task1() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception");
        }
    }

    public static void task2() {
        Thread firstThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello, world");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        });

        Thread secondThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Peace in the peace");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        });

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception");
        }

        System.out.println("My name is Anastasia");
    }
}