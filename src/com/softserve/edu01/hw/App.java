package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        App.task1();
        task2();
        firsttask();
        secondtask();
        thirdtask();
        fourthtask();
        homework1();
        homework2();
        homework3();

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

    public static void firsttask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text: ");
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        System.out.println("Output text: ");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
    public static void secondtask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Input second number: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Input third number: ");
        int d = Integer.parseInt(br.readLine());

        System.out.println("Average is: " + (a + b + d)/3);
    }
    public static void thirdtask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Input second number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Sum is: " + (a + b));
        System.out.println("Difference is: " + (a - b));
        System.out.println("Product is: " + (a * b));
        System.out.println("Denominator is: " + (a / b));

    }
    public static void fourthtask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you? ");
        String a = br.readLine();

        System.out.println("You are " + a);
    }
    public static void homework1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the radius: ");
        float a = Integer.parseInt(br.readLine());

        System.out.println("Perimeter is: " + 2 * 3.14 * a);
        System.out.println("Area is: " + 3.14 * (a * a));
    }
    public static void homework2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you? ");
        String a = br.readLine();

        System.out.println("You are " + a);
    }
    public static void homework3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input cost per minute of the first call: ");
        float c1 = Integer.parseInt(br.readLine());
        System.out.println("Input cost per minute of the second call: ");
        float c2 = Integer.parseInt(br.readLine());
        System.out.println("Input cost per minute of the third call: ");
        float c3 = Integer.parseInt(br.readLine());

        System.out.println("Input duration in minutes of the first call: ");
        float t1 = Integer.parseInt(br.readLine());
        System.out.println("Input duration in minutes of the second call: ");
        float t2 = Integer.parseInt(br.readLine());
        System.out.println("Input duration in minutes of the third call: ");
        float t3 = Integer.parseInt(br.readLine());

        System.out.println("Cost of the first call: " + (c1 * t1));
        System.out.println("Cost of the second call: " + (c2 * t2));
        System.out.println("Cost of the third call: " + (c3 * t3));
        System.out.println("The total cost: " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));


    }

}




