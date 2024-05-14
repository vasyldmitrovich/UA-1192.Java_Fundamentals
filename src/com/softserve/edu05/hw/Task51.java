package com.softserve.edu05.hw;

import java.util.Arrays;

public class Task51 {
/*
    Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
    that contains the number of days in each month.
• 10 integers numbers and calculates the sum of the first five elements if they are
    positive, or the product of the last five elements if they are not and output the result.
• 5 integer numbers and find:
    o position of second positive number;
    o minimum value and its position in the array.
    o calculate the product of all entered even numbers (exclude 0 from even if entered by user).
     */

    public static void execute() {// Nice
        System.out.println("Subtask 1");
        int month = DaysOfMonth.scanMonth();
        int days = DaysOfMonth.getDays(month);
        System.out.println("The number of days is: " + days);
        System.out.println();

        System.out.println("Subtask 2");
        ProductOfFiveCalculator calculator = new ProductOfFiveCalculator();
        calculator.execute();
        System.out.println();

        System.out.println("Subtask 3");
        Positioner positioner = new Positioner();
        int[] numbers = createArr(5);
        System.out.println("Array of entered values: " + Arrays.toString(numbers));
        int position = positioner.getSecondPosition(numbers);
        if (position < 6) {
            System.out.println("Second positive number position is: " + ++position); //Not an array index
        } else {
            System.out.println("There is no second positive number");
        }
        int[] mins = positioner.getMins(numbers);
        System.out.println("Min values is: " + mins[0] + ", its array's index is: " + mins[1]);
        System.out.println("Product of even numbers is: " + positioner.productOfEven(numbers));

    }

    public static int[] createArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = CustomScanner.scanInt();
        }
        return arr;
    }

}
