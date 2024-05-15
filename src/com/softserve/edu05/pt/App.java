package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class App {// Ok
    public static void main(String[] args) {
        System.out.println("Start");

        //Task1
        Task1.task1();
        //Task2
        Task2.task2();

        //Task3
        task3();

    }

    public static  void task3(){
        Random random = new Random();


        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(201) - 100;
        }

        int maxNumber = Arrays.stream(randomNumbers).max().getAsInt();


        int positiveSum = 0;
        int negativeCount = 0;
        for (int num : randomNumbers) {
            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        String result;
        if (negativeCount > positiveSum) {
            result = "in array more negative value.";
        } else if (positiveSum > negativeCount) {
            result = "in array more positive value.";
        } else {
            result = "positive and negative value equal amount.";
        }


        System.out.println("array random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("bigest number in array : " + maxNumber);
        System.out.println("sum positive numbers: " + positiveSum);
        System.out.println("sum negative numbers: " + negativeCount);
        System.out.println(result);
    }
}
