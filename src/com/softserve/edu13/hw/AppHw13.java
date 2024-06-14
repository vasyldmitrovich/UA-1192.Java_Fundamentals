package com.softserve.edu13.hw;

public class AppHw13 {

    public static void main(String[] args) {

        System.out.println("Perform homework task 13.1");
        Task131.execute();
        System.out.println();


        System.out.println("Perform homework task 13.2");
        System.out.println("Validate 04.15.24: " +Task132.validate("04.15.24"));
        System.out.println("Validate 13.05.01: " + Task132.validate("13.05.01"));
        System.out.println("Validate 12.30.00: " + Task132.validate("12.32.00"));
        System.out.println("Validate 01.01.00: " + Task132.validate("01.01.00"));
        System.out.println();

        System.out.println("Perform homework task 13.3");
        System.out.println("Is 2023 year leap? " + Task133.isLeap(2023));
        System.out.println("Is 2024 year leap? " + Task133.isLeap(2024));

        System.out.println("Perform homework task 13.4");
        Task134.execute();
    }
}
