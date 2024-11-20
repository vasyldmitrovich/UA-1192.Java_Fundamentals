package com.softserve.edu15_thread.hw;

public class RunMassage implements Runnable {

    private final String message;
    private final int n;


    public RunMassage(String message, int n) {
        this.message = message;
        this.n = n;
    }


    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            System.out.println(message + " - " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
