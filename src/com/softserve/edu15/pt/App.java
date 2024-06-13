package com.softserve.edu15.pt;

public class App {
    public static void main(String[] args) {
//        System.out.println("Task 1");
//        task1();

        System.out.println("Task 2");
        task2();
    }

    public static void task1() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Task 1 interrupted");
        }
    }

    public static void task2() {
        try {
            Thread helloWorldTread = new Thread(() -> {

                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hello World");
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    System.err.println("HelloWorld thread interrupted");
                    Thread.currentThread().interrupt();
                }
            });

            Thread peaceInPeaceThread = new Thread(() -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Peace in Peace");
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    System.err.println("PeaceInPeace thread interrupted");
                    Thread.currentThread().interrupt();
                }
            });

            helloWorldTread.start();
            peaceInPeaceThread.start();

            helloWorldTread.join();
            peaceInPeaceThread.join();

            System.out.println("My name is Vova");
        } catch (InterruptedException e) {
            System.out.println("Task 2 interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
