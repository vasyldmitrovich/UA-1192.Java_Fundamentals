package com.softserve.edu15.hw;

public class OneRunnable implements Runnable {
    @Override
    public void run() {
        Thread two = new Thread(new TwoRunnable());
        two.start();
        Thread three = new Thread(new ThreeRunnable());
        three.start();

        try {
            two.join();
            three.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Thread one finished.");
    }
}
