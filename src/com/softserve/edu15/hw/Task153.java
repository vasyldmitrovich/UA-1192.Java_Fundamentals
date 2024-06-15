package com.softserve.edu15.hw;

public class Task153 {

    public static void execute(){
        Thread threadThree = new Thread(new MessageThread("Thread number three"));
        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            threadThree.start();
        });

        Thread threadOne = new Thread(() -> threadTwo.start());

        threadOne.start();

        try {
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished");
    }
}
