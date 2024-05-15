package com.softserve.edu07.pt.job;

public class Cleaner extends Staff {

    public static final PersonType TYPE_PERSON = PersonType.CLEANER;

    public Cleaner(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        sayIAm();
        System.out.println(TYPE_PERSON.getType());
    }

    @Override
    public void salary() {
        System.out.printf("Cleaner's salary: %.2f%n", salary);
    }

}
