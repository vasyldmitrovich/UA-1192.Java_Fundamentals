package com.softserve.edu03.pt;

import java.util.Scanner;

public class AppTask31 {
/*
    Java console application with methods that accept two numbers as arguments and
    have the following methods:
    • getTotal - returns their sum;
    • getAverage - returns their average;
    • getNumber(String prompt) - allows input of numbers using Scanner with
        messages and return number
 */

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        double varA = getNumber(scanner.nextLine());

        System.out.println("Enter second number: ");
        double varB = getNumber(scanner.nextLine());

        System.out.printf("The sum of %f and %f is %.2f %n", varA, varB, getTotal(varA,varB));
        System.out.printf("The average of %f and %f is %.2f %n", varA, varB, getAverage(varA,varB));
//        System.out.println("getNumber method test result is: " + getNumber("-356.4"));
    }

    private static double getTotal(double a, double b){
        return a+b;
    }

    private static double getAverage(double a, double b){
        return getTotal(a,b)/2;
    }

    private static double getNumber(String prompt){

        return Double.parseDouble(prompt);
    }

}
