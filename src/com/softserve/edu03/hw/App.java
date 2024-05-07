package com.softserve.edu03.hw;

import java.util.Scanner;


public class App {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        triangle();// Good

        minimum();

        // Move this logic in some method and call this method here
        Person person1 = new Person();
        person1.input();
        Person person2 = new Person();
        person2.input();
        Person person3 = new Person();
        person3.input();
        Person person4 = new Person();
        person4.input();
        Person person5 = new Person();
        person5.input();
        System.out.println("Person1: "+person1.output());
        System.out.println("Person2: "+person2.output());
        System.out.println("Person3: "+person3.output());
        System.out.println("Person4: "+person4.output());
        System.out.println("Person5: "+person5.output());
    }

    public static void triangle() {
        System.out.println("Input side 1 : ");
        double a = scanner.nextInt();
        System.out.println("Input side 2 : ");
        double b = scanner.nextInt();
        System.out.println("Input side 3 : ");
        double c = scanner.nextInt();
        double per = (a + b + c) / 2.0;
        if (per <= a || per <= b || per <= c) {
            System.out.println("Error entered values is inadmissible");
        } else {
            double square = Math.sqrt(per * (per - a) * (per - b) * (per - c));
            System.out.printf("The area of the triangle is : %.1f%n", square);
        }
    }

    public static void minimum() {
        System.out.println("Input the first number : ");
        int k = scanner.nextInt();
        System.out.println("Input the second number : ");
        int l = scanner.nextInt();
        System.out.println("Input the third number : ");
        int t = scanner.nextInt();
        int min = Math.min(t, Math.min(k, l));
        System.out.println("The smallest number is : " + min);
    }
}
