package com.softserve.edu07.pt07.task2;

public class Teacher extends Staff {

    private static final String TYPE_PERSON = "Вчитель";

    public Teacher(String name) {
        super(name);
        System.out.println("Тип особистості: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("Я вчитель, моє ім'я: " + getName());
    }

    @Override
    public double salary() {
        return 50000.0;
    }
}
