package com.softserve.edu15.pt;

public class AppPt15 {

    public static void main(String[] args) {

        System.out.println("Perform practical task 15.1");
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println();

        System.out.println("Perform practical task 15.2");
        MessageThread message1Thread = new MessageThread("Hello world", 2000);
        MessageThread message2Thread = new MessageThread("Peace in the peace", 3000);

        message1Thread.start();
        message2Thread.start();

        try {
            message1Thread.join();
            message2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("My name is ...");
    }
}
