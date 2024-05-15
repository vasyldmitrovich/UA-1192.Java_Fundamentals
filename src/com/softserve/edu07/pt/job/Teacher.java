package com.softserve.edu07.pt.job;

public class Teacher extends Staff {

    public static final PersonType TYPE_PERSON = PersonType.TEACHER;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        sayIAm();
        System.out.println(TYPE_PERSON.getType());
    }

    @Override
    public void salary() {
        System.out.printf("Teacher's salary: %.2f%n", salary);
    }

}
