package com.softserve.edu15_thread.pt;

public class App {

    public static void main(String[] args) throws InterruptedException {

//        task1();
        task2();


    }

    public static void task1() {

        System.out.println("MAIN Thread ID = " + Thread.currentThread().getId());

        Runnable r1 = new Run();
        Thread t = new Thread(r1);
        t.start();
    }

    public static void task2() throws InterruptedException {

        System.out.println("MAIN Thread ID = " + Thread.currentThread().getId());

        Runnable r1 = new Run1pt2();
        Runnable r2 = new Run2pt2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("My name is Oleksii");
    }
}
