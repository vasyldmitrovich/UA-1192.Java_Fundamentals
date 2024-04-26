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
        task3();
    }

    public static void task1() throws IOException {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        String age = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age);

        //HW task 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius, perimeter, area;

        System.out.println("Input radius:");
        radius = Integer.parseInt(br.readLine());

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }

    public static void task2() throws IOException {
        System.out.println("Input first string");
        String first = scanner.nextLine();

        System.out.println("Input second string");
        String second = scanner.nextLine();

        System.out.println("Input third string");
        String third = scanner.nextLine();

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);

        //HW task 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();

        System.out.println("Where do you live? " + name);
        String address = br.readLine();

        System.out.println("Hello " + name);
        System.out.println("You live in " + address);
    }

    public static void task3() {
        System.out.println("It is task 3");
    }
}

