package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        floatCheck();
        defMaxMin();
        httpError();
        facultyInformation();
        dogCompare();
    }

    public static void floatCheck() {
        System.out.println("Enter three float numbers:");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        if ((x >= -5 && x <= 5) && (y >= -5 && y <= 5) && (z >= -5 && z <= 5)) {
            System.out.println("Numbers belong to the range [-5;5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5;5]");
        }
    }

    public static void defMaxMin() {
        System.out.println("Enter three integer numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int max = x;
        int min = x;

        if (y >= max && (max = y) < z) {
            max = z;
        } else if (max < z) {
            max = z;
        }
        if (y <= min && (min = y) > z) {
            min = z;
        } else if (min > z) {
            min = z;
        }

        System.out.println("Maximum is :" + max + ", minimum is :" + min);
    }

    public static void httpError() {
        System.out.println("Enter the number of HTTP error : ");
        int error = scanner.nextInt();
        HTTPError httpError = null;

        switch (error) {
            case 400 -> httpError = HTTPError.E400;
            case 401 -> httpError = HTTPError.E401;
            case 402 -> httpError = HTTPError.E402;
            case 403 -> httpError = HTTPError.E403;
            case 404 -> httpError = HTTPError.E404;
            case 405 -> httpError = HTTPError.E405;
            case 406 -> httpError = HTTPError.E406;
            case 407 -> httpError = HTTPError.E407;
            case 408 -> httpError = HTTPError.E408;
            case 409 -> httpError = HTTPError.E409;
            default ->
                System.out.println("I dont know what is error");

        }
        System.out.println("HTTP error " + error + " is " + httpError);
    }

    public static void facultyInformation() {
        Faculty faculty1 = new Faculty();
        int numberOfStudents = faculty1.setNumber("Enter number of students of faculty1 : ");
        faculty1.setNumberOfStudents(numberOfStudents);
        faculty1.setCurrentSeason(Season.AUTUMN);

        Faculty faculty2 = new Faculty();
        numberOfStudents = faculty2.setNumber("Enter number of students of faculty2 : ");
        faculty2.setNumberOfStudents(numberOfStudents);
        faculty2.setCurrentSeason(Season.WINTER);

        Faculty faculty3 = new Faculty();
        numberOfStudents = faculty3.setNumber("Enter number of students of faculty3 : ");
        faculty3.setNumberOfStudents(numberOfStudents);
        faculty3.setCurrentSeason(Season.SPRING);

        Faculty faculty4 = new Faculty();
        numberOfStudents = faculty4.setNumber("Enter number of students of faculty4 : ");
        faculty4.setNumberOfStudents(numberOfStudents);
        faculty4.setCurrentSeason(Season.SUMMER);

        System.out.println("Information about faculties");
        System.out.println("Faculty1 : " + faculty1);
        System.out.println("Faculty2 : " + faculty2);
        System.out.println("Faculty3 : " + faculty3);
        System.out.println("Faculty4 : " + faculty4);
    }

    public static void dogCompare() {
        Dog dog1 = new Dog("Riki", 3, Breed.AKITA);
        Dog dog2 = new Dog("Shinka", 9, Breed.CHIHUAHUA);
        Dog dog3 = new Dog("Riki", 4, Breed.TAKSA);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println(oldestDog);
    }
}
