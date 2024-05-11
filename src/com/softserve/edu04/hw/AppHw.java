package com.softserve.edu04.hw;

import java.util.Scanner;

public class AppHw {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////////");
        firstHw();
        System.out.println("/////////////////////////////////////////////////////////");
        secondHw();
        System.out.println("/////////////////////////////////////////////////////////");
        ThirdHw();
        System.out.println("/////////////////////////////////////////////////////////");
        FourthHw();
        System.out.println("/////////////////////////////////////////////////////////");
        fifthhw();

    }

    public static void firstHw() {
        float first = getNumber("Enter the first float number");
        float second = getNumber("Enter the second float number");
        float third = getNumber("Enter the third float number");

        if ((-5 <= first && first <= 5) && (-5 <= second && second <= 5) && (-5 <= third && third <= 5)) {
            System.out.println("All numbers belong to the interval [-5; 5]");
        } else {
            System.out.println("Not all numbers belong to the interval [-5; 5]");
        }
    }

    public static void secondHw() {
        int first = getNumberInt("Enter the first integer number");
        int second = getNumberInt("Enter the second integer number");
        int third = getNumberInt("Enter the third integer number");

        findMaxMin(first, second, third);
    }

    public static void ThirdHw() {
        int number = getNumberInt("Input a number representing  an HTTP error");

        if (number >= 400 && number <= 410) {
            System.out.println("Error number " + number + " " + HTTPError.valueOf("ERROR_" + number).getName());
        } else {
            System.out.println("Unknown error");
        }
    }

    public static void FourthHw() {
        scanner.nextLine();
        System.out.println("Enter the season");
        String season = scanner.nextLine().toLowerCase();

        System.out.println("Enter the number of student");
        int numberStud = scanner.nextInt();

        switch (season) {
            case "winter": {
                Faculty faculty2 = new Faculty(numberStud, Faculty.Season.WINTER);
                System.out.println("The quantity of students this faculty:" + faculty2.getNumberStud());
                System.out.println("The current period:" + faculty2.getCurrentSeason());
                break;
            }
            case "spring": {
                Faculty faculty3 = new Faculty(numberStud, Faculty.Season.SPRING);
                System.out.println("The quantity of students this faculty:" + faculty3.getNumberStud());
                System.out.println("The current period:" + faculty3.getCurrentSeason());
                break;
            }
            case "summer": {
                Faculty faculty4 = new Faculty(numberStud, Faculty.Season.SUMMER);
                System.out.println("The quantity of students this faculty:" + faculty4.getNumberStud());
                System.out.println("The current period:" + faculty4.getCurrentSeason());
                break;
            }
            case "autumn": {
                Faculty faculty = new Faculty(numberStud, Faculty.Season.AUTUMN);
                System.out.println("The quantity of students this faculty:" + faculty.getNumberStud());
                System.out.println("The current period:" + faculty.getCurrentSeason());
                break;
            }
            default: {
                System.out.println("You entered wrong season");
                break;
            }
        }

    }

    public static void fifthhw() {
        Dog[] dogs = new Dog[6];

        dogs[0] = new Dog("Jora", Breed.HUSKY, 2);
        dogs[1] = new Dog("Judy", Breed.MOPS, 8);
        dogs[2] = new Dog("Petya", Breed.POODLE, 25);
        dogs[3] = new Dog("Bim", Breed.BULLDOG, 5);
        dogs[4] = new Dog("Kek", Breed.LABRADOR, 10);
        dogs[5] = new Dog("Bim", Breed.POODLE, 15);

        Dog.findOlderDog(dogs);
        Dog.findSameName(dogs);
    }

    public static float getNumber(String msg) {
        System.out.println(msg);
        return scanner.nextFloat();
    }

    public static int getNumberInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static void findMaxMin(int first, int second, int third) {
        int max = first;
        int min = first;

        if ((max < second && second > third)) {
            max = second;
        } else if ((max < third && third > second)) {
            max = third;
        }
        if ((min > second && second < third)) {
            min = second;
        } else if ((min > third && third < second)) {
            min = third;
        }

        System.out.println("Your max value is:" + max);
        System.out.println("Your min value is:" + min);
    }


}
