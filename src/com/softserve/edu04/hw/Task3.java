package com.softserve.edu04.hw;
import java.util.Scanner;


 enum HTTPError {// Move to HTTPError.java file not here
    BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN,
    NOT_FOUND, METHOD_NOT_ALLOWED
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        HTTPError httpError;
        System.out.println("Enter the error code(400-405): ");

        // Do not forget spaces, make code more readable
        int code = sc.nextInt();

        if (code >= 400 && code <= 405) {
            httpError = switch (code) {
                case 400 -> HTTPError.BAD_REQUEST;
                case 401 -> HTTPError.UNAUTHORIZED;
                case 402 -> HTTPError.PAYMENT_REQUIRED;
                case 403 -> HTTPError.FORBIDDEN;
                case 404 -> HTTPError.NOT_FOUND;
                default -> HTTPError.METHOD_NOT_ALLOWED;

            };
            System.out.println(httpError);
        }
        else {
            System.out.println("Code not in range 400-405!");
        }
    }
}
