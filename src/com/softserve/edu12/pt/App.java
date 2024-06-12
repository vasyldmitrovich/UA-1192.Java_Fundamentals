package com.softserve.edu12.pt;

import com.softserve.edu12.pt.Plant.Plant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");
    }

    public static void practicalTask1() {
        int a = 0;
        int b = 0;

        System.out.println("Enter the first value");
        try {
            a = sc.nextInt();
            System.out.println("Enter the second value");
            b = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered non-numeric value");
            System.exit(0);
        }

        try {
            System.out.println("The area of square rectangle is " + squareRectangle(a, b));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Error: at least one of the parameters has a negative value");
        }

        return a * b;
    }

    public static void practicalTask2() {
        int count = 0;
        int size = 0;
        String color;
        String type;
        Plant [] plants = new Plant[5];

        while (count != 5) {
            System.out.println("Enter the size of your plant. The size must be in range from 1 to 20");

            try {
                size = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("You enter non-number size");
            }

            System.out.println("Enter the color of your plant. Possible colors is: " + "\n"
                    + "White, Yellow, Blue, Red, Green");
            color = sc.nextLine();

            System.out.println("Enter the type of your plant. Possible types is: " + "\n"
                    + "Cactus, Rose, Orchids, Lavender, Lily");
            type = sc.nextLine();

            plants [count] = new Plant(size, color, type);
            count++;
        }

        for (Plant item: plants) {
            System.out.println(item.toString());
        }
    }
}
