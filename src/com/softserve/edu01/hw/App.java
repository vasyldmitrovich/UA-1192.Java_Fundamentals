package com.softserve.edu01.hw;

import java.util.Scanner;

    public class App {
        public static Scanner sc  = new Scanner(System.in);
        public static void main (String[] args) {
            App.task1();
            task2();
            task3();
        }

        public static void task1() {
            System.out.println("Input radius of the circle:");
            double radius = sc.nextDouble();
            double perimeter = Math.PI * radius * 2;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);

        }

        public static void task2() {
            System.out.println("What is your name?");
            String name = sc.next();
            System.out.println("Where do you live, " + name + "?");
            String address = sc.next();
            System.out.println("Name: " + name + ", Address: " + address);
        }

        public static void task3 () {
            System.out.println("Enter cost per minute of first call: ");
            double c1 = sc.nextDouble();
            System.out.println("Enter duration of first call (minutes): ");
            double t1 = sc.nextDouble();
            System.out.println("Enter cost per minute of second call: ");
            double c2 = sc.nextDouble();
            System.out.println("Enter duration of second call (minutes): ");
            double t2 = sc.nextDouble();
            System.out.println("Enter cost per minute of third call: ");
            double c3 = sc.nextDouble();
            System.out.println("Enter duration of third call (minutes): ");
            double t3 = sc.nextDouble();

            double call1Cost = c1*t1;
            double call2Cost = c2*t2;
            double call3Cost = c3*t3;
            double totalCost = call1Cost + call2Cost + call3Cost;

            System.out.println("Cost of first call: " + call1Cost);
            System.out.println("Cost of second call: " + call2Cost);
            System.out.println("Cost of third call: " + call3Cost);
            System.out.println("Total cost: " + totalCost);
        }
    }

