package com.softserve.edu12_excep.hw;

import java.util.Scanner;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        task1();

    }

    public static void task1() {

        System.out.print("Enter first number: ");
        int a = SCANNER.nextInt();

        System.out.print("Enter second number: ");
        int b = SCANNER.nextInt();

        System.out.println(div(a, b));

    }

    public static double div(double a, double b) {

        double div = 0;

        try {
            if (b==0){
                throw new ArithmeticException();
            }
            div = a / b;
            return div;

        } catch (ArithmeticException e) {
            System.err.println("Division by zero");
            return 0;

        } catch (Exception e) {
            System.err.println("Something went wrong");
            return 0;
        }

    }
}
