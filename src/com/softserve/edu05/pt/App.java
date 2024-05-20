package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        practicalTask1();
        practicalTask2();
        practicalTask3();
        Employee.createEmployee();
    }

    public static void practicalTask1() {
        String[] letters = new String[5];
        System.out.println("Input five characters/names/words to check sorting method: ");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = SCANNER.nextLine();

        }
        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        double[] numbers = new double[5];
        System.out.println("Input five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = SCANNER.nextDouble();
        }
        double sum = 0d;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The average value of array is: " + (sum / numbers.length));
        Arrays.sort(numbers);
        System.out.println("Input the number which you want to find: ");
        int value = SCANNER.nextInt();
        int founder = Arrays.binarySearch(numbers, value);
        String list = Arrays.toString(numbers);
        System.out.println("Array = " + list);
        boolean found = false;
        for (double i : numbers) {
            if (i == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Position of element with " + value + " is: " + (founder+1));
        } else System.out.println("Value is not found");
    }

    public static void practicalTask2() {
        System.out.println("\nLets check number on prime/non-prime\nEnter number: ");
        int x = SCANNER.nextInt();
        boolean res = true;
        if (x == 1) {
            res = false;
        }
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                res = false;
                break;
            } else res = true;
        }
        if (res) {
            System.out.println("\nNumber " + x + " is prime\n");
        } else System.out.println("\nNumber " + x + " is not prime\n");
    }

    public static void practicalTask3() {
        System.out.println("Lets check info about array with random.method");
        Random random = new Random(1);
        int biggestVal;
        int sumArrPos;
        int quantNegNum;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arr));
        biggestVal = biggestValue(arr);
        System.out.printf("The biggest value in array is: %d\n", biggestVal);
        sumArrPos = sumArrPos(arr);
        System.out.printf("Sum of positive numbers in array is: %d\n", sumArrPos);
        quantNegNum = quantNegNum(arr);
        System.out.printf("Quantity of negative numbers in array is: %d\n", quantNegNum);
        quantPosNegVal(arr);

    }

    public static int biggestValue(int[] arr) {
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (biggest < arr[i]) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

    public static int sumArrPos(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int quantNegNum(int[] arr) {
        int quant = 0;
        for (int i : arr) {
            if (i < 0) {
                quant++;
            }
        }
        return quant;
    }

    public static void quantPosNegVal(int[] arr) {
        int quantPosNums = 0;
        int quantNegNums = 0;
        for (int i : arr) {
            if (i > 0) {
                quantPosNums++;
            }
            if (i < 0) {
                quantNegNums++;
            }
        }
        if (quantPosNums > quantNegNums) {
            System.out.println("There are more positive values in the array");
        } else if (quantPosNums < quantNegNums) {
            System.out.println("There are more negative values in the array");
        } else System.out.println("There are an equal number of positive and negative values in the array");
    }




}









