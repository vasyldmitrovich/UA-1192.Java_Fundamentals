package com.softserve.edu03.hw;

import com.softserve.edu03.Student;

import java.util.Scanner;

public class App {// Your code should be uncommented
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App.task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.print("Input side 1:");
        double side1 = scanner.nextDouble();
        System.out.print("Input side 2:");
        double side2 = scanner.nextDouble();
        System.out.print("Input side 3:");
        double side3 = scanner.nextDouble();

        double p = (side1 + side2 + side3) / 2;
        double square = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        System.out.println("The area of the triangle %.2f".formatted(square));
    }

    public static void task2() {
        System.out.print("Input the first number:");
        double number1 = scanner.nextDouble();
        System.out.print("Input the second number:");
        double number2 = scanner.nextDouble();
        System.out.print("Input the third number:");
        double number3 = scanner.nextDouble();

        double min = Math.min(Math.min(number1, number2), number3);

        System.out.print("The smallest number is " + min);
    }

    public static void task3() {
        Person person1 = new Person();
        Person.input(person1);
        Person person2 = new Person();
        Person.input(person2);
        Person person3 = new Person();
        Person.input(person3);
        Person person4 = new Person();
        Person.input(person4);
        Person person5 = new Person();
        Person.input(person5);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }

}
