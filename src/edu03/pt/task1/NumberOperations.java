package edu03.pt.task1;
import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber("Enter the first number: ", scanner);
        double num2 = getNumber("Enter the second number: ", scanner);

        System.out.println("Total " + getTotal(num1, num2));
        System.out.println("Average " + getAverage(num1, num2));

        scanner.close();
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2)/2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}

