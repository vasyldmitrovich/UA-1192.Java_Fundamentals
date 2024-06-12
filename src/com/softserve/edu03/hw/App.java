package com.softserve.edu03.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {//Make code more readable add spaces
        areaOfTriangle();
        System.out.println("End of first task");
        smallestNumber();
        System.out.println("End of second task");

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        System.out.println(person1.output());
        person2.input();
        System.out.println(person2.output());
        person3.input();
        System.out.println(person3.output());
        person4.input();
        System.out.println(person4.output());
        person5.input();
        System.out.println(person5.output());
        System.out.println("End of third task");
    }

    public static void areaOfTriangle() {//Ok
        System.out.println("Enter the value of first side of triangle");
        try {
            int a = sc.nextInt();
            System.out.println("Enter the value of second side of triangle");
            int b = sc.nextInt();
            System.out.println("Enter the value of third side of triangle");
            int c = sc.nextInt();
            double semiPerimeter = (double) (a + b + c) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.println("The area of the triangle is " + area);
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-integer value");
        }
    }

    public static void smallestNumber() {
        System.out.println("Enter the first number");
        try {
            int firstNumber = sc.nextInt();
            System.out.println("Enter the second number");
            int secondNumber = sc.nextInt();
            System.out.println("Enter the third number");
            int thirdNumber = sc.nextInt();
            if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
                System.out.println("The number " + firstNumber + " is the smallest");
            } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
                System.out.println("The number " + secondNumber + " is the smallest");
            } else {
                System.out.println("The number " + thirdNumber + " is the smallest");
            }
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-integer value");
        }
    }
}
