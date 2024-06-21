package com.softserve.edu13.hw.hw3;

public class App {
    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 2024;
        int year3 = 1995;
        int year4 = 2000;

        System.out.println(year1 + " leap: " + isLeapYear(year1));
        System.out.println(year2 + " leap: " + isLeapYear(year2));
        System.out.println(year3 + " leap: " + isLeapYear(year3));
        System.out.println(year4 + " leap: " + isLeapYear(year4));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
