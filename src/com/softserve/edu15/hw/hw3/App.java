package com.softserve.edu15.hw.hw3;

public class App {
    public static void main(String[] args) {
        Thread threadThree = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            threadThree.start();
            try {
                threadThree.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadOne = new Thread(() -> {
            threadTwo.start();
            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
