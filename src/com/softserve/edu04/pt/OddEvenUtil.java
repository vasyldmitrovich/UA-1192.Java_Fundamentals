package com.softserve.edu04.pt;

public class OddEvenUtil {

    private OddEvenUtil() {}

    public static int[] getOdds(String prompt, String delimiter) {
        int[] numbers = stringToNumbers(prompt, delimiter);
        return getOdds(numbers);
    }
    public static int[] getOdds(int... numbers) {
        int[] odds = new int[getOddQuantity(numbers)];
        int index = 0;

        for (int number : numbers) {
            if (isOdd(number)) {
                odds[index++] = number;
            }
        }
        return odds;
    }

    public static int getOddQuantity(String prompt, String delimiter) {
        int[] numbers = stringToNumbers(prompt, delimiter);
        return getOddQuantity(numbers);
    }
    public static int getOddQuantity(int... numbers) {
        int count = 0;

        for (int number : numbers) {
            if (isOdd(number)) {
                count++;
            }
        }
        return count;
    }

    /*
    The same realisation for even numbers...but in this case not required
     */

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private static int[] stringToNumbers(String numbersString, String delimiter) {
        String[] elements = numbersString.split(delimiter);
        int[] numbers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        return numbers;
    }

}
