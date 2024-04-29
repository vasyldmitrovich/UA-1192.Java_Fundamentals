package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask1 {

    PracticalTask1() {}

    public void start() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = sc.nextLine();
        System.out.println("Enter second string");
        String secondString = sc.nextLine();
        System.out.println("Enter third string");
        String thirdString = sc.nextLine();
        System.out.println("String in reverse order:" + "\n" +
                thirdString + "\n" +
                secondString + "\n" +
                firstString);
    }
}
