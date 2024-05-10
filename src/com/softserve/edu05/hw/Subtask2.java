package com.softserve.edu05.hw;

import java.util.Scanner;

public class Subtask2 {

    private int [] numbers = new int[10];

    Subtask2() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        int count = 0;


        while (count != 10) {
            System.out.println("Enter the number");
            try {
                int number = sc.nextInt();
                numbers[count] = number;
                count++;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        sum(numbers);
    }

    public static int sum (int [] numbers) {
        int sum;
        boolean check = true;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                check = false;
                break;
            }
        }

        if (check) {
            sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            System.out.println("The sum of the first five values is " + sum);
        } else {
            sum = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
            System.out.println("The product of the last five values is " + sum);
        }
        return sum;
    }
}
