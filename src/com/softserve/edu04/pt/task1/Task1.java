package com.softserve.edu04.pt.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int count = 0;

        if (num1 % 2 == 0) {
            count++;
        }

        if (num2 % 2 == 0) {
            count++;
        }

        if (num3 % 2 == 0) {
            count++;
        }
        System.out.println("The number of odd numbers is " + count);
    }
}
