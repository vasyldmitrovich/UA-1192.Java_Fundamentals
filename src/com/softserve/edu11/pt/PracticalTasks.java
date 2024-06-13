package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTasks {
    private final String GAP = "_".repeat(60);
    private final String NL = "\n";
    private final Scanner SCANNER = new Scanner(System.in);

    public void practicalOne() {
        String pattern = "Hard work beats talent when talent doesn't work hard.";
        String text = "Hard work beats talent";
        Pattern thispattern = Pattern.compile("[\\w\\s]");
        Matcher matcher = thispattern.matcher(text);
        System.out.println(matcher.find());
        matcher.reset();
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()) + " ");
        }
        System.out.println(NL);
    }

    public void practicalTwo() {
        run();
    }

    public void run() {
        String lastName = takeLastName();
        String firstName = takeFirstName();
        String middleName = takeMiddleName();
        lastPlusInitials(lastName, firstName, middleName);
        firstNPlusLastN(firstName, lastName);
        firstNMidNLastN(firstName, middleName, lastName);
    }

    public void practicalThree() {
        String[] names = {"User_User", "U_U", "User045", "Uuuussseeeeerrrr_112345",
                "Rostyslav_Kushpit", "Rostyk_Kushpit", "Us3R!_Us", "!@#$_$%^&", "Student1", "Uu"};
        for (var name : names) {
            nameCheck(name);
        }
    }

    public void nameCheck(String name) {
        String namePattern = "^\\w{3,15}$";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("Name: " + name + " - Validation [OK]");
        } else System.out.println("Name: " + name + " - Validation [ERROR]");
    }

    public void lastPlusInitials(String lastName, String firstName, String middleName) {
        String lNPIPattern = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase() +
                " " + firstName.substring(0, 1).toUpperCase() + "." +
                middleName.substring(0, 1).toUpperCase() + ".";
        Pattern pattern = Pattern.compile("[\\w\\s\\S]+");
        Matcher matcher = pattern.matcher(lNPIPattern);
        while (matcher.find()) {
            System.out.println(GAP + NL + "Pattern lastname + initials:\n" +
                    lNPIPattern.substring(matcher.start(), matcher.end()) + NL + GAP);
        }
    }

    public void firstNPlusLastN(String firstName, String lastName) {
        String fNLNPattern = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        Pattern pattern = Pattern.compile("[\\w\\s]+");
        Matcher matcher = pattern.matcher(fNLNPattern);
        while (matcher.find()) {
            System.out.println("Pattern firstname + lastname:\n" +
                    fNLNPattern.substring(matcher.start(), matcher.end()) + NL + GAP);
        }
    }

    public void firstNMidNLastN(String firstName, String middleName, String lastName) {
        String fNMNLNPattern = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() +
                " " + middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase() +
                " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        Pattern pattern = Pattern.compile("[\\w\\s]+");
        Matcher matcher = pattern.matcher(fNMNLNPattern);
        while (matcher.find()) {
            System.out.println("Pattern firstname + middle name + lastname:\n" +
                    fNMNLNPattern.substring(matcher.start(), matcher.end()) + NL + GAP);
        }
    }

    public String takeFirstName() {
        System.out.println("Input your firstname: ");
        return SCANNER.nextLine();
    }

    public String takeLastName() {
        System.out.println("Input your lastname: ");
        return SCANNER.nextLine();
    }

    public String takeMiddleName() {
        System.out.println("Input your middle name: ");
        return SCANNER.nextLine();
    }
}
