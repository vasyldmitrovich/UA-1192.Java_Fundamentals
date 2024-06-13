package com.softserve.edu11.pt11;

public class pt1 {
    public static void main(String[] args) {
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";

        boolean result = isSubstring(str1, str2);// Good
        System.out.println(result);// Add some message not only true of false
    }

    public static boolean isSubstring(String str1, String str2) {
        return str2.contains(str1);
    }
}
