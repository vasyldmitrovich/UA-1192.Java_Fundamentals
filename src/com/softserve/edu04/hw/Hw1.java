package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int oddCount = 0;

        for (int i = 0; i < 3; i++) {
            int number = sc.nextInt();

            if (number % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers: " + oddCount);
        sc.close();
    }
}
