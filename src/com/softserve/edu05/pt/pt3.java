package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class pt3 {
    public static void main(String[] args) {
        String arrayNums = "array data: \n";
        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            int currentInt = random.nextInt();
            randomArray[i] = currentInt;
            arrayNums = arrayNums + currentInt + ", ";
        }

        System.out.println(arrayNums);

        int maxNumber = -999999999;
        for (int num : randomArray) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        System.out.println("Max number is " + maxNumber);

        int positiveSum = 0;
        int negativeCount = 0;
        for (int num : randomArray) {
            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("The sum of positive numbers: " + positiveSum);
        System.out.println("The count of negative numbers: " + negativeCount);

        if (negativeCount > randomArray.length - negativeCount) {
            System.out.println("There are more negative values in the array.");
        } else if (negativeCount < randomArray.length - negativeCount) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are equal of positive and negative numbers.");
        }
    }
}
