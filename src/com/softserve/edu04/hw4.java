package com.softserve.edu04;

import java.util.Scanner;

public class hw4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
         System.out.println("Enter three float numbers:");

    float num1 = scanner.nextFloat();
    float num2 = scanner.nextFloat();
    float num3 = scanner.nextFloat();

        if (isWithinRange(num1) && isWithinRange(num2) && isWithinRange(num3)) {
        System.out.println("All numbers belong to the range [-5, 5].");
    } else {
        System.out.println("Not all numbers belong to the range [-5, 5].");
    }
}

private static boolean isWithinRange(float num) {
    return num >= -5 && num <= 5;
}
    public static void task2() {
  System.out.println("Enter three integer numbers:");

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    int max = Math.max(num1, Math.max(num2, num3));
    int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
}

    enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found"),
        ERROR_405("Method Not Allowed"),
        ERROR_406("Not Acceptable"),
        ERROR_407("Proxy Authentication Required"),
        ERROR_408("Request Timeout"),
        ERROR_409("Conflict"),
        ERROR_410("Gone"),
        ERROR_411("Length Required"),
        ERROR_412("Precondition Failed"),
        ERROR_413("Payload Too Large"),
        ERROR_414("URI Too Long"),
        ERROR_415("Unsupported Media Type"),
        ERROR_416("Range Not Satisfiable"),
        ERROR_417("Expectation Failed");

        private final String errorMessage;

        HTTPError(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
    public static void task3() {
        System.out.print("Enter HTTP error code: ");
    int errorCode = scanner.nextInt();

    HTTPError[] errors = HTTPError.values();
    boolean found = false;
        for (HTTPError error : errors) {
        if (errorCode == Integer.parseInt(error.name().substring(6))) {
            System.out.println("Error " + errorCode + ": " + error.getErrorMessage());
            found = true;
            break;
        }
    }

        if (!found) {
        System.out.println("Error " + errorCode + ": Unknown HTTP error");
    }
}



}





