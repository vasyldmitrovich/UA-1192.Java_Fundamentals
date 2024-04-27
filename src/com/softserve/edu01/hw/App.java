package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class App {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String method = "";
        do {
            printReadMe();
            try {
                method = reader.readLine();
            } catch (IOException e) {
                //do noting
            }
            switch (method) {
                //hw1
                case "1":
                    calculateCirclePerAndAria();
                    break;
                //hw2
                case "2":
                    askAndAnswerTheQuestion();
                    break;
                //hw3
                case "3":
                    calculateCallPrice();
                    break;
                default:
                    System.out.println("Wrong number, try again :)");
                    break;
            }
        } while (true);
    }


    private static void printReadMe() {
        System.out.println("Chose you method");
        System.out.println("1 - for calculate perimeter and area of circle");
        System.out.println("2 - for ask and answer a question");
        System.out.println("3 - for calculate call cost");
    }

    private static void calculateCirclePerAndAria() {
        System.out.println("Enter circle radius");
        double radius = 0;
        try {
            radius = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            //do nothing
        }
        //    Area of a circle = πr. The perimeter of a circle = 2πr
        System.out.println("Circle aria: " + Math.PI * radius);
        System.out.println("Circle perimeter: " + (2 * (Math.PI * radius)));
    }

    private static void askAndAnswerTheQuestion() {
        String name, address;
        try {
            System.out.println("What is your name?");
            name = reader.readLine();
            System.out.println(String.format("Where do you live, %s ?", name));
            address = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("You are %s and tou are live in ", name, address));
    }

    private static void calculateCallPrice() {
        int c1, c2, c3, t1, t2, t3 = 0;
        Integer[] callsCost = enterValues(" call costs ");
        c1 = callsCost[0];
        c2 = callsCost[1];
        c3 = callsCost[2];

        Integer[] callsDuration = enterValues(" call duration");
        t1 = callsDuration[0];
        t2 = callsDuration[1];
        t3 = callsDuration[2];

        System.out.println("Call 1 " + (c1 * t1));
        System.out.println("Call 2 " + (c2 * t2));
        System.out.println("Call 3 " + (c3 * t3));

        System.out.println("Total:  " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));

    }

    private static Integer[] enterValues(String valueName) {
        System.out.println(String.format("Enter three %s :", valueName));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            //do nothing
        }
        String[] parts = Objects.requireNonNull(input).split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input data.");
        }
        Integer[] integerParts = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = String.valueOf(Integer.parseInt(parts[i]));
        }
        return integerParts;
    }
}

