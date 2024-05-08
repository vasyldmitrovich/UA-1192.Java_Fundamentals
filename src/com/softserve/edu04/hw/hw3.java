package com.softserve.edu04.hw;
import java.util.Scanner;
import java.util.logging.XMLFormatter;
//hw

public class hw3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of HTTP error");
        int numberOfHttp = scanner.nextInt();
        HttpError error = HttpError.getHttp(numberOfHttp);
        System.out.println("This code " + numberOfHttp + " related to " + error);
    }
}

enum HttpError {
    INFORMATIONAL, SUCCESS, REDIRECTION, CLIENT_ERROR, SERVER_ERROR;

    public static HttpError getHttp (int number){
        return switch (number) {
            case 100,101,102,105 -> INFORMATIONAL;
            case 200, 201,202,203,204,205,206,207,208,226 -> SUCCESS;
            case 301,302,303,304,305,306,307,308 -> REDIRECTION;
            case 400, 401,402,403,404,405,406,407,408,409,410 -> CLIENT_ERROR;
            case 500, 501, 502, 503, 504, 505, 507, 509, 510, 511, 520, 521,522, 523,524 -> SERVER_ERROR;

            default -> throw new IllegalStateException("Unexpected value: " + number);

        };
    }
    }
