package com.softserve.edu04.hw.task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 integer numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;   // better to use Math.max()
        max = (max > num3) ? max : num3;

        int min = (num1 < num2) ? num1 : num2;   // better to use Math.min()
        min = (min < num3) ? min : num3;

        System.out.println("The maximum value is " + max + '\n' + "The minimum value is " + min);
    }
}
