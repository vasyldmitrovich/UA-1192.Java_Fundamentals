package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task121 {

    public static void execute(){
        double a;
        double b;

        System.out.println("Please enter first value:");
        a = scan();
        System.out.println("Please enter second value:");
        b = scan();

        System.out.println("Result of division is = " + div(a,b));

    }

    public static double div(double a, double b){
        double result = 0;
        try {
            result = a/b;
        }catch (ArithmeticException exception){
            exception.printStackTrace();
        }
        return result;
    }

    public static double scan(){
        Scanner scanner = new Scanner(System.in);
        double output;

        try{
            output = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value entered. Please try again");
            return scan();
        }

        return output;

    }
}
