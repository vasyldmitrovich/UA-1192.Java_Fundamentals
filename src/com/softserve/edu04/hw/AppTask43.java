package com.softserve.edu04.hw;

import java.util.Scanner;

public class AppTask43 {
/*
    Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
    program should use an enum called HTTPError to map the input number to the corresponding name of the error and
    output it.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter error code number");
        int input = scanner.nextInt();
        if (input >= 400 && input <= 410) {
            System.out.println("Error name is: " + HTTPError.valueOf("R_" + input).getName());
        } else {
            System.out.println("Unknown error");
        }
    }


}

enum HTTPError {//Good but without R_
    R_400("Bad request"), R_401("Unauthorized"), R_402("Payment required"),
    R_403("Forbidden"), R_404("Not found"), R_405("Method not allowed"),
    R_406("Not Acceptable"), R_407("Proxy authentication required"),
    R_408("Request timeout"), R_409("Conflict"), R_410("Gone");

    private String name;

    HTTPError(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}