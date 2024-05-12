package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Apphw {
    public static Scanner scanner = new Scanner(System.in);
   public static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("--------------------------First homework--------------------------");
        System.out.println("********************First task******************");
        hw1FirstTask();
        System.out.println("********************Second task******************");
        hw1SecondTask();
        System.out.println("********************Third task******************");
        Task13.goTask3();
        System.out.println("--------------------------Second homework--------------------------");
        hW2DoWhile();
        System.out.println("--------------------------Third homework--------------------------");
        hw3Car();
        System.out.println("--------------------------Fourth homework--------------------------");
        fourthHw();


    }
    public static void hw1FirstTask(){
        System.out.println("Enter the month number");
        int number = scanner.nextInt();
        Task11.GetDaysByMonth(number);
    }
    public static void hw1SecondTask(){
        int [] arr = Task12.createArr();
        Task12.sumOrProd(arr);
    }

    public static void hW2DoWhile() {
        int result;
        int userInfo;

        do {
            System.out.println("Input two value");

            int first = scanner.nextInt();
            int second = scanner.nextInt();
            result = first + second;

            System.out.println("Your sum = " + result);
            System.out.println("Send 1 if you want repeat, to exit send another number");
            userInfo = scanner.nextInt();

        } while (userInfo == 1);
    }

    public static void hw3Car() {
        Car cars[] = {
                new Car("Passenger", 2012, 500),
                new Car("Truck", 2014, 350),
                new Car("Passenger", 2013, 500),
                new Car("Truck", 2014, 180),
                new Car("Passenger", 2015, 150),
                new Car("Truck", 2016, 400),
                new Car("Truck", 2012, 600),
        };

        Car.printArr(cars);
        System.out.println("Your sorted array:");
        Car.arrSort(cars);
        Car.printArr(cars);
        System.out.println("Enter the year of manufacture of the car to search");
        int userYear = scanner.nextInt();
        Car.getCarsByYear(cars,userYear);
    }
    public static void fourthHw(){
        int userNumber;
        int number =random.nextInt(100);
        System.out.println("You didn't see it:"+number);
        System.out.println("|--------------Welcome to the Ugadayka program.--------------|");
        int counter = 0;
        do{
            counter++;
            System.out.println("Enter your number");
            userNumber = scanner.nextInt();

            if(userNumber>number){
                System.out.println("Too high, try again");
            }else if(userNumber!=number){
                System.out.println("Too low, try again");
            }
        }while (number!=userNumber);

        System.out.println("Congratulations, you guessed the number right!\n" +
                "You guessed right on the "+counter+" try.");
    }

}
