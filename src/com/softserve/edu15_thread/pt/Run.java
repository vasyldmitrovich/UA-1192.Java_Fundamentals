package com.softserve.edu15_thread.pt;

import com.softserve.edu15_thread.thr.Appl;

public class Run implements Runnable {

    @Override
    public void run() {
        System.out.println("+ Thread ID = " + Thread.currentThread().getId());
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
