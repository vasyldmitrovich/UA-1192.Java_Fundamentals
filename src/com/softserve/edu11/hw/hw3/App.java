package com.softserve.edu11.hw.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String format = "\\$\\d+(\\.\\d{2})";
        Pattern pattern = Pattern.compile(format);
        List<String> options = new ArrayList<>();
        options.add("$12345678.99");
        options.add("$121.99");
        options.add("$2000");
        options.add("$99.99");
        options.add("$12");
        options.add("$1.999");
        for (String option : options) {
            Matcher matcher = pattern.matcher(option);
            if (matcher.matches()) {
                System.out.println("Correct format: " + option);
            } else System.out.println("\tIncorrect format: " + option);
        }

    }
}
