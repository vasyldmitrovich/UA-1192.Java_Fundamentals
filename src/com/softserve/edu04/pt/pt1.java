package com.softserve.edu04.pt;
import java.util.Scanner;

public class pt1 {// Name of class should start from Uppercase
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Input three numbers:");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            scanner.close();

            int count = 0;
            if (num1 % 2 != 0) {
                count++;
            }
            if (num2 % 2 != 0) {
                count++;
            }
            if (num3 % 2 != 0) {
                count++;
            }
            System.out.println("Count of odd numbers: " + count);
    }
}
