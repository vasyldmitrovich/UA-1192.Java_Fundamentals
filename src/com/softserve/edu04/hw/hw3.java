package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HTTP error code:");
        int code = scanner.nextInt();
        scanner.close();

        HTTPError httpError = mapErrorCodeToHTTPError(code);

        if (httpError != null) {
            System.out.println("HTTP Error: " + httpError.getErrorDescription());
        } else {
            System.out.println("HTTP error not found");
        }
    }

    private static HTTPError mapErrorCodeToHTTPError(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.name().endsWith("_" + errorCode)) {
                return error;
            }
        }
        return null;
    }
}


