package com.softserve.edu15.pt;

import java.util.Scanner;

public class AppPt {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String TWENTYRISKS = "-".repeat(20);
    public static void main(String[] args) {
/*        System.out.println(TWENTYRISKS + " Practical task 1 "+ TWENTYRISKS);
        RepeatMsgWithInterval();*/
        System.out.println(TWENTYRISKS + " Practical task 2 "+ TWENTYRISKS);
        printTwoMsg();
    }
    public static void RepeatMsgWithInterval(){
        System.out.println("Enter a massage to repeat");
        String msg = SCANNER.nextLine();
        for (int i = 0 ; i < 10; i++){
            System.out.println(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void printTwoMsg()   {
        Thread thread1 = new MyThreadMsg("Hello, world", 1000);
        Thread thread2 = new MyThreadMsg("Peace in the world", 2000);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("My name is...");

    }
}
