package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        int num1 = getNumber("Input the first number:");
        int num2 = getNumber("Input the second number:");
        int num3 = getNumber("Input the third number:");
        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The smallest number is: " + min);
    }


    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

