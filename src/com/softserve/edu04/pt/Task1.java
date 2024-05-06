package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num1 = getInt("Enter the first int: ");
        int num2 = getInt("Enter the second int: ");
        int num3 = getInt("Enter the third int: ");
        int odd = 0;
        if (num1 % 2 != 0) {
            odd++;
        } if (num2 % 2 != 0) {
            odd++;
        } if (num3 % 2 != 0) {
            odd++;
        }

        System.out.println("Number of odd numbers: " + odd);
    }


    private static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}


