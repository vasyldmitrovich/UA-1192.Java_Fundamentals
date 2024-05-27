package com.softserve.edu09.pt;


public class Task92 {
/*
Suppose, the user enters a set of numbers as a single string "1, 2, 3, 4, 4, 5, 6, 6, 7, 8" from
the console (can be other numbers):
• Remove of duplicate elements in a string.
• Output the result to the console.
 */

    public static void execute() {
//        String input = "1, 6, 5, 4, 8, 10, 6, 5, 9, 1, 7, 13";
        String input = "1,1,1,11,111,1111, 11111, 0, 0";

        System.out.println("Remove duplicate numbers from the string: \"" + input + "\"");
        System.out.println("Result: " + DuplicateRemover.remove(StringToIntParser.parse(input)));
    }

}
