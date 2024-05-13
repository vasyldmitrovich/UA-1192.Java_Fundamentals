package com.softserve.edu04.hw.task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {// Good
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number representing an HTTP error");

        int error = scanner.nextInt();

        HTTPErrors result = switch (error) {
            case 400 -> HTTPErrors.BadRequest;
            case 401 -> HTTPErrors.Unauthorized;
            case 403 -> HTTPErrors.Forbidden;
            case 404 -> HTTPErrors.NotFound;
            case 500 -> HTTPErrors.InternalServerError;
            default -> null;
        };

        System.out.println(result);
    }
}
