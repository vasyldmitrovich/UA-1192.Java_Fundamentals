package com.softserve.edu04.hw.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 float numbers");
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();

        if (number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5) {
            System.out.println("All three numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }
}
