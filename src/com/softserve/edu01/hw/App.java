package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // task2();
        Task1();
        Task2();
        Task3();
        Task4();

    }

    public static void task1() {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String age = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    public static void task2() {
        System.out.println("Input first string");
        String first = scanner.nextLine();
        System.out.println("Input second string");
        String second = scanner.nextLine();
        System.out.println("Input third string");
        String third = scanner.nextLine();
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1");
        String string1 = scanner.nextLine();
        System.out.println("Enter 2");
        String string2 = scanner.nextLine();
        System.out.println("Enter 3");
        String string3 = scanner.nextLine();
        System.out.println("Strings in ever order:");
        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);

    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First:");
        double num1 = scanner.nextDouble();
        System.out.print("Second:");
        double num2 = scanner.nextDouble();
        System.out.print("Third:");
        double num3 = scanner.nextDouble();
        scanner.close();
        double average = (num1 + num2 + num3) / 3;
        scanner.close();
        System.out.println("The average of the three numbers is: " + average);

    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circular flower bed: ");
        double radius = 0;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter (circumference): " + perimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }
    public static void Task4() {
        String name, address;
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.nextLine();
        System.out.println("What is your name?");
        name=scanner.nextLine();
        System.out.println("Where do you Live, "+ name +"?");
        address=scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

    }

}