package com.softserve.edu05.pt;

import java.util.Random;
import java.util.Scanner;

public class NumberUtils {

    private static final Scanner SCAN = App.SCAN;
    private static final Random RAND = new Random(System.currentTimeMillis());

    public static int getNumber(String prompt) throws NumberFormatException {
        System.out.println(prompt);
        return Integer.parseInt(SCAN.nextLine());
    }

    public static int[] inputArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getNumber("Input " + (i + 1) + " number: ");
        }
        return arr;
    }

    //range [-50;49]
    public static int[] generateRandomArray(int length) {// Ok
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = RAND.nextInt(100) - 50;
        }
        return arr;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int getSumOfPositives(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int getPositivesCount(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public static int getNegativesCount(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    /**
    returns 0 - equals; 1 - more positives; 2 - more negatives
     */
    public static int checkMorePosOrNeg(int[] numbers) {
        int positives = getPositivesCount(numbers);
        int negatives = getNegativesCount(numbers);

        if (positives > negatives) {
            return 1;
        } else if (negatives > positives) {
            return -1;
        }
        return 0;
    }

    public static int getAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static boolean contains(int[] numbers, int value) {
        for (int number : numbers) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }

    //algorithm realisation from Internet
    public static boolean isPrime(int value) {// Ok
        int i;
        int flag = 0;
        int m = value / 2;

        if(value == 0 || value == 1) {
            return false;
        } else {
            for(i = 2; i <= m; i++) {
                if(value % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
