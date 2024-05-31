package com.softserve.edu05.hw05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    private static String[] args;
    static char choice;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        MonthDaysCalculator.main(args);
        ArrayOperations.main(args);
        NumberStatistics.main(args);
    }
    public static void task2() {
 do

    {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        System.out.println("Do you want to perform the operation again? (Y/N)");
        choice = scanner.next().charAt(0);
    } while(choice =='Y'||choice =='y');

        System.out.println("Goodbye!");
}
    public static void task3() {
        Car[] cars = {
                new Car("SUV", 2019, 3.0),
                new Car("Sedan", 2018, 2.5),
                new Car("Hatchback", 2020, 1.8),
                new Car("Coupe", 2017, 2.0)
        };


        System.out.println("Cars sorted by year of production:");
        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
        for (Car car : cars) {
            System.out.println(car.getType() + " - " + car.getYearOfProduction() + " - " + car.getEngineCapacity());
        }

        System.out.println("Enter the year to filter cars:");
        int year = scanner.nextInt();
        System.out.println("Cars of year " + year + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car.getType() + " - " + car.getYearOfProduction() + " - " + car.getEngineCapacity());
            }
        }
    }
  public static void task4() {
      GuessTheNumber.main(args);
  }
}



