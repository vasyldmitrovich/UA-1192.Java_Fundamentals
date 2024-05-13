package com.softserve.edu04.hw;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input three integer numbers: ");
        // бла бла
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));

        System.out.println("max number : " + max);
        System.out.println("min number : " + min);

        sc.close();
    }
}
