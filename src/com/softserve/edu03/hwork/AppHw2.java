package com.softserve.edu03.hwork;

import java.util.Scanner;

public class AppHw2 {
    public static void main(String[] args) { // Spaces do not forget
    int first = getNumber2("Input the first number: ");

    int second = getNumber2("Input the second number: ");

    int third = getNumber2("Input the third number: ");

    int smallest = findSmallest(first, second, third);
    System.out.println("The smallest number is: " + smallest);
}

    private static int getNumber2(String prompt) {//Ok
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }

    private static int findSmallest(int first, int second, int third) {
        int smallest = (int) Math.min(first, Math.min(second, third)); // (int) do not need because min() return int
        return smallest;
    }
}
