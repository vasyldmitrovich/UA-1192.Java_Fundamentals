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

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;


        double totalCost = cost1 + cost2 + cost3;


        System.out.println("25: " + cost1);
        System.out.println("14: " + cost2);
        System.out.println("67: " + cost3);
        System.out.println("106: " + totalCost);


        scanner.close();
        Scanner scanner1 = new Scanner(System.in);
        String name, address;

        System.out.println("What is your name ?");
        name = scanner.nextLine();

        System.out.println("Whare do you live, " + "name" + "?");
        address = scanner.nextLine();

        System.out.println("name : " + name);
        System.out.println("address : " + address);

        scanner.close();
        System.out.println("My:");
        String line1 = scanner.nextLine();

        System.out.println("first:");
        String line2 = scanner.nextLine();

        System.out.println("program:");
        String line3 = scanner.nextLine();


        System.out.println("program)" + ":");
        System.out.println(reverse(line1));
        System.out.println("first)" + ":");
        System.out.println(reverse(line2));
        System.out.println("my)" + ":");
        System.out.println(reverse(line3));


        scanner.close();
    }

    private static String reverse(String line1) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?: ");
        String answer = scanner.nextLine();
        System.out.println("you: " + answer);

        Scanner scanner = new Scanner(System.in);
        System.out.println("input perimetr of flowered: ");
        double perimetr = sc.nextDouble();

        double perimetr1 = 2 * Math.PI * perimetr;

        double area = Math.PI * perimetr * perimetr;

        System.out.println("perimetr of circle: " + perimetr1);
        System.out.println("perimetr of area: " + area);

        System.out.println("input value a: ");
        int a = sc.nextInt();
        System.out.println("input value b: ");
        int b = sc.nextInt();

        int s = a + b;
        int d = a - b;
        int p = a * b;
        int q = a / b;

        System.out.println("sum a and b: " + s);
        System.out.println("difference a and b: " + d);
        System.out.println("product a and b: " + p);
        System.out.println("quotient a and b: " + q);

        return new StringBuilder(line1).reverse().toString();

    }
}

