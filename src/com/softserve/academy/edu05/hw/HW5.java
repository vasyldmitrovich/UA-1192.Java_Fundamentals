package com.softserve.academy.edu05.hw;

import com.softserve.academy.edu05.hw.test_3.Car;

import java.util.Arrays;
import java.util.Scanner;

public class HW5 {

    /**
     * Create a do-while loop that prompts the user to enter two numbers and calculates their sum.
     * After displaying the result, the program should ask the user if they want to perform the operation again.
     * If the user inputs a positive response, the loop should repeat;
     * otherwise, it should terminate.
     */
    public void task2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
            System.out.println("Do you want to perform the operation again? (yes/no)");
        } while (scanner.next().equals("yes") || scanner.next().equals("y"));
        scanner.close();
    }

    /**
     *  Create and initialize four instances of class Car.
     *       • Output result for cars:
     *       • certain model year (enter year in the console);
     *       • sorted cars by the field “year of production ”.
     */
    public Car[] task3()
    {
        Scanner scanner = new Scanner(System.in);

        Car car1 = createCar(scanner, "audi", 4.0);
        Car car2 = createCar(scanner, "bmw", 2.0);
        Car car3 = createCar(scanner, "mercedes", 2.5);
        Car car4 = createCar(scanner, "toyota", 2.0);

        Car[] cars = {car1, car2, car3, car4};
        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car.getCarInfo());
        }

        scanner.close();
        return cars;
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract("_, _, _ -> new")
    private static Car createCar(Scanner scanner, String name, double engine) {
        System.out.println("Enter year of production for " + name + ": ");
        int year = scanner.nextInt();
        return new Car(name, year, engine);
    }

    /**
     * Create a program that generates a random number and prompts to the user to guess what the number is.
     * If the user's guess is higher than the random number, the program should display "Too high, try again."
     * If the user's guess is lower than the random number, the program should display "Too low, try again."
     * The program should use a loop that repeats until the user correctly guesses the random number.
     */
    public void task4(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            guess = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number.");
        scanner.close();
    }
}
