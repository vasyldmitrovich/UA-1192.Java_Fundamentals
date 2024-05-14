package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three float numbers:");

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        scanner.close();

        if (IsFloat(num1) && IsFloat(num2) && IsFloat(num3)) {
            System.out.println("Great, this is Float. All numbers belong to the range -5, 5");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    private static boolean IsFloat(float num) {
        return num >= -5 && num <= 5;
    }
}
