package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Input first string");
        String aaa = scanner.nextLine();
        System.out.println("Input second string");
        String bbb = scanner.nextLine();
        System.out.println("Input third string");
        String ccc = scanner.nextLine();
        System.out.println(ccc);
        System.out.println(bbb);
        System.out.println(aaa);
    }
    public static void task2() {
    Scanner scan = new Scanner(System.in);
        System.out.println("Пошук середньоарефметичної 3х чисел");
        System.out.println("Введіть перше число: ");
    float aaa = scan.nextFloat();
        System.out.println("Введіть друге число: ");
    float bbb = scan.nextFloat();
        System.out.println("Введіть третє число: ");
    float ccc = scan.nextFloat();
    float ave;
    ave = (aaa + bbb + ccc) / 3;
        System.out.println("Середнє число дорівнює: " + ave);

}
    public static void task3() {
    Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: a = ");
    float a = scan.nextFloat();
        System.out.print("Input second number: b = ");
    float b = scan.nextFloat();
    float res1, res2, res3, res4;
    res1 = a + b;
    res2 = a - b;
    res3 = a * b;
    res4 = a / b;
        System.out.println("a+b= " + res1);
        System.out.println("a-b= " + res2);
        System.out.println("a*b= " + res3);
        System.out.println("a/b= " + res4);
    }
    public static void task4() {
    Scanner scan = new Scanner(System.in);
        System.out.println("How are you?");
    String answer= scan.nextLine();
        System.out.print("You are " + answer);
}
}