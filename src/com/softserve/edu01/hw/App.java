package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        try {
            firstPracticalTask();
            secondPracticalTask();
            thirdPracticalTask();
            fourthPracticalTask();

            firstHomeTask();
            SecondtHomeTask();
            ThirdtHomeTask();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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


    public static void firstPracticalTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three words");
        System.out.println("Input text");
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        System.out.println("Output text");
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }

    public static void secondPracticalTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three numbers.");
        System.out.println("First number:");
        float number1 = Float.parseFloat(br.readLine());
        System.out.println("Second number:");
        float number2 = Float.parseFloat(br.readLine());
        System.out.println("Third number:");
        float number3 = Float.parseFloat(br.readLine());
        float avarage = (number1 + number2 + number3) / 3;
        System.out.println("Your avarage is: " + avarage);
    }

    public static void thirdPracticalTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers:");
        System.out.println("First number:");
        int number1 = Integer.parseInt(br.readLine());
        System.out.println("Second number:");
        int number2 = Integer.parseInt(br.readLine());
        System.out.println("Result a+b:" + (number1 + number2));
        System.out.println("Result a-b:" + (number1 - number2));
        System.out.println("Result a*b:" + (number1 * number2));
        System.out.println("Result a/b:" + (number1 / number2));
    }

    public static void fourthPracticalTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }

    public static void firstHomeTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of circle");
        double radius = Double.parseDouble(br.readLine());
        double area = (3.14 * Math.pow(radius, 2));
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Your area: " + area);
        System.out.println("Your perimeter: " + perimeter);
    }

    public static void SecondtHomeTask() throws IOException {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Where  do you live " + name);
        String adress = sc.nextLine();
        System.out.println("Your name is: " + name + "\nAnd you live in: " + adress);
    }

    public static void ThirdtHomeTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three  cost per minute .");
        System.out.println("First cost:");
        float c1 = Float.parseFloat(br.readLine());
        System.out.println("Second cost:");
        float c2 = Float.parseFloat(br.readLine());
        System.out.println("Third cost:");
        float c3 = Float.parseFloat(br.readLine());
        System.out.println("Please enter three  duration in minutes .");
        System.out.println("First duration:");
        float t1 = Float.parseFloat(br.readLine());
        System.out.println("Second duration:");
        float t2 = Float.parseFloat(br.readLine());
        System.out.println("Third duration:");
        float t3 = Float.parseFloat(br.readLine());
        float call1 = c1 * t1;
        float call2 = c2 * t2;
        float call3 = c3 * t3;
        System.out.println("The cost of the first call:" + call1);
        System.out.println("The cost of the second call:" + call2);
        System.out.println("The cost of the third call:" + call3);
        System.out.println("the total cost:" + (call1 + call2 + call3));
    }
}

