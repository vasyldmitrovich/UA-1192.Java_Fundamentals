package com.softserve.edu12_excep.hw;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
        tack2();

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
            if (b == 0) {
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

    public static void tack2() {

        int[] sortArr = readNumber(3, 43);

        Arrays.sort(sortArr);

        System.out.println(Arrays.toString(sortArr));


    }


    public static int[] readNumber(int start, int end) {

        int[] num = new int[10];
        int a = 0;

        for (int i = 0; i < num.length; i++) {
            try {

                System.out.print("Enter next number: ");
                a = SCANNER.nextInt();

                if (a <= start || a >= end) {
                    throw new ArithmeticException();

                }



            } catch (ArithmeticException e) {
                System.err.println("Wrong number, should be > " + start + " and < " + end);
                i--;
                continue;
            } catch (Exception e) {


                // не розумію чому ловлю зациклювання при введенні стринги, чому не запитує повторного введення


                System.err.println("Something went wrong");
                i--;
                continue;
            }

            num[i]= a;
        }
        return num;

    }
}
