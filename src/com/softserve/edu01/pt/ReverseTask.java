package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class ReverseTask {

    public static void makeReversion(Scanner scanner) throws IOException {

        System.out.println("Input first line:");
        String firstLine = scanner.nextLine();
        System.out.println("Input second line:");
        String secondLine = scanner.nextLine();
        System.out.println("Input third line:");
        String thirdLine = scanner.nextLine();

        System.out.println("\nReverse order:");
        System.out.println(thirdLine);
        System.out.println(secondLine);
        System.out.println(firstLine);
    }
}
