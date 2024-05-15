package com.softserve.edu05.hw;
import java.util.Scanner;


public class DoWhile {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {

        int result;
        int response;

        do {
            System.out.println("Input two value");

            int first = scanner.nextInt();
            int second = scanner.nextInt();
            result = first + second;

            System.out.println("Your sum = " + result);
            System.out.println("Press [1] to do it again, to exit enter another number");
            response = scanner.nextInt();

        } while (response == 1);
    }
}
