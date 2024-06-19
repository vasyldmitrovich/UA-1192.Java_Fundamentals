package com.softserve.edu15.hw;

public class Task3 {
    public static void main(String[] args) {
        Thread threadThree = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Thread three was interrupted");
                }
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Thread two was interrupted");
                }
            }
            threadThree.start();
            try {
                threadThree.join();
            } catch (InterruptedException e) {
                System.err.println("Thread two was interrupted while waiting for thread three to finish");
            }
        });

        Thread threadOne = new Thread(() -> {
            threadTwo.start();
            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                System.err.println("Thread one was interrupted while waiting for thread two to finish");
            }
        });

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted while waiting for thread one to finish");
        }

        System.out.println("End of main method");
    }
}
