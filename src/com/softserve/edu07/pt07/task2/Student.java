package com.softserve.edu07.pt07.task2;

public class Student extends Person {

    private static final String TYPE_PERSON = "Студент";

    public Student(String name) {
        super(name);
        System.out.println("Тип особистості: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("Я студент, моє ім'я: " + getName());
    }
}
