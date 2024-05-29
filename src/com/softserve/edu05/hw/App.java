package com.softserve.edu05.hw;
import org.junit.*;

import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MonthDaysCalculator();
        TenNum();
        FiveNum();
        Car();
        GuessNum();

    }
    public static void MonthDaysCalculator() {
    int[] daysIsMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Введіть номер місяця (1-12): ");
    int monthNumber = scanner.nextInt();

        if (monthNumber<1 ||monthNumber>12) {
        System.out.println("Невірний номер місяця");
    }
        else {
        int days=daysIsMonth[monthNumber-1 ];
        System.out.println("Кількість днів у місяці"+monthNumber +":"+ days);

    }

}
    public static void TenNum(){
            int sum = 0;
            int product = 1;
            boolean isPozitive = true;

            System.out.println("Enter 10 numbers");
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                if (arr[i] < 0) {
                    isPozitive = false;
                    break;
                }
                sum += arr[i];
            }

            if (isPozitive) {
                System.out.println("The sum of the first 5 value " + sum);
            } else {
                for (int i = arr.length - 1; i >= arr.length - 5; i--) {
                    product *= arr[i];
                }
                System.out.println("The product of last 5 value " + product);
            }
    }
    public static void FiveNum() {
        int[] num = new int[5];
        num[0] = 12;
        num[1] = 52;
        num[2] = 37;
        num[3] = 18;
        num[4] = 67;
        int res = num[2] + num[3];
        float[] num2 = new float[]{5f, 6.2f, 8f, 4.7f, 12};

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Element:" + num2[i]);
        }
}

    public static void Car() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", 2018, 2.0));
        cars.add(new Car("Sedan", 2017, 1.8));
        cars.add(new Car("Hatchback", 2020, 1.6));
        cars.add(new Car("Truck", 2019, 3.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of production to search: ");


        int searchYear = scanner.nextInt();

        System.out.println("Cars produced in " + searchYear + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == searchYear) {
                System.out.println(car.getType() + " - Engine Capacity: " + car.getEngineCapacity());
            }
        }

        Collections.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car.getType() + " - Year: " + car.getYearOfProduction());
        }
    }
    public static void GuessNum(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have picked a number between 1 and 100. Can you guess it?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
        scanner.close();
    }
}


