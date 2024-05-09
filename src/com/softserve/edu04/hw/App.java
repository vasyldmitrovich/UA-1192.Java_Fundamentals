package com.softserve.edu04.hw;

import com.softserve.edu04.pt.Continents;

import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        App.task1();
//        App.task2();
//        App.task3();

    }

    public static void task1() {
        System.out.println("Input three float numbers!");
        System.out.print("Input first number: ");
        float first = scanner.nextFloat();
        System.out.print("Input second number: ");
        float second = scanner.nextFloat();
        System.out.print("Input third number: ");
        float third = scanner.nextFloat();

        if ((first >= -5.0f) && (first <= 5.0f) && (second >= -5.0f) && (second <= 5.0f) && (third >= -5.0f) && (third <= 5.0f)){
            System.out.print("These numbers belong to the range [-5, 5] ");
        }
            else {
            System.out.print("Not all numbers belong to the range [-5, 5] ");
        }
    }


    public static void task2() {
        System.out.println("Input three integer numbers!");
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input third number: ");
        int third = scanner.nextInt();

        if ((first > second) && (first > third)){
            System.out.println("First number " + first + " is MAX");
        }
            else if ((first < second) && (second > third)){
            System.out.println("Second number " + second + " is MAX");
        }
            else System.out.println("Third number " + third + " is MAX");

        if ((first < second) && (first < third)){
            System.out.println("First number " + first + " is MIN");
        }
        else if ((first > second) && (second < third)){
            System.out.println("Second number " + second + " is MIN");
        }
        else System.out.println("Third number " + third + " is MIN");
    }


    public static void task3() {
        HTTPError httpError;

        System.out.print("Input a number an HTTP error: ");
        String number = scanner.nextLine();

        httpError = switch (number) {
            case "400" -> HTTPError.Bad_Request;
            case "401" -> HTTPError.Unauthorized;
            case "402" -> HTTPError.Payment_Required;
            case "403" -> HTTPError.Forbidden;
            case "404" -> HTTPError.Not_Found;
            default -> HTTPError.Undefined;
        };
        System.out.println("The number an HTTP error: " + number + " is " + httpError);
    }


}

