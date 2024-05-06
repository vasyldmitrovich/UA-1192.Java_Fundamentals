package com.softserve.edu04.hw;

public class NumberUtil {

    private NumberUtil() {}

    public static boolean isInRange(float min, float max, float... numbers) {
        for (float number : numbers) {
            if (number < min || number > max) {
                return false;
            }
        }
        return true;
    }

    public static int getMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int getMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int[] stringToInt(String numbersString, String delimiter) {
        String[] elements = numbersString.split(delimiter);
        int[] numbers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        return numbers;
    }

    public static float[] stringToFloat(String numbersString, String delimiter) {
        String[] elements = numbersString.split(delimiter);
        float[] numbers = new float[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Float.parseFloat(elements[i]);
        }
        return numbers;
    }
}
