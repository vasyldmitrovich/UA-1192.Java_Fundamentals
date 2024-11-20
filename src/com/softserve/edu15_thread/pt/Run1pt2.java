package com.softserve.edu15_thread.pt;

public class Run1pt2 implements Runnable {

    @Override
    public void run() {
        System.out.println("+ Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
