package com.softserve.edu05.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtask3 {

    private int [] numbers = new int[5];

    Subtask3() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        int count = 0;


        while (count != 5) {
            System.out.println("Enter the number");
            try {
                int number = sc.nextInt();
                numbers[count] = number;
                count++;
                // Added InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("You enter non-float value");
            }
        }

        secondPositiveNum(numbers);
        minimumValue(numbers);
        productOfEvenNumbers(numbers);
    }

    public static int secondPositiveNum (int [] numbers) {
        int count = 0;
        int secondPositiveNum = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
            if (count == 2) {
                secondPositiveNum = i;
                System.out.println("The position of the second positive number is " + secondPositiveNum);
                break;
            }
        }

        if (count != 2) {
            System.out.println("There are no two positive number in array");
        }
        return secondPositiveNum;
    }

    public static int minimumValue (int [] numbers) {
        int min = numbers[0];
        int pos = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                pos = i;
            }
        }

        System.out.println("Minimum value in array is " + min + " and it is on " + pos + " in array");
        return pos;
    }

    public static int productOfEvenNumbers (int [] numbers) {
        int sum = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                sum *= numbers[i];
            }
        }

        System.out.println("The sum of all even numbers is " + sum);
        return sum;
    }
}
