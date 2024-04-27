package com.softserve.edu01.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class App {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            task1();
            task2();
            task3();

        }

        public static void task1() {
/*
        Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
        from the console, and output obtained results
 */
            System.out.println("Please enter value of circle's radius: ");
            double radius = readInput();
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perimeter of your circle is: " + perimeter);
            double area = Math.PI * Math.pow(radius, 2.0);
            System.out.println("Area of your circle is: " + area);

        }

        public static void task2() {
/*
        Define two String variables name and address. Output question "What is your name?"
        to the console. Read the value of name and output next question: “Where do you live,
        (name)?“ to the console. Read the value of address from the console and output the
        complete information.
 */
            System.out.println("What is your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Where do you live, " + name + "?");
            String address = scanner.nextLine();

            System.out.printf("%s, thanks for your information. Your address is %s%n", name, address);

        }

        public static void task3() {
/*
        Three phone calls were made from different countries, each with a different cost per
        minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the
        console, calculate the cost of each call and the total cost, and output the results to the
        console.
 */
            double[] costs = new double[3];
            int[] durations = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter country tariff: ");
                costs[i] = readInput() / 60;
                System.out.println("Enter call duration in seconds: ");
                durations[i] = scanner.nextInt();
            }
            double totalCost = 0;
            for (int i = 0; i < 3; i++) {
                int callNumber = i+1;
                totalCost += costs[i]*durations[i];
                System.out.println("Call number " + callNumber + " cost is: " + String.format("%.2f", costs[i]*durations[i]));
            }
            System.out.println("The total cost is: " + String.format("%.2f", totalCost));


        }


        private static double readInput() {
            scanner = new Scanner(System.in);
            double input;
            try {
                input = scanner.nextDouble();

            } catch (InputMismatchException exception) {
                System.out.println("You should enter the number, please try again: ");
                return readInput();
            }
            return input;
        }
    }
