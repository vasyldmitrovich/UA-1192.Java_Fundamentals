package com.softserve.edu04.hw;
import java.util.Scanner;
public class Task2 {
    public static void main (String[] args) {
        int num1 = getInt("Enter the first number: ");
        int num2 = getInt("Enter the second number: ");
        int num3 = getInt("Enter the third number: ");

        int min = Math.min(num1, Math.min(num2, num3));
        int max  = Math.max(num1, Math.max(num2, num3));

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }

    private static int getInt(String prompt) {// Good method
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
