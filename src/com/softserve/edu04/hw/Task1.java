package com.softserve.edu04.hw;
import java.util.Scanner;
public class Task1 {
    public static void main (String[] args) {
    float num1 = getNumber("Enter the first number in range of -5 and 5:");
    float num2 = getNumber("Enter the second number in range of -5 and 5:");
    float num3 = getNumber("Enter the third number in range of -5 and 5:");

        if (isInRange(num1) && isInRange(num2) && isInRange(num3)) {
            System.out.println("All numbers belong to the range");
        }
        else {
            System.out.println("Numbers don`t belong to the range");
        }
    }

    public static boolean isInRange(float num) {
        return -5 <= num && num <= 5;
    }


    public static float getNumber(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}
