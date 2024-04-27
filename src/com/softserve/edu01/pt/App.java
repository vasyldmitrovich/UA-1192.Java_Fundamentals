package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String method;
        do {
            printReadMe();
            try {
                method = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            switch (method) {
                //pt1
                case "1":
                    readAndReverse(reader);
                    break;
                //pt2
                case "2":
                    calculateAverage(reader);
                    break;
                //pt3
                case "3":
                    calculateOperation(reader);
                    break;
                //pt4
                case "4":
                    askAndAnswerTheQuestion(reader);
                    break;
                default:
                    System.out.println("Wrong number, try again :)");
                    break;
            }
        } while (true);
    }

    private static void printReadMe() {
        System.out.println("Chose you method");
        System.out.println("1 - for read and reverse String");
        System.out.println("2 - for calculate average");
        System.out.println("3 - for calculate operation");
        System.out.println("4 - for ask and answer a question");
    }

    private static void readAndReverse(BufferedReader reader) {
        System.out.println("Write your String for reverse");
        try {
            String[] originalString = reader.readLine().split(" ");
            System.out.println("Your reversed String");
            Arrays.stream(originalString).toList()
                    .reversed()
                    .forEach(s -> {
                        System.out.print(s + " ");
                    });
            System.out.println();
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }
    }

    private static void calculateAverage(BufferedReader reader) {
        int a, b, c = 0;
        try {
            System.out.println("Enter first number");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Enter second number");
            b = Integer.parseInt(reader.readLine());
            System.out.println("Enter third number");
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Average : " + (a + b + c) / 3);
    }

    private static void calculateOperation(BufferedReader reader) {
        int a, b = 0;
        System.out.println("Enter a mathematical operation (operand1 operator operand2):");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
//do nothing
        }
        String[] parts = Objects.requireNonNull(input).split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input format.");
        }
        a = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        b = Integer.parseInt(parts[2]);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }

    private static void askAndAnswerTheQuestion(BufferedReader reader) {
        System.out.println("How are you?");
        String answer;
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You are " + answer);
    }
}
