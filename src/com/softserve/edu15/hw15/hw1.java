package com.softserve.edu15.hw15;
import java.util.concurrent.CountDownLatch;

public class hw1 {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);

        Thread thread1 = new Thread(new Worker("Thread 1", latch));
        Thread thread2 = new Thread(new Worker("Thread 2", latch));
        Thread thread3 = new Thread(new Worker("Thread 3", null)); // No need for latch

        thread1.start();
        thread2.start();

        try {
            latch.await();
            thread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Worker implements Runnable {
        private String message;
        private CountDownLatch latch;

        public Worker(String message, CountDownLatch latch) {
            this.message = message;
            this.latch = latch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(message + " - " + (i + 1));
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }            if (latch != null) {
                latch.countDown();
            }
        }
    }
}
