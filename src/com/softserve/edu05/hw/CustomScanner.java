package com.softserve.edu05.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {

    public static int scanInt(){
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Enter integer value please");
        try {
            value = scanner.nextInt();
            return value;
        } catch (InputMismatchException exception){
            System.out.println("Incorrect value");
            return scanInt();// Good decision
        }
    }
}
