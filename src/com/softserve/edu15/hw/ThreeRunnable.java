package com.softserve.edu15.hw;

public class ThreeRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number three");

        }
    }
}
