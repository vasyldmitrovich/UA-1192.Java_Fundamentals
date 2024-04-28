package com.softserve.edu01.hw;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        App.task1();
        task2();
        task3();
        scanner.close();
    }
    // Метод для обчислення периметра і площі кругової грядки
    public static void task1() {
        System.out.println("Enter the radius of the flower bed:");
        double radius = scanner.nextDouble();
        scanner.nextLine();

        // Обчислення периметра і площі кругової грядки
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Виведення результатів на консоль
        System.out.println("The perimeter of the flower bed is: " + perimeter);
        System.out.println("The area of the flower bed is: " + area);
    }

    // Method to read name and address
    public static void task2() {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live");
        String address = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println(" You live at " + address);
    }

    // метод для обчислення вартості дзвінків
    public static void task3() {
        System.out.println("Enter the cost per minute for the first call:");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call:");
        double t1 = scanner.nextDouble();
        System.out.println("Enter the cost per minute for the second call:");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of the second call:");
        double t2 = scanner.nextDouble();
        System.out.println("Enter the cost per minute for the third call:");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the third call:");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost of the first call: " + cost1);
        System.out.println("Cost of the second call: " + cost2);
        System.out.println("Cost of the third call: " + cost3);
        System.out.println("Total cost of all calls: " + totalCost);
            }
        }
