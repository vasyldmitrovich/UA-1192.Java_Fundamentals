package com.softserve.edu05.hw;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        MonthDaysCalculator.task();
        SumProductCalculator.task();
        ResultsFinder.task();
    }
}
