package com.softserve.edu11.hw;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreatingMachine {// Good
    private static final String VALIDATION_PATTERN = "^[a-zA-Z\\s-]+$";

    public GreatingMachine(){}

    public boolean isValid(String arg){
        Pattern pattern = Pattern.compile(VALIDATION_PATTERN);
        Matcher matcher = pattern.matcher(arg);
        return matcher.matches();

    }

    public String great(String fullName){
        Random random = new Random();
        String[] prolog = {"Good morning, ", "Gratings, ", "Hello, ", "Hi! "};
        String[] epilog = {", I'm glad to meet you!", ", nice to meet you", ", have a nice day", ". How are you?"};

        return prolog[random.nextInt(0, prolog.length)] + fullName + epilog[random.nextInt(0, epilog.length)];
    }

    public String scan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name and last name:");
        String input = scanner.nextLine();
        if(isValid(input)){
            scanner.close();
            return input.replaceAll(" +", " ");
        } else {
            System.out.println("You've entered wrong value, please try again");
            return scan();
        }
    }
}
