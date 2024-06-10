package com.softserve.edu12.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task121 {

    public static void execute(){
        int a = scan();
        int b = scan();

        System.out.println("The area of a rectangle is: " + squareRectangle(a,b));

    }


    public static double squareRectangle(int a, int b){
    if (a*b<=0) throw new IllegalArgumentException("Negative or zero value entered");
    return a*b;
    }

    public static int scan(){
        Scanner scanner = new Scanner(System.in);
        int side;
        System.out.println("Please enter positive value:");
        try {
            side = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value entered. Please try again");
            return scan();
        }

        return side;
    }
}
