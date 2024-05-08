package com.softserve.edu04;

import java.util.Scanner;

public class doubleNambers {// Name of class should start from uppercase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 3 fractional numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        if(isInRange(number1) && isInRange(number2) && isInRange(number3)){
            System.out.println("all three numbers depend to the range(-5, 5).");
        }else {
            System.out.println("not all three numbers depend to the range(-5, 5).");
        }
        sc.close();

    }
    public static boolean isInRange(double number) {
        return number >= -5 && number <= 5;
    }
}
