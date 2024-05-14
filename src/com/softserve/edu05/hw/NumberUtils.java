package com.softserve.edu05.hw;

import java.util.Scanner;

public class NumberUtils {

    private static final Scanner SCAN = App.SCAN;// Nice it is nice

    public static int getNumber(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        return Integer.parseInt(SCAN.nextLine());
    }

    public static int[] getNumbers(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        return stringToIntegers(SCAN.nextLine());
    }

    public static int[] stringToIntegers(String numbersString) throws NumberFormatException {
        String[] numberStrings = numbersString.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        return numbers;
    }

    /**
     *
     * @param numbers array of numbers
     * @return sum of array's first half of array if all of them are positive,
     *      and product of second half of array if any from first one is negative
     */
    public static int getIntegersSumOrMult(int[] numbers) {// Good
        int result = 0;
        //if length is odd -> don't check value in the middle in both parts
        int firstHalfEnd = numbers.length / 2;
        int secondHalfStart = firstHalfEnd + (numbers.length % 2);
        boolean mustCalculateProduct = false;

        for (int i = 0; i < firstHalfEnd; i++) {
            if (numbers[i] < 0) {
                mustCalculateProduct = true;
                result = 1;
                break;
            }
            result += numbers[i];
        }

        if (mustCalculateProduct) {
            for (int i = secondHalfStart; i < numbers.length; i++) {
                result *= numbers[i];
            }
        }
        return result;
    }

    /**
     *
     * @param numbers array of numbers
     * @return -2 if there are no positives
     * <p> -1 if only one positive are presented
     * <p> >= 0 - position of second positive
     */
    public static int getSecondPositivePos(int[] numbers) {// Cool
        int position = -2;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                counter++;
                position++;
            }

            if (counter == 2) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static int getMinimalPos(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int min = numbers[0];
        int position = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                position = i;
            }
        }
        return position;
    }

    public static int getProductOfEvens(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int product = 1;
        int counter = 0;
        for (int number : numbers) {
            if (number != 0 && number % 2 == 0) {
                product *= number;
                counter++;
            }
        }
        return counter == 0 ? 0 : product;
    }
}
