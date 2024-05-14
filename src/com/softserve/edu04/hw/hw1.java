package com.softserve.edu04.hw;


import java.util.Scanner;

public class hw1 {// Rename to Hw1, name of class should start from uppercase

    private double first;
    private double second;
    private double third;

    double value;


    public hw1() {
    }

    public hw1(double a, double b, double c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public static void inRange() {// Move this method to App class
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first floating point number:");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Input second floating point number:");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Input third floating point number:");
        double c = Double.parseDouble(sc.nextLine());

        if ((a >= -5 & a <= 5) & (b >= -5 & b <= 5) & (c >= -5 & c <= 5)) {
            System.out.println("All numbers in range -5:5.");

        } else System.out.println("***Numbers aren't in range -5:5***");
    }

    public static void maxMinNum() {// And this method too
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("\nEnter 3 numbers to define max and min value: ");
        arr[0] = Integer.parseInt(sc.nextLine());
        arr[1] = Integer.parseInt(sc.nextLine());
        arr[2] = Integer.parseInt(sc.nextLine());
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int min = 0; min < arr.length; min++) {
            if (arr[min] < minValue) {
                minValue = arr[min];
            }
            for (int max = 0; max < arr.length; max++) {
                if (arr[max] > maxValue) {
                    maxValue = arr[max];
                }
            }
        }
        System.out.println("Min values is: " + minValue + "\n" + "Max values is: " + maxValue);
    }
}



