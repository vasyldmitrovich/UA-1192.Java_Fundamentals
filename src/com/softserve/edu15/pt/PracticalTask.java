package com.softserve.edu15.pt;

public class PracticalTask {

    public void task1() {

        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void task2() {

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Hello,world");
                Thread.sleep(2000);
                System.out.println("Peace in the peace");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("My name is Java");
    }
}