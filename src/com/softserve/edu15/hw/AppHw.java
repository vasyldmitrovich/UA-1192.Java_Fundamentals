package com.softserve.edu15.hw;

import java.util.Scanner;

public class AppHw {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String TWENTYRISKS = "-".repeat(20);
    final static Object first = new Object();
    final static Object second = new Object();

    public static void main(String[] args) {
        System.out.println(TWENTYRISKS + " Homework 1 " + TWENTYRISKS);
        runThreeThread();

        System.out.println(TWENTYRISKS + " Homework 2 " + TWENTYRISKS);
        //deadlock();

        System.out.println(TWENTYRISKS + " Homework 3 " + TWENTYRISKS);
        ThreeThread();
    }

    public static void runThreeThread() {
        Thread thread1 = new MsgThread("Hello");
        Thread thread2 = new MsgThread("From");
        Thread thread3 = new MsgThread("KNT");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void deadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (first) {
                System.out.println("Thread 1: holding first object lock");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("Thread 1: waiting for lock second object");
                synchronized (second) {
                    System.out.println("Thread 1: holding first and second object lock");

                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                System.out.println("Thread 2: holding second object lock");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("Thread 2: waiting for lock first object");
                synchronized (first) {
                    System.out.println("Thread 2: holding second and first object lock");

                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Main method finished.");
    }

    private static void ThreeThread() {
        Thread one = new Thread(new OneRunnable());
        one.start();
        try {
            one.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Main method finished.");

    }

}
