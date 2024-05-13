package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task52 {

    public static void execute(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Result = " + calculate());
            System.out.println("Print \"yes\" if you want to repeat");
            String answer = scanner.nextLine();
            if(!answer.equalsIgnoreCase("yes")){
                break;
            }
        } while (true);

    }

    public static int calculate() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Will calculate the sum of two numbers");
        System.out.println("Enter first number");
        sum += scanner.nextInt();
        System.out.println("Enter second number");
        sum += scanner.nextInt();

        return sum;
    }
}
