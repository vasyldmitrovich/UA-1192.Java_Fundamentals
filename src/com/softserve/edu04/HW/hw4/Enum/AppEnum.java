package com.softserve.edu04.HW.hw4.Enum;

import java.util.Scanner;

public class AppEnum {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// Nice this is nice
        hw1();
        hw2();
        hw3();
        hw4();
    }

    public static void hw1() {
        System.out.println("Enter three float numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        if ((Math.abs(num1) <= 5) && (Math.abs(num2) <= 5) && (Math.abs(num3) <= 5)) {
            System.out.println("All three numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }

    public static void hw2() {
        System.out.println("Enter three integer numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Determine the maximum and minimum values
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println(" Maximum value: " + max);
        System.out.println(" Minimum value: " + min);

    }

    public static void hw3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an HTTP error code:");
        int errorCode = scanner.nextInt();
        HTTPError error = HTTPError.getByCode(errorCode);
        System.out.println("Enter error" + errorCode + ":" + error.getName());
    }

    public static void hw4(){
        Dog dog1 = new Dog("Fox","LABRADOR", 5);
        Dog dog2 = new Dog("Max", "PUG", 4);
        Dog dog3 = new Dog("Bella","BULLDOG", 7);

        if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) || dog3.getName().equals(dog1.getName())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");

            Dog oldestDog = dog1;
            if (dog2.getAge() > oldestDog.getAge()) {
                oldestDog = dog2;
            }
            if (dog3.getAge() > oldestDog.getAge()) {
                oldestDog = dog3;
            }

            System.out.println("The oldest dog is " + oldestDog.getName() + " (" + oldestDog.getBreed() + ").");
        }


    }
}
