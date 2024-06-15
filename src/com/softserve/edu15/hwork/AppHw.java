package com.softserve.edu15.hwork;

public class AppHw {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello!");
            }
        });

        Thread secondThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Nice to meet you");
            }
        });

        Thread thirdThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("My name is Anastasia");
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

        thirdThread.start();
    }

    public static void task2() {
        final Object first = new Object();
        final Object second = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (first) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (second) {
                    System.out.println("Success!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main method ends");
    }

    public static void task3() {
        Thread one = new Thread(() -> {
            System.out.println("Starting thread 'two' from thread 'one'");
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                System.out.println("Starting thread 'three' from thread 'two'");
                Thread three = new Thread(() -> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread number three");
                    }
                });

                three.start();

                try {
                    three.join();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception");
                }
            });

            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        });

        one.start();

        try {
            one.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception");
        }
    }
}