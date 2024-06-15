package com.softserve.edu15.hw;

public class Task151 {

    public static void execute() {
        Thread thread1 = new Thread(new MessageThread("Message 1"));
        Thread thread2 = new Thread(new MessageThread("Message 2"));

        Thread thread3 = new Thread(() -> {
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("Message 3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }


}
