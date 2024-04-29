package com.softserve.edu01.pt;

import java.util.Scanner;

public class PracticalTask4 {

    PracticalTask4() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
    }
}
