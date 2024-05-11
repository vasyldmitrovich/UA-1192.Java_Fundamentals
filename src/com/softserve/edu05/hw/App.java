package com.softserve.edu05.hw;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Enter number of the month(1-12): ");
        int monthNumber = sc.nextInt();
        int daysInMonth = Task1Months.task1Months(monthNumber);
        System.out.println("There are " + daysInMonth + " days in this month");

        Scanner sc = new Scanner(System.in);
        int[] numbersArray = new int[10];
        System.out.println("Enter 10 int numbers: ");

        for (int i = 0; i < 10; i++) {
            numbersArray[i] = sc.nextInt();
        }
        int result = Task1SumProduct.task1SumProduct(numbersArray);
        System.out.println("The result is:  " + result);

        int[] numbersArray2 = new int[5];
        System.out.println("Enter 5 int numbers: ");
        for (int i = 0; i < 5; i++) {
            numbersArray2[i] = sc.nextInt();
        }
        System.out.println("Position of the second positive num is: " + Task1FiveIntegers.findSecondPositive(numbersArray2));
        System.out.println("Minimum value is " + Task1FiveIntegers.findMin(numbersArray2) + ", his position is: " + Task1FiveIntegers.findMinPos(numbersArray2));
        System.out.println("Product of all entered even nums: " + Task1FiveIntegers.findEvenProduct(numbersArray2));


    }
    public static void task2() {

        boolean choice;
        do {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();


            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
            System.out.println("Do you wand to repeat operation? (yes/no)");

            String answer = sc.next();
            choice = answer.equalsIgnoreCase("YES");

        } while (choice);
        System.out.println("End of the program!");
    }

    public static void task3() {
            Car[] cars = {
                    new Car("Sedan", 2012, 2.5),
                    new Car("Coupe", 2015, 2.5),
                    new Car("Hatchback", 2018, 1.8),
                    new Car("Truck", 2016, 3.0)

            };
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the year of model: ");
            int yearOfModel = sc.nextInt();
            boolean found = false;

            for (var car : cars) {
                if (car.getYearOfProduction() == yearOfModel) {
                    System.out.println("Car made in " + yearOfModel + ": " + car);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("There are no cars made in " + yearOfModel);
            }
            Car.sort(cars);
            System.out.println("Sorted list of cars: ");
            for (var car : cars) {
                System.out.println(car);
            }
    }

    public static void task4() {
        int randomNum = (int) (Math.random()*10) + 1;
        System.out.println("Try to guess number in range 1-10: ");
        int usersNum;
        boolean success = false;
        do {
            usersNum = sc.nextInt();
            if(usersNum == randomNum) {
                success = true;
                System.out.println("You guessed the number!");
            } else {
                if(usersNum > randomNum) {
                    System.out.println("Too high, try again");
                } else {
                    System.out.println("Too low, try again");
                }
            }
        } while (!success);
    }
}
