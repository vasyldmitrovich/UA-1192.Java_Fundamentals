package com.softserve.edu03.pt;
import java.util.Scanner;

public class pt1 {
    public static void main(String...args) {
    int first = getNumber("Enter the first number");
    int second = getNumber("Enter the second number");
    int sum = getTotal(first, second);
    double average = getAverage(first, second);
    System.out.println("The sum of " +first + " and "+second +" is "+sum);
    System.out.println("The average of " +first + " and " +second + " is " +average);
}

    private static int getNumber(String promt) {
        System.out.println(promt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());

    }

    private static double getAverage(int first, int second) {
        return getTotal(first, second);
    }

    private static int getTotal(int first, int second) {
      return first + second;
    }


}
