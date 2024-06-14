package com.softserve.edu15_thread.pt;

public class Run2pt2 implements Runnable {

    @Override
    public void run() {
        System.out.println("+ Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
