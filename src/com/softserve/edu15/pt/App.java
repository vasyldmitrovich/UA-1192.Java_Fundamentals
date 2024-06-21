package com.softserve.edu15.pt;

public class App {

    public static void main(String[] args) {

        //pt1
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //pt2
        Thread message1Thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread message2Thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000); // Sleep for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        message1Thread.start();
        message2Thread.start();

        try {
            message1Thread.join();
            message2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("My name is Andrew");

    }
}
