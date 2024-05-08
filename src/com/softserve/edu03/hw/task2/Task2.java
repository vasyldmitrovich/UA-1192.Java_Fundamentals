package com.softserve.edu03.hw.task2;
import java.util.Scanner;

public class Task2 {// All is good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input the second number");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input the third number");
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println("The smallest number is " + GetSmallestNumber(num1, num2, num3));
    }

    public static int GetSmallestNumber(int num1, int num2, int num3){
        return Math.min(Math.min(num1,num2), num3);
    }
}
