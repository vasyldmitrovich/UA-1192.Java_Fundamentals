package com.softserve.edu04;

import java.util.Scanner;

public class HttpEror {// What is that class???
    enum HTTPError {// Move to HTTPError.java
        BadRequest(400, "Bad Request"),
        Unauthorized(401, "Unauthorized"),
        PaymentRequired(402, "Payment Required"),
        Forbidden(403, "Forbidden"),
        NotFound(404, "Not Found"),
        MethodNotAllowed(405, "Method Not Allowed"),
        InternalServerError(500, "Internal Server Error"),
        NotImplemented(501, "Not Implemented"),
        BadGateway(502, "Bad Gateway"),
        ServiceUnavailable(503, "Service Unavailable");

        private final int errorCode;
        private final String errorName;

        HTTPError(int errorCode, String errorName) {
            this.errorCode = errorCode;
            this.errorName = errorName;
        }
        public int getErrorCode() {
            return errorCode;
        }
        public String getErrorName() {
            return errorName;
        }
    }
    public static void main(String[] args) {// Move to App.java
        Scanner sc = new Scanner(System.in);
        System.out.println("input code mistake HTTP: ");
        int errorCode = sc.nextInt();

        boolean found = false;
        for (HTTPError error : HTTPError.values()) {
            if (error.getErrorCode() == errorCode) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("unknown code mistake HTTP: " + errorCode);
        }
        sc.close();
    }
}