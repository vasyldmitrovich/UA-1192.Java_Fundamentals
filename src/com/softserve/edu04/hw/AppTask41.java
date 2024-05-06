package com.softserve.edu04.hw;

import java.util.Scanner;

public class AppTask41 {
    /*
        Write a program that prompts the user to input three float numbers. The program should check if all three numbers
        fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
        message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
        program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
        includes the values -5 and 5 as well.
     */
    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
        boolean condition = true;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter floating point number: ");
            numbers[i] = scanner.nextDouble();
            if (numbers[i] < -5 || numbers[i] > 5) {
                condition = false;
            }
        }
        if (condition){
            System.out.println("All entered numbers belong to [-5, 5] range");
        } else {
            System.out.println("One or several numbers are out of [-5, 5] range");
        }
    }

}
