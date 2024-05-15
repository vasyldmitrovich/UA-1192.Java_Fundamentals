package com.softserve.academy.edu04.hw;

public class HW4 {

    //1. Write a program that prompts the user to input three float numbers. The program should check if all three numbers
//    fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
//    message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
//    program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
//    includes the values -5 and 5 as well.
    public static void checkRange(float a, float b, float c) {
        if ((a >= -5 && a <= 5) && (b >= -5 && b <= 5) && (c >= -5 && c <= 5)) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }


//    2. Write a program that prompts the user to input three integer numbers. The program should determine the
//    maximum and minimum values among the three numbers and output them to the console.

    public static void findMaxMin(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Max: " + max + ", Min: " + min);
    }

//    3. Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
//    program should use an enum called HTTPError to map the input number to the corresponding name of the error and
//            output it.

    public enum HTTPError {// Move to file HTTPError.java
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403),
        NOT_FOUND(404),
        METHOD_NOT_ALLOWED(405),
        NOT_ACCEPTABLE(406),
        PROXY_AUTHENTICATION_REQUIRED(407),
        REQUEST_TIMEOUT(408),
        CONFLICT(409),
        GONE(410),
        LENGTH_REQUIRED(411),
        PRECONDITION_FAILED(412),
        PAYLOAD_TOO_LARGE(413),
        URI_TOO_LONG(414),
        UNSUPPORTED_MEDIA_TYPE(415),
        RANGE_NOT_SATISFIABLE(416),
        EXPECTATION_FAILED(417),
        IM_A_TEAPOT(418),
        MISDIRECTED_REQUEST(421),
        UNPROCESSABLE_ENTITY(422),
        LOCKED(423),
        FAILED_DEPENDENCY(424),
        TOO_EARLY(425),
        UPGRADE_REQUIRED(426),
        PRECONDITION_REQUIRED(428),
        TOO_MANY_REQUESTS(429),
        REQUEST_HEADER_FIELDS_TOO_LARGE(431),
        UNAVAILABLE_FOR_LEGAL_REASONS(451);

        private final int code;

        HTTPError(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public static void printHTTPError(int code) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == code) {
                System.out.println(error);
                return;
            }
        }
        System.out.println("Unknown error code" + code);
    }

//    4.* Create a class named Faculty and input the information about the number of students (using the console) and the
//    current season (using enum).
//    Each season must have a name in English (use the constructor).
//    In the main() method, check the correctness of the code.
//    Here, a season can signify a time of year (winter, spring, summer, autumn).
//    In the context of this task, it can correspond to a certain semester.
//    For example, autumn could be the first semester, spring -
//    the second, and summer - the vacation period. Winter may correspond to the period of winter exams.
// TODO: check in Faculty class

//5.* Create a class called Dog that has the following fields: name, breed, age.
//• Declare enum for field breed.
//            • In main() method create create three instances of type Dog.
//    o Check if there are no two dogs with the same name;
//    o Output the name and the breed of the oldest dog.
// TODO: check in Declare class
}