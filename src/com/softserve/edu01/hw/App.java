package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();

    }

    public static void task1() {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String age = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[1]);
        }

        System.out.print("\n");
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
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо вартість та тривалість кожного дзвінка з консолі
        System.out.print("25: ");
        double c1 = scanner.nextDouble();
        System.out.print("7: ");
        double t1 = scanner.nextDouble();

        System.out.print("14: ");
        double c2 = scanner.nextDouble();
        System.out.print("22: ");
        double t2 = scanner.nextDouble();

        System.out.print("67: ");
        double c3 = scanner.nextDouble();
        System.out.print("11: ");
        double t3 = scanner.nextDouble();

        // Обчислюємо вартість кожного дзвінка
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        // Обчислюємо загальну вартість
        double totalCost = cost1 + cost2 + cost3;

        // Виводимо результати на консоль
        System.out.println("25: " + cost1);
        System.out.println("14: " + cost2);
        System.out.println("67: " + cost3);
        System.out.println("106: " + totalCost);

        // Закриваємо Scanner
        scanner.close();
    }
}

