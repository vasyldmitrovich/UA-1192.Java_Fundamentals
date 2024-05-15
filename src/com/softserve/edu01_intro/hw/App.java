package com.softserve.edu01_intro.hw;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String some_var = "BIG";
        System.out.println("Variable sss is: " + some_var);
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

    public static void task3() {
        System.out.println("It is task 3");
    }
}

