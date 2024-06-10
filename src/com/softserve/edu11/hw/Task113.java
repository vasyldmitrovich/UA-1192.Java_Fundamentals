package com.softserve.edu11.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task113 {

    public static void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text containing several instances of US currency");
//        String text = "$1.12 $$111..123 $0..0 123$123.15.0 $121321.00";
        String text = scanner.nextLine();
        Set<String> matches = new HashSet<>();
        Arrays.stream(text.split(" ")).forEach(element-> {
            if(usCurrencyMatcher(element)) matches.add(element);
        });
        System.out.println("Occurrences of Us currency: " + matches);
        scanner.close();
    }

    private static boolean usCurrencyMatcher(String currency){
        String currencyPattern = "^\\${1}\\d+.{1}\\d{2}$";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(currency);
        return matcher.matches();
    }

}
