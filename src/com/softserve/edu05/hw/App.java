package com.softserve.edu05.hw;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        task2();
//        task3();
        task4();
    }

    public static void task2() {

        int x = 0;
        int y = 0;
        int sum = 0;
        String repeat;

        do {
            System.out.println("Input number 1: ");
            x = SCANNER.nextInt();
            System.out.println("Input number 2: ");
            y = SCANNER.nextInt();
            SCANNER.nextLine();
            sum = x + y;
            System.out.println("Sum of numbers: " + sum);
            System.out.println("You want to perform the operation again? y/n");
            repeat = SCANNER.nextLine();


        } while (Objects.equals(repeat, "y"));
    }


    public static void task3() {

        Car[] arr = {
                new Car("Volt", 2012, 1400),
                new Car("Fiesta", 2019, 1000),
                new Car("Focus", 2022, 1500),
                new Car("Fusion", 2015, 1800),
        };

        System.out.print("Enter year in the console: ");
        int srYear = SCANNER.nextInt();

        System.out.println("Type of cars " + srYear + " year is: ");

        for (int i = 0; i < arr.length; i++) {
            if (srYear == arr[i].getYearOfProduction()) {
                System.out.println(arr[i].getType());
            }
        }
        System.out.println();
        System.out.println("Sorting cars by the field “year of production ”");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getYearOfProduction() < arr[j + 1].getYearOfProduction()) {
                    var tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (var car : arr) {
            System.out.println(car.getType() + " year of production is: " + car.getYearOfProduction() + " year. Engine capacity is " + car.getEngineCapacity());
        }
    }

    public static void task4() {
        int randomNum = (int) (Math.random() * 21); //Int random generator [0;20]

        int userNum;

        System.out.println("to guess what the number [0;20] is:  ");
        userNum = SCANNER.nextInt();


        while (randomNum != userNum) {
            if (userNum > randomNum) {
                System.out.println("Too high, try again:  ");
            } else {
                System.out.println("Too low, try again:  ");
            }
            userNum = SCANNER.nextInt();

        }
        System.out.println("!!! Congrats you are WIN!!!");
    }
}
