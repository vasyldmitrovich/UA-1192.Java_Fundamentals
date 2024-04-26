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
            FirstPracticalTask();
            SecondPracticalTask();
            ThirdPracticalTask();
            HomeworkTask1();
            HomeworkTask2();
            HomeworkTask3();
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

    public static void FirstPracticalTask() throws IOException {
        //First practical task
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2,str3;
        System.out.println("==============================");
        System.out.println("Hello! This is first practical task. \nLook at text in reverse!");
        System.out.println("Input any text:");
        str1 = br.readLine();
        System.out.println("Input any text again:");
        str2 = br.readLine();
        System.out.println("Input any text last time:");
        str3 = br.readLine();

        System.out.println("Input text:");
        System.out.println(str1 + "\n" + str2 + "\n" + str3);
        System.out.println("Text in reverse: " + str3 + " " + str2 + " " + str1);
    }

    public static void SecondPracticalTask() throws IOException{
//Second practical task
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==============================");
        System.out.println("\nOk, let's start second task. I will calculate the average");

        double firstNumber,secondNumber,thirdNumber,r;
        System.out.println("Enter first number");
        firstNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        secondNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter last number");
        thirdNumber = Integer.parseInt(br.readLine());
        r = (firstNumber+secondNumber+thirdNumber)/3;

        System.out.println("The average is: " + r);
    }

    public static void ThirdPracticalTask() throws IOException{
        //Third practical task
        double r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==============================");
        int a,b,result;
        System.out.println("\nGreat! let's go to third task. Calculating.\nInput a number for variable \"A\"");
        a = Integer.parseInt(br.readLine());
        System.out.println("\nInput a number for variable \"B\"");
        b = Integer.parseInt(br.readLine());

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b>0){
            result = a/b;
            System.out.println("a / b = " + result);
        } else {
            System.out.println("Cannot be divided by 0");
        }
    }

    public static void HomeworkTask1() throws IOException{
//Homework task 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==============================");
        System.out.println("\n\nGood. Now check my homework :)\nTask 1. Calculating perimeter and area:");

        double radius, perimeter, area;
        System.out.println("Input radius:");
        radius = Integer.parseInt(br.readLine());
        perimeter = Math.PI * radius * 2;
        area = Math.PI * radius * radius;
        System.out.println("perimeter: " + perimeter);
        System.out.println("area: " + area);
    }

    public static void HomeworkTask2() throws IOException{
        //Homework task 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==============================");
        System.out.println("\n\nDuzhe faino, teper task nomer dva. Vyvedennia imeni i adresy :)");
        String name, address;
        System.out.println("What is your name, bro?");
        name = br.readLine();

        System.out.println("Where do you live, " + name +"?");
        address = br.readLine();

        System.out.println("Your name: " + name);
        System.out.println("Your address: " + address);
    }

    public static void HomeworkTask3() throws IOException{
//Homework task 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==============================");
        System.out.println("\n\nLast one homework task. Call cost calculating.\nInput first call duration, min:");
        double c1, c2, c3, t1, t2, t3;
        t1 = Integer.parseInt(br.readLine());
        System.out.println("Input cost per minute");
        c1 = Integer.parseInt(br.readLine());

        System.out.println("\nInput second call duration, min:");
        t2 = Integer.parseInt(br.readLine());
        System.out.println("Input cost per minute");
        c2 = Integer.parseInt(br.readLine());

        System.out.println("\nInput third call duration, min:");
        t3 = Integer.parseInt(br.readLine());
        System.out.println("Input cost per minute");
        c3 = Integer.parseInt(br.readLine());

        System.out.println("\n\nFirst call cost: " + (t1*c1));
        System.out.println("Second call cost:"  + (t2*c2));
        System.out.println("Third call cost: " + (t3*c3));
        System.out.println("Total: " +(t1*c1)+(t2*c2)+(t3*c3));
    }
}



