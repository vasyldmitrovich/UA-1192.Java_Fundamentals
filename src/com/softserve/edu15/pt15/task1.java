package com.softserve.edu15.pt15;

public class task1 {// Name of class
    public static void main(String[] args) {// Good
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
