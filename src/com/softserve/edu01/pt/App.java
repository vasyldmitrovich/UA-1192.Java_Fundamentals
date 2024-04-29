package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Write 3 strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        System.out.println("Reserved strings:");
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }

    public static void task2() {
        System.out.println("Print 3 numbers:");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of 3 numbers:" + avg);
    }

    public static void task3() {
        System.out.println("Print number a:");
        int a = sc.nextInt();
        System.out.println("Print number b:");
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a*b;
        double div = (double) a/b;
        System.out.println("Result of addition:" + add);
        System.out.println("Result of subtraction:" + sub);
        System.out.println("Result of multiply:" + mul);
        System.out.println("Result of division:" + div);
    }

    public static void task4() {
        System.out.println("How are you?");
        String answer = sc.next();
        System.out.println("You are " + answer);
    }
}
