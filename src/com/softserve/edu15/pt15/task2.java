package com.softserve.edu15.pt15;

public class task2 {

    public static void main(String[] args) {
        printMessages("Hello, world", "Peace in the peace", 5, 2, 3);
        System.out.println("My name is ... java");
    }

    public static void printMessages(String message1, String message2, int repetitions, int interval1Seconds, int interval2Seconds) {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(message1);
            sleepSeconds(interval1Seconds);
            System.out.println(message2);
            sleepSeconds(interval2Seconds);
        }
    }

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
