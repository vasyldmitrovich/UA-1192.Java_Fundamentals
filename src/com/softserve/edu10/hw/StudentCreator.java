package com.softserve.edu10.hw;

import java.util.Random;

public class StudentCreator {

    public static Student create(){
        String[] firstNames = new String[]{"James", "Michael", "Robert", "John", "David", "William", "Richard",
                "Mary", "Patricia", "Jenifer", "Linda", "Elizabeth", "Barbara", "Susan"};
        String[] lastNames = new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Theta", "Omicron", "Sigma", "Tau", "Iota", "Mu", "Omega"};
        Random random = new Random();

        String name = lastNames[random.nextInt(0, lastNames.length - 1)] + " " + firstNames[random.nextInt(0, firstNames.length - 1)];
        return new Student(name, random.nextInt(1, 5));
    }
}
